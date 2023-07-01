#include "raylib.h"

#define HEIGHT 720
#define WIDTH 1280

int main() {
    
    int direction = 1;
    
    Texture2D sprite;
    Sound sound;
    Music music;
    
    InitWindow(WIDTH, HEIGHT,  "Teste");
    InitAudioDevice();
    SetTargetFPS(60);
    
    sprite = LoadTexture("res/gura.png");
    sound = LoadSound("snd/quack.ogg");
    music = LoadMusicStream("msc/pekora_bgm.mp3");
    PlayMusicStream(music);
        
    float posX = -sprite.width;
    
    while(!WindowShouldClose()) {
        
        if(IsKeyPressed(KEY_F)) {
            ToggleFullscreen();
        }
         
        posX += direction * 10;
        
        UpdateMusicStream(music);
        
        if(IsKeyPressed(KEY_SPACE)) {
            StopMusicStream(music);
            PlayMusicStream(music);            
        }
        
        if(IsMouseButtonPressed(MOUSE_BUTTON_LEFT)) {
            
            Rectangle spriteRectangle = {posX, 50, sprite.width, sprite.height};
            
            if(CheckCollisionPointRec(GetMousePosition(), spriteRectangle))
            PlaySound(sound);
        
        }
        
        if(posX > WIDTH) posX = -sprite.width;
        //else if(posX < -sprite.width) direction = 1;
        
        BeginDrawing();
        
            ClearBackground(RAYWHITE);
        
            //DrawRectangle(posX, 100, 100, 100, BLUE);
            DrawTexture(sprite, posX, 50, WHITE);
        
        EndDrawing();
        
    }
    
    StopMusicStream(music);
    CloseAudioDevice();
    CloseWindow();
    
}
