
public class Animal {

	private String raca;
	private String porte;
	private double peso;
	private int idade;
	
	Animal (String raca, String porte, double peso, int idade) {
		this.raca= raca;
		this.porte= porte;
		this.peso= peso;
		this.idade= idade;
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
	
}
