package horários.app;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Aula extends JButton {
	
	public String tipo;
	DetalhesAula matéria;
	
	public Aula(String text, ActionListener listener) {
		
		this.setText(text);
		if(text != null) tipo = text;
		this.addActionListener(listener);
		
	}

}
