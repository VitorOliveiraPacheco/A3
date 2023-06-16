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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GUILOGINADMIN extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField adm;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILOGINADMIN frame = new GUILOGINADMIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Admin admin = new Admin();
	
	public GUILOGINADMIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsiraSeuN = new JLabel("Insira seu N° de Registro:");
		lblInsiraSeuN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInsiraSeuN.setBounds(43, 103, 151, 14);
		contentPane.add(lblInsiraSeuN);
		
		adm = new JTextField();
		admin.setnumregistro(adm).setBounds(204, 100, 151, 20);
		contentPane.add(admin.setnumregistro(adm));
		admin.setnumregistro(adm).setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Olá, Adm! Por favor, faça o login:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 434, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String sql = ("SELECT * FROM administrador Where numreg= ?");
		        ConectaBanco factory = new ConectaBanco();
		        try (Connection c = factory.obtemConexao()){
		            PreparedStatement ps = c.prepareStatement(sql);
		            ps.setString(1, adm.getText());
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
							GUIOPCOESADM frame = new GUIOPCOESADM();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(165, 214, 113, 23);
		contentPane.add(btnNewButton);
	}
}



