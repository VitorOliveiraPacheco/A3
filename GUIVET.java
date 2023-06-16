package A3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;

public class GUIVET extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomepet;
	
	AgendamentoVeterinario agendvet = new AgendamentoVeterinario();
	
	public static void main(String[] args) {
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
	}

	public GUIVET() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione o dia e horário desejado:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 11, 434, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do Pet:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(112, 287, 104, 14);
		contentPane.add(lblNewLabel_1_1);
		
		nomepet = new JTextField();
		nomepet.setColumns(10);
		nomepet.setBounds(225, 284, 104, 20);
		contentPane.add(nomepet);

		JCheckBox chckbxNewCheckBox = new JCheckBox("03/07/23- Segunda-Feira");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.setdiavet("2023/07/03");
			}
		});
		chckbxNewCheckBox.setBounds(6, 32, 182, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("8:00 hrs");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("8_AM");
			}
		});
		chckbxNewCheckBox_1.setBounds(26, 58, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("9:00 hrs");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("9_AM");
			}
		});
		chckbxNewCheckBox_2.setBounds(26, 84, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("10:00 hrs");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("10_AM");
			}
		});
		chckbxNewCheckBox_3.setBounds(26, 110, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("11:00 hrs");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("11_AM");
			}
		});
		chckbxNewCheckBox_4.setBounds(26, 136, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("04/07/23 - Terça-Feira");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.setdiavet("2023/07/04");
			}
		});
		chckbxNewCheckBox_5.setBounds(241, 32, 182, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("8:00 hrs");
		chckbxNewCheckBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("8_AM");
			}
		});
		chckbxNewCheckBox_6.setBounds(268, 58, 97, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("10:00 hrs");
		chckbxNewCheckBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("10_AM");
			}
		});
		chckbxNewCheckBox_7.setBounds(268, 84, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("05/07/23 - Quarta-Feira");
		chckbxNewCheckBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.setdiavet("2023/07/05");
			}
		});
		chckbxNewCheckBox_8.setBounds(6, 162, 182, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("8:00 hrs");
		chckbxNewCheckBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("8_AM");
			}
		});
		chckbxNewCheckBox_9.setBounds(26, 188, 97, 23);
		contentPane.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("06/07/23 - Quinta-Feira");
		chckbxNewCheckBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.setdiavet("2023/07/06");
			}
		});
		chckbxNewCheckBox_10.setBounds(241, 162, 182, 23);
		contentPane.add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("8:00 hrs");
		chckbxNewCheckBox_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("8_AM");
			}
		});
		chckbxNewCheckBox_11.setBounds(268, 188, 97, 23);
		contentPane.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("10:00 hrs");
		chckbxNewCheckBox_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("10_AM");
			}
		});
		chckbxNewCheckBox_12.setBounds(268, 214, 97, 23);
		contentPane.add(chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("11:00 hrs");
		chckbxNewCheckBox_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendvet.sethoravet("11_AM");
			}
		});
		chckbxNewCheckBox_13.setBounds(268, 240, 97, 23);
		contentPane.add(chckbxNewCheckBox_13);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	        String sql = ("update agendVET set " + agendvet.gethoravet() + " = ? where dia = '" + agendvet.getdiavet() + "'");
	        ConectaBanco factory = new ConectaBanco();
	        try (Connection c = factory.obtemConexao()){
	            PreparedStatement ps = c.prepareStatement(sql);
	            ps.setNString(1, nomepet.getText());
	            ps.execute(); 
	           
			JOptionPane.showMessageDialog (null, "Agendamento realizado!");
	        }
	        catch (Exception w){
	            w.printStackTrace();
	        }
	        
	        EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GUIFORMPAG frame = new GUIFORMPAG();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	        agendvet.setvalorconsulta (50);
		}
		});
		btnNewButton.setBounds(170, 315, 141, 23);
		contentPane.add(btnNewButton);
	}
}
