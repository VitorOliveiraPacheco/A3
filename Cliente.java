package A3;

import javax.swing.JTextField;

public class Cliente {

	private JTextField cpf;
	private JTextField nome;
    private JTextField endereco;
    private JTextField email;
    private JTextField telefone;

	Cliente (){
	}
    Cliente(JTextField nome, JTextField endereco, JTextField email, JTextField telefone, JTextField cpf) {
		this.cpf = cpf;
		this.nome= nome;
		this.endereco= endereco;
		this.email= email;
		this.telefone= telefone;
	}
    
	public JTextField getcpf () {
        return cpf;
    }
    public JTextField setcpf (JTextField cpf) {
        return this.cpf= cpf;
    }
	public JTextField getnome() {
		return nome;
	}
	public JTextField setnome(JTextField nome) {
		return this.nome = nome;
	}
	public JTextField getendereco() {
		return endereco;
	}
	public JTextField setendereco(JTextField endereco) {
		return this.endereco = endereco;
	}
	public JTextField getemail() {
		return email;
	}
	public JTextField setemail(JTextField email) {
		return this.email = email;
	}
	public JTextField gettelefone() {
		return telefone;
	}
	public JTextField settelefone(JTextField telefone) {
		return this.telefone = telefone;
	}
}

