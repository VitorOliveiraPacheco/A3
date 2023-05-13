package A3;

import javax.swing.JOptionPane;

public class Cliente extends Cadastro {

	private String cpf;
	
	Cliente (){
	}
    Cliente(String nome, String endereco, String email, String telefone, String cpf, String numRegistro) {
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
    
    public void mostrarcliente() {
    	JOptionPane.showMessageDialog(null, "☰ Olá, " + this.getNome() + ", este é o seu cadastro: \n ▶ Nome: " + this.getNome() + 
    			"\n ▶ Endereço: " + this.getEndereco() + "\n ▶ Email: " + this.getEmail() + "\n ▶ Telefone: " + this.getTelefone() + "\n ▶ CPF: " + this.getCpf());	
    }
}