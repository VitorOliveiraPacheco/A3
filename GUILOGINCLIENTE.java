package A3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUILOGINCLIENTE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cpf;
	private JTextField nome;
	
	Cliente cli = new Cliente();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILOGINCLIENTE frame = new GUILOGINCLIENTE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public GUILOGINCLIENTE() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(77, 96, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(98, 123, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		nome = new JTextField();
		cli.setnome(nome).setColumns(10);
		cli.setnome(nome).setBounds(155, 93, 147, 20);
		contentPane.add(cli.setnome(nome));
		
		cpf = new JTextField();
		cli.setcpf(cpf).setBounds(155, 120, 147, 20);
		cli.setcpf(cpf).setColumns(10);
		contentPane.add(cli.setcpf(cpf));
		
		JLabel lblNewLabel_2 = new JLabel("Insira as informações para acessar o seu cadastro:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 26, 434, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = ("SELECT * FROM cliente Where cpf= ?");
		        ConectaBanco factory = new ConectaBanco();
		        try (Connection c = factory.obtemConexao()){
		            PreparedStatement ps = c.prepareStatement(sql);
		            ps.setString(1, cpf.getText());
		            ResultSet rs = ps.executeQuery();
		            while (rs.next()){
		                String nome = rs.getString("nome");
		                String aux = String.format(
		                    "Bem vindo, %s! \nAcesso liberado! ",
		                    nome
		                );
		                JOptionPane.showMessageDialog (null, aux);
		            }
		        }
		            catch (Exception w){
		            w.printStackTrace();
		        }
		        EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIOPCOESCLI frame = new GUIOPCOESCLI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
			});
		btnNewButton.setBounds(165, 152, 102, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Não possui cadastro?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 209, 434, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Criar cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnNewButton_1.setBounds(141, 234, 147, 23);
		contentPane.add(btnNewButton_1);
	}
}
