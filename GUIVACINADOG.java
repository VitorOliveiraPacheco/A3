package A3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class GUIVACINADOG extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
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
	
	public GUIVACINADOG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe a vacina desejada:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 31, 434, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton buttonGroupRadioButtons = new JRadioButton("Múltipla canina");
		buttonGroup.add(buttonGroupRadioButtons);
		buttonGroupRadioButtons.setBounds(56, 110, 133, 23);
		contentPane.add(buttonGroupRadioButtons);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Polivalente V10 ou V8 ");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(261, 110, 167, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnNewButton.setBounds(160, 227, 116, 23);
		contentPane.add(btnNewButton);
	}
}

