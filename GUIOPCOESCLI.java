package A3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;

public class GUIOPCOESCLI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Cliente cli = new Cliente();

	public static void main(String[] args) {
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
	
	public GUIOPCOESCLI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escola a opção desejada:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 66, 434, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Agendar Veterinário");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vacina vacina = new Vacina();
				JOptionPane.showMessageDialog(null,"Antes de prosseguirmos, aqui vai uma informação: \n ➤Todas as nossas consultas possuem um valor fixo de R$ 50,00!");
				vacina.setvacina (Integer.parseInt(JOptionPane.showInputDialog("A consulta será com vacina ou sem?: \n-> 1- Com vacina \n-> 2- Sem vacina")));
				switch(vacina.getvacina()) {
				case 1: {
					int raca = Integer.parseInt(JOptionPane.showInputDialog("Seu pet é: \n1- Cachorro \n2- Gato"));
					switch (raca) {
						case 1: {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										GUIVACINADOG frame = new GUIVACINADOG();
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						}
						case 2: {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										GUIVACINACAT frame = new GUIVACINACAT();
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						}
					}
					break;
				}
				case 2:{
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								GUIVET frame = new GUIVET();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
				});
					break;
				}
				}
			}
		});
		btnNewButton.setBounds(130, 111, 168, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAgendarPetshop = new JButton("Agendar PetShop");
		btnAgendarPetshop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUIPET frame = new GUIPET();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAgendarPetshop.setBounds(130, 145, 168, 23);
		contentPane.add(btnAgendarPetshop);
		
		String cpf = "10239303903";
		
		JButton btnVerPerfil = new JButton("Ver perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = ("SELECT * FROM cliente Where cpf='" + cpf + "'");
		        ConectaBanco factory = new ConectaBanco();
		        try (Connection c = factory.obtemConexao()){
		            PreparedStatement ps = c.prepareStatement(sql);
		            ResultSet rs = ps.executeQuery();
		            while (rs.next()){
		            	String nome = rs.getString("nome");
		                String endereco = rs.getString("endereco");
		                String email = rs.getString("email");
		                String telefone = rs.getString("telefone");

		                String aux = String.format(
		                    "Nome: %s \nEndereço: %s \nEmail: %s \nTelefone: %s ",
		                    nome,
		                    endereco,
		                    email,
		                    telefone
		                );
		                JOptionPane.showMessageDialog (null, aux);
		                       
		            }
		        }
		            catch (Exception w){
		            w.printStackTrace();
		        }
		        String sql_1 = ("SELECT * FROM animal Where cpf='" + cpf + "'");
		        ConectaBanco factory_1 = new ConectaBanco();
		        try (Connection c = factory_1.obtemConexao()){
		            PreparedStatement ps = c.prepareStatement(sql_1);
		            ResultSet rs = ps.executeQuery();
		            while (rs.next()){
		                String nomepet = rs.getString("nomepet");
		                String raca = rs.getString("raca");
		                String porte = rs.getString("porte");
		                String idade = rs.getString("idade");
		                String peso = rs.getString("peso");
		                String vacina = rs.getString("vacina");

		                String aux = String.format(
		                    "Nome do Pet: %s \nRaça: %s \nPorte: %s \nIdade: %s \nPeso: %s \nVacina: %s",
		                    nomepet,
		                    raca,
		                    porte,
		                    idade,
		                    peso,
		                    vacina
		                );
		                JOptionPane.showMessageDialog (null, aux);         
		            }
		        }
		            catch (Exception w){
		            w.printStackTrace();
		        }
			}
		});
		btnVerPerfil.setBounds(130, 181, 168, 23);
		contentPane.add(btnVerPerfil);
	}
}