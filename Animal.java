package A3;

import javax.swing.JOptionPane;

public class Animal {
	
	private String nomepet;
	private String raca;
	private String porte;
	private double peso;
	private int idade;
	
	Animal(){
	}
	Animal (String nomepet, String raca, String porte, double peso, int idade) {
		this.nomepet = nomepet;
		this.raca= raca;
		this.porte= porte;
		this.peso= peso;
		this.idade= idade;
	}
	public String getnomepet() {
		return nomepet;
	}

	public void setnomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostraranimal() {
    	JOptionPane.showMessageDialog(null, "☰ Dados sobre o seu pet: \n" + this.getnomepet() + "\n ▶ Nome: " + this.getRaca() + 
    			"\n ▶ Porte: " + this.getPorte() + "\n ▶ Idade: " + this.getIdade() + " anos \n ▶ Peso: " + this.getPeso()+" kg ");	
	}
	
}
