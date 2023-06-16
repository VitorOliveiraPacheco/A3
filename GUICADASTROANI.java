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

public class GUICADASTROANI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomepet;
	private JTextField raca;
	private JTextField porte;
	private JTextField idade;
	private JTextField peso;
	private JTextField vacina;
	
	Cliente cli = new Cliente();
	Animal ani = new Animal();

	public static void main(String[] args) {
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

	public GUICADASTROANI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira as informações sobre seu pet:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME PET:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(0, 39, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RAÇA:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(0, 64, 142, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PORTE:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(0, 91, 142, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("IDADE:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(0, 116, 142, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PESO:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setBounds(0, 145, 142, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("VACINA (Sim/Não):");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setBounds(0, 170, 142, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		nomepet = new JTextField();
		ani.setnomepet(nomepet).setBounds(152, 36, 154, 20);
		contentPane.add(ani.setnomepet(nomepet));
		ani.setnomepet(nomepet).setColumns(10);
		
		raca = new JTextField();
		ani.setraca(raca).setColumns(10);
		ani.setraca(raca).setBounds(152, 61, 154, 20);
		contentPane.add(ani.setraca(raca));
		
		porte = new JTextField();
		ani.setporte(porte).setColumns(10);
		ani.setporte(porte).setBounds(152, 88, 154, 20);
		contentPane.add(ani.setporte(porte));
		
		idade = new JTextField();
		ani.setidade(idade).setColumns(10);
		ani.setidade(idade).setBounds(152, 115, 154, 20);
		contentPane.add(ani.setidade(idade));
		
		peso = new JTextField();
		ani.setpeso(peso).setColumns(10);
		ani.setpeso(peso).setBounds(152, 141, 154, 20);
		contentPane.add(ani.setpeso(peso));
		
		vacina = new JTextField();
		ani.setvacina(vacina).setColumns(10);
		ani.setvacina(vacina).setBounds(152, 168, 154, 20);
		contentPane.add(ani.setvacina(vacina));
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "INSERT INTO animal (nomepet, raca, porte, idade, peso, vacina, cpf) VALUES (?,?,?,?,?,?,'" + cli.getcpf() + "')";
				ConectaBanco factory = new ConectaBanco();
		        try (Connection c = factory.obtemConexao()){
			        PreparedStatement ps = c.prepareStatement(sql);
					ps.setString(1, nomepet.getText());
					ps.setString(2, raca.getText());
					ps.setString(3, porte.getText());
					ps.setString(4, idade.getText());
					ps.setString(5, peso.getText());
					ps.setString(6, vacina.getText());
					ps.execute();
					JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
				}catch (Exception w){
					w.printStackTrace();
				}
		        nomepet.setText("");
		        raca.setText("");  
		        porte.setText("");
		        idade.setText("");
		        peso.setText("");
		        vacina.setText("");
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
		btnNewButton.setBounds(162, 227, 111, 23);
		contentPane.add(btnNewButton);
	}

}
