package horários.app;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class BigGuyPanel extends JPanel {
	
	public static int width = 720;
	public static int height = 256;
	public CardLayout layout;
	public HoráriosPanel horários;
	DetalhesAula mat01353, mat01375, inf01107, inf05008, inf01202;
	public DetalhesAula[] matérias;
	
	public BigGuyPanel() {
		
		layout = new CardLayout();
		horários = new HoráriosPanel(this);
		
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
		this.setLayout(layout);
		
		this.add(horários, "horários");
		
		mat01353 = new DetalhesAula("MAT01353", this);
		mat01375 = new DetalhesAula("MAT01375", this);
		inf01107 = new DetalhesAula("INF01107", this);
		inf05008 = new DetalhesAula("INF05008", this);
		inf01202 = new DetalhesAula("INF01202", this);
		
		matérias = new DetalhesAula[5];
		matérias[0] = mat01353;
		matérias[1] = mat01375;
		matérias[2] = inf01107;
		matérias[3] = inf05008;
		matérias[4] = inf01202;
		
		for(DetalhesAula matéria : matérias) {
			
			this.add(matéria, matéria.tipo);
			
		}
		
		layout.show(this, "horários");
		this.setVisible(true);
		
	}
	
	public void swap(String Período) {
		
		layout.show(this, Período);
		
	}

}
