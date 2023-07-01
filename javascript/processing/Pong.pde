// Variáveis
  float opY = 0; // Posição Y do oponente
  float so = 10; // Velocidade do oponente
  float bX = 320; // Posição X da bola
  float bY = 180; // Posição Y da bola
  float maxs = 3; // Velocidade máxima da bola
  float mins = 2; // Velocidade mínima da bola
  float sbX = random(-maxs, maxs); // Velocidade X da bola
  float sbY = random(-maxs, maxs); // Velocidade Y da bola
  float hplayer = 75; // Altura do jogador
  float hop = 75; // Altura do oponente
  float dist = 20; // Distância da borda horizontal
  float r = 10; // raio da bola
  float wplayer = 15; // Largura do jogador
  float wop = 15; // Largura do oponente
  int ppoints; // Pontos do player
  int opoints; // Pontos do oponente

// Função que permite escolha da dificuldade
  void dificuldade(float lvl) {
      hop = 15*lvl;
      so = 3*lvl * so/abs(so);
  };

// Tela
  void setup() {
  size(640, 360);
  }

void draw() {
  
// Y do jogador
  float playerY = mouseY - 35;

// Fundo
  background(0);

// Texto dos pontos
  textSize(50);
  text(ppoints, 100, 50);
  text(opoints, 540, 50);

// Jogadores e bola
  rect(dist, playerY, wplayer, hplayer);
  rect(625 - dist, opY, wop, hop);
  ellipse(bX, bY, 2*r, 2*r);

// Posições
  opY += so;
  bX += sbX;
  bY += sbY;

// Velocidade op inverte quando uma borda é atingida
  if (opY >= 360 - hop) {  
    so *= -1;
  } if (opY <= 0) {  
    so *= -1;
  }

//Velocidade bola inverte quando defendida 
  if (bX <= dist + r + wplayer && bX >= dist && bY > playerY && bY < playerY + hplayer) {
    maxs++;
    mins+=0.5;
    sbX=random(mins, maxs);
  } if (bX >= 640 - dist - wop - r && bX <= 640 - dist && bY > opY && bY < opY + hop) {
      maxs++;
      mins+=0.5;
      sbX=random(-maxs, -mins);
  }

//Y bola inverte em teto, chão
  if (bY >= 360 - r) {  
    sbY *= -1;
  } if (bY <= r) {  
      sbY *= -1;
  }

// Pontuação e reinício
  if (bX < 0) {
    opoints++;
    bX = 320;
    bY = 180;
    maxs = 3;
    mins = 2;
    sbX = random(-maxs, -mins);
    sbY = random(-maxs, maxs);
  } if (bX > 640) {
      ppoints++;
      bX = 320;
      bY = 180;
      maxs = 3;
      mins = 2;
      sbX = random(mins, maxs);
      sbY = random(-maxs, maxs);
  }

// Dificuldades
  if (keyPressed) {
      if (key=='1') {
      dificuldade(1);
    } if (key=='2') {
      dificuldade(2);
    } if (key=='3') {
      dificuldade(3);
    } if (key=='4') {
      dificuldade(4);
    } if (key=='5') {
      dificuldade(5);
    } if (key=='6') {
      dificuldade(6);
    } if (key=='7') {
      dificuldade(7);
    } if (key=='8') {
      dificuldade(8);
    } if (key=='9') {
      dificuldade(9);
    } if (key=='0') {
      dificuldade(10);
    }
}
}
