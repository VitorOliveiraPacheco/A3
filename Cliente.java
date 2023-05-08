public class Cliente extends Cadastro {
   
    private String cpf;

    Cliente (String cpf, super(String nome, String endereco, String email, String telefone)) {

        this.cpf=cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;

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