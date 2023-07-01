package horários.app;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class DiaHora extends JLabel {
	
	DiaHora(String title, String tipo) {
		
		this.setOpaque(true);
		this.setText(title);
		this.setForeground(Color.BLACK);
		this.setHorizontalAlignment(CENTER);
		
		switch(tipo) {
		
			case "dia":
				this.setBackground(Color.ORANGE);
				break;
			case "hora":
				this.setBackground(Color.GREEN);
				break;
			case "horário":
				this.setBackground(Color.LIGHT_GRAY);
				break;
		
		}

		this.setPreferredSize(new Dimension(BigGuyPanel.width / 6, BigGuyPanel.height / 5));
		
	}

}
