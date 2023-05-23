package A3;

public class Admin extends Cliente {

    private String numRegistro;
    
    Admin(){
    }
    Admin(String nome, String endereco, String email, String telefone, String cpf, String numRegistro) {
		super(nome, endereco, email, telefone, cpf);
		this.numRegistro = numRegistro;
		
	}
    public String getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}
	public Cliente[] getListaCliente (){
		return null;
        
        // metódo para listar
        // os clientes da petshop
    }
}
