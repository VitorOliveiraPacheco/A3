package A3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUICADASTROCLI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField nome;
	private JTextField endereco;
	private JTextField email;
	private JTextField telefone;
	
	Cliente cli = new Cliente();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICADASTROCLI frame = new GUICADASTROCLI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUICADASTROCLI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Por favor, insira as informações para prosseguirmos com seu cadastro:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 56, 138, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOME:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 87, 138, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENDEREÇO:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(10, 118, 138, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("E-MAIL:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(10, 149, 138, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("TELEFONE:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setBounds(10, 180, 138, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		cpf = new JTextField();
		cli.setcpf(cpf).setBounds(158, 53, 120, 20);
		contentPane.add(cli.setcpf(cpf));
		cli.setcpf(cpf).setColumns(10);
		
		nome = new JTextField();
		cli.setnome(nome).setColumns(10);
		cli.setnome(nome).setBounds(158, 84, 168, 20);
		contentPane.add(cli.setnome(nome));
		
		endereco = new JTextField();
		cli.setendereco(endereco).setColumns(10);
		cli.setendereco(endereco).setBounds(158, 115, 168, 20);
		contentPane.add(cli.setendereco(endereco));
		
		email = new JTextField();
		cli.setemail(email).setColumns(10);
		cli.setemail(email).setBounds(158, 146, 168, 20);
		contentPane.add(cli.setemail(email));
		
		telefone = new JTextField();
		cli.settelefone(telefone).setColumns(10);
		cli.settelefone(telefone).setBounds(158, 177, 120, 20);
		contentPane.add(cli.settelefone(telefone));
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String sql = "INSERT INTO cliente (cpf, nome, endereco, email, telefone) VALUES (?,?,?,?,?)";
			ConectaBanco factory = new ConectaBanco();
	        try (Connection c = factory.obtemConexao()){
		        PreparedStatement ps = c.prepareStatement(sql);
				ps.setString(1, cpf.getText());
				ps.setString(2, nome.getText());
				ps.setString(3, endereco.getText());
				ps.setString(4, email.getText());
				ps.setString(5, telefone.getText());
				ps.execute();
				JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
			}catch (Exception w){
				w.printStackTrace();
			}
			cpf.setText("");
			nome.setText("");  
			endereco.setText("");
			email.setText("");
			telefone.setText("");
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GUICADASTROANI frame = new GUICADASTROANI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		});
		}
		});
		btnNewButton.setBounds(158, 227, 100, 23);
		contentPane.add(btnNewButton);
	}

}
