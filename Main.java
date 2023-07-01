package horários.app;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		BigGuyPanel panelao = new BigGuyPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Grade de Horários");
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		window.add(panelao);
		window.pack();
		window.setVisible(true);

	}

}
