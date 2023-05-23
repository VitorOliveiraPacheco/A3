package A3;


public class Cliente extends Cadastro {

	private String cpf;
	private String nome;
    private String endereco;
    private String email;
    private String telefone;

	Cliente (){
	}
    Cliente(String nome, String endereco, String email, String telefone, String cpf) {
		super(nome, endereco, email, telefone, cpf);
		this.cpf = cpf;
		this.nome= nome;
		this.endereco= endereco;
		this.email= email;
		this.telefone= telefone;
	}
    
	public String getcpf () {
        return cpf;
    }
    public void setcpf (String cpf) {
        this.cpf= cpf;
    }
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

    // Nessa parte será feito um validador do CPF. 
    // Ele será utilizado para verificar  
    // se o CPF digitado é válido para ai sim usar o setCpf.

    public boolean verificarCpf () {
        
        //Parte funcional ainda não foi feita.
    
        return true;
    }
    /*public void mostrarcliente() {
    	JOptionPane.showMessageDialog(null, "☰ Olá, " + this.getNome() + ", este é o seu cadastro: \n ▶ Nome: " + this.getNome() + 
    			"\n ▶ Endereço: " + this.getEndereco() + "\n ▶ Email: " + this.getEmail() + "\n ▶ Telefone: " + this.getTelefone() + "\n ▶ CPF: " + this.getCpf());*/	



}

