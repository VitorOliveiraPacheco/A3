public class Cliente extends Cadastro {
   
   pivate String cpf;

   Cliente(String nome, String endereco, String email, String telefone, String cpf) {
	super(nome, endereco, email, telefone, cpf);
	this.cpf = cpf;	
    }
    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {

        this.cpf= cpf;

    }

    // Nessa parte será feito um validador do CPF. 
    // Ele será utilizado para verificar  
    // se o CPF digitado é válido para ai sim usar o setCpf.

    public boolean verificarCpf () {
        
        //Parte funcional ainda não foi feita.
    
        return true;

    }

    public void addClienteDB () {

        // metodo para adicionar a instância 
        // em uma tabela no banco de dados.

        //Parte funcional ainda não foi feita.

    }
}
