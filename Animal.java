package A3;

import javax.swing.JTextField;

public class Animal extends Cliente{

	private JTextField nomepet;
	private JTextField raca;
	private JTextField porte;
	private JTextField peso;
	private JTextField idade;
	private JTextField vacina;
	
	Animal(){
	}
	Animal (JTextField nomepet, JTextField raca, JTextField porte, JTextField peso, JTextField idade, JTextField vacina) {
		this.nomepet = nomepet;
		this.raca= raca;
		this.porte= porte;
		this.peso= peso;
		this.idade= idade;
		this.vacina= vacina;
	}
	public JTextField getnomepet() {
		return nomepet;
	}
	public JTextField setnomepet (JTextField nomepet) {
		return this.nomepet = nomepet;
	}
	public JTextField getraca() {
		return raca;
	}
	public JTextField setraca(JTextField raca) {
		return this.raca = raca;
	}
	public JTextField getporte() {
		return porte;
	}
	public JTextField setporte(JTextField porte) {
		return this.porte = porte;
	}
	public JTextField getpeso() {
		return peso;
	}
	public JTextField setpeso(JTextField peso) {
		return this.peso = peso;
	}
	public JTextField getidade() {
		return idade;
	}
	public JTextField setidade(JTextField idade) {
		return this.idade = idade;
	}
	public JTextField getvacina() {
		return vacina;
	}
	public JTextField setvacina(JTextField vacina) {
		return this.vacina = vacina;
	}
}
