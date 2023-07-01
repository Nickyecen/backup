package horários.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class HoráriosPanel extends JPanel implements ActionListener {
	
	BigGuyPanel dad;
	
	public Aula segunda1, segunda2, segunda3, segunda4,
		terça1, terça2, terça3, terça4,
		quarta1, quarta2, quarta3, quarta4,
		quinta1, quinta2, quinta3, quinta4,
		sexta1, sexta2, sexta3, sexta4;
	
	public Aula[] aulas;
	
	public HoráriosPanel(BigGuyPanel dad) {
		
		this.dad = dad;
		
		aulas = new Aula[20];
		
		segunda1 = new Aula("MAT01353", this);
		aulas[0] = segunda1;
		segunda2 = new Aula("INF01107", this);
		aulas[1] = segunda2;
		segunda3 = new Aula(null, this);
		aulas[2] = segunda3;
		segunda4 = new Aula(null, this);
		aulas[3] = segunda4;
		terça1 = new Aula("MAT01375", this);
		aulas[4] = terça1;
		terça2 = new Aula("INF05008", this);
		aulas[5] = terça2;
		terça3 = new Aula("INF01202", this);
		aulas[6] = terça3;
		terça4 = new Aula(null, this);
		aulas[7] = terça4;
		quarta1 = new Aula("MAT01353", this);
		aulas[8] = quarta1;
		quarta2 = new Aula("INF01107", this);
		aulas[9] = quarta2;
		quarta3 = new Aula(null, this);
		aulas[10] = quarta3;
		quarta4 = new Aula(null, this);
		aulas[11] = quarta4;
		quinta1 = new Aula("MAT01375", this);
		aulas[12] = quinta1;
		quinta2 = new Aula("INF05008", this);
		aulas[13] = quinta2;
		quinta3 = new Aula("INF01202", this);
		aulas[14] = quinta3;
		quinta4 = new Aula(null, this);
		aulas[15] = quinta4;
		sexta1 = new Aula("MAT01353", this);
		aulas[16] = sexta1;
		sexta2 = new Aula(null, this);
		aulas[17] = sexta2;
		sexta3 = new Aula("INF01202", this);
		aulas[18] = sexta3;
		sexta4 = new Aula(null, this);
		aulas[19] = sexta4;
		
		this.setPreferredSize(new Dimension(BigGuyPanel.width, BigGuyPanel.height));
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(5, 6));
		
		this.add(new DiaHora("Horário", "horário"));

		this.add(new DiaHora("Segunda-feira", "dia"));
		this.add(new DiaHora("Terça-feira", "dia"));
		this.add(new DiaHora("Quarta-feira", "dia"));
		this.add(new DiaHora("Quinta-feira", "dia"));
		this.add(new DiaHora("Sexta-feira", "dia"));
		
		this.add(new DiaHora("8:30 - 10:10", "hora"));
		
		this.add(segunda1);
		this.add(terça1);
		this.add(quarta1);
		this.add(quinta1);
		this.add(sexta1);
		
		this.add(new DiaHora("10:30 - 12:10", "hora"));
		
		this.add(segunda2);
		this.add(terça2);
		this.add(quarta2);
		this.add(quinta2);
		this.add(sexta2);
		
		this.add(new DiaHora("13:30 - 15:10", "hora"));
		
		this.add(segunda3);
		this.add(terça3);
		this.add(quarta3);
		this.add(quinta3);
		this.add(sexta3);
		
		this.add(new DiaHora("15:30 - 17:10", "hora"));
		
		this.add(segunda4);
		this.add(terça4);
		this.add(quarta4);
		this.add(quinta4);
		this.add(sexta4);
		
		this.setVisible(true);
		
	}
	
	public Aula[] getAulas() {
		return aulas;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(Aula aula : aulas) {
			
			if(e.getSource() == aula && aula.tipo != null) {
				
				dad.swap(aula.tipo);
				return;
				
			}
			
		}
		
	}

}
