package A3;

public class Animal extends Cliente{
	private String nomepet;
	private String raca;
	private String porte;
	private double peso;
	private int idade;
	private String vacina;
	Animal(){
	}
	Animal (String nomepet, String raca, String porte, double peso, int idade, String vacina) {
		this.nomepet = nomepet;
		this.raca= raca;
		this.porte= porte;
		this.peso= peso;
		this.idade= idade;
		this.vacina= vacina;
	}
	public String getnomepet() {
		return nomepet;
	}
	public void setnomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	public String getraca() {
		return raca;
	}
	public void setraca(String raca) {
		this.raca = raca;
	}
	public String getporte() {
		return porte;
	}
	public void setporte(String porte) {
		this.porte = porte;
	}
	public double getpeso() {
		return peso;
	}
	public void setpeso(double peso) {
		this.peso = peso;
	}
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	public String getvacina() {
		return vacina;
	}
	public void setvacina(String vacina) {
		this.vacina = vacina;
	}
}
