package A3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;

public class GUIPET extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	public static void main(String[] args) {
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

	AgendamentoPet agendpet = new AgendamentoPet();
	
	public GUIPET() {
		AgendamentoPet pet = new AgendamentoPet();
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
		lblNewLabel_1_1.setBounds(108, 273, 104, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(222, 270, 104, 20);
		contentPane.add(textField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("05/07/23 - Quarta-Feira");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.setdiabanho("2023/07/05");
			}
		});
		chckbxNewCheckBox.setBounds(16, 62, 168, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("13:00 hrs");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("13_PM");
			}
		});
		chckbxNewCheckBox_1.setBounds(26, 86, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("14:00 hrs");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("14_PM");
			}
		});
		chckbxNewCheckBox_2.setBounds(26, 112, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("15:00 hrs");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("15_PM");
			}
		});
		chckbxNewCheckBox_3.setBounds(26, 138, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("17:00 hrs");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("17_PM");
			}
		});
		chckbxNewCheckBox_4.setBounds(26, 164, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("06/07/23 - Quinta-Feira");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.setdiabanho("2023/07/06");
			}
		});
		chckbxNewCheckBox_5.setBounds(258, 62, 168, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("14:00 hrs");
		chckbxNewCheckBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("14_PM");
			}
		});
		chckbxNewCheckBox_6.setBounds(269, 86, 97, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("15:00 hrs");
		chckbxNewCheckBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("15_PM");
			}
		});
		chckbxNewCheckBox_7.setBounds(269, 112, 97, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("16:00 hrs");
		chckbxNewCheckBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("16_PM");
			}
		});
		chckbxNewCheckBox_8.setBounds(269, 138, 97, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("07/07/23 - Sexta-Feira");
		chckbxNewCheckBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.setdiabanho("2023/07/07");
			}
		});
		chckbxNewCheckBox_9.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_9.setBounds(0, 188, 473, 23);
		contentPane.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("13:00 hrs");
		chckbxNewCheckBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendpet.sethorabanho("13_PM");
			}
		});
		chckbxNewCheckBox_10.setBounds(180, 214, 97, 23);
		contentPane.add(chckbxNewCheckBox_10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			pet.setValor(100);
	        String sql = ("update agendPET set " + agendpet.gethorabanho() + " = ? where dia = '" + agendpet.getdiabanho() + "'");
	        ConectaBanco factory = new ConectaBanco();
	        try (Connection c = factory.obtemConexao()){
	            PreparedStatement ps = c.prepareStatement(sql);
	            ps.setNString(1, textField.getText());
	            ps.execute(); 
	        }
	        catch (Exception w){
	            w.printStackTrace();
	        }
	        EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GUITOSA frame = new GUITOSA();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	        agendpet.setValor(40);
		}
		});
		btnNewButton.setBounds(170, 315, 141, 23);
		contentPane.add(btnNewButton);
	}
}
