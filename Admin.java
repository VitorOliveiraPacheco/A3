package A3;

public class Admin extends Cliente {

    private String numRegistro = null;
    
    Admin(){
    }
    Admin(String nome, String endereco, String email, String telefone, String cpf, String numRegistro) {
		super(nome, endereco, email, telefone, cpf);
		this.numRegistro = numRegistro;
		
	}
    public String getNumRegistro() {
		return numRegistro;
	}
	public String setNumRegistro(String numRegistro) {
		return this.numRegistro = numRegistro;
	}
}
