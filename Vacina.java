package A3;

import javax.swing.JOptionPane;

public class Vacina extends AgendamentoVeterinario {

	private String tipovacina;
	private int vlrconsulta = 50;
	private int vlrpolivalente = 80;
	private int vlrraiva = 50;
	private int vlrV= 80;
	
	Vacina(){
	}
	Vacina (String tipovacina, String diavet, String tipoconsulta, int vlrconsulta, int vlrpolivalente, int vlrraiva, int vlrV) {
		super(tipoconsulta, diavet, tipoconsulta);
		this.tipovacina= tipovacina;
		this.vlrconsulta = vlrconsulta;
		this.vlrpolivalente = vlrpolivalente;
		this.vlrraiva = vlrraiva;
		this.vlrV= vlrV;
	}

	public String getTipo() {
		return tipovacina;
	}

	public void setTipo(String tipovacina) {
		this.tipovacina = tipovacina;
	}
	
	public void valorconsulta() {
		JOptionPane.showMessageDialog(null, "O valor total ficará: \n R$ " + this.vlrconsulta + ",00! ");
	}
	
	public void valorpolivanteca() {
		JOptionPane.showMessageDialog(null, "O valor total ficará: \n R$ " + (this.vlrconsulta + this.vlrpolivalente)+ ",00! ");
	}
	
	public void valorraiva() {
		JOptionPane.showMessageDialog(null, "O valor total ficará: \n R$ " + (this.vlrconsulta + this.vlrraiva)+ ",00! ");
	}
	
	public void valorV() {
		JOptionPane.showMessageDialog(null, "O valor total ficará: \n R$ " + (this.vlrconsulta + this.vlrV)+ ",00! ");
	}
	
}
