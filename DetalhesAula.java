package horários.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DetalhesAula extends JPanel implements ActionListener {
	
	JButton backButton;
	String tipo;
	BigGuyPanel dad;
	JTextArea info;
	
	DetalhesAula(String tipo, BigGuyPanel dad) {
		
		this.dad = dad;
		this.tipo = tipo;
		
		this.setPreferredSize(new Dimension(BigGuyPanel.width, BigGuyPanel.height));
		this.setBackground(Color.WHITE);
		
		backButton = new JButton("↩");
		backButton.addActionListener(this);
		
		String filePath = "src/appMain/info/" + tipo + ".txt";
		
		info = new JTextArea();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

			ArrayList<String> lines = new ArrayList<>();
			
			String line = br.readLine();

			while (line != null) {

				info.append(line + "\n" + "\n");
				line = br.readLine();

			}
			
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		this.add(backButton);

		this.add(info);
		
		this.setOpaque(true);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton) {
			
			dad.swap("horários");
			
		}

	}

}
