package A3;

import javax.swing.JTextField;


public class Admin extends Cliente {

	private JTextField numregistro;
	private JTextField nome;

    Admin(){
    }
    Admin(JTextField nome, JTextField numregistro) {
		super();
		this.numregistro = numregistro;
		this.nome= nome;
	}

    public JTextField getnumregistro() {
		return numregistro;
	}
	public JTextField setnumregistro(JTextField numregistro) {
		return this.numregistro = numregistro;
	}
	public JTextField getnome() {
		return nome;
	}
	public JTextField setnome(JTextField nome) {
		return this.nome = nome;
	}
}
