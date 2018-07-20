package WordCountPackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCount extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3900047086227801712L;
	private JPanel contentPane;
	private JTextField textFieldText;
	private JTextField textFieldTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCount frame = new WordCount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WordCount() {
		setTitle("Word Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 563, 392);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblText = new JLabel("Your text");
		lblText.setFont(new Font("Georgia", Font.BOLD, 15));
		lblText.setHorizontalAlignment(SwingConstants.LEFT);
		lblText.setBounds(59, 91, 100, 64);
		panel.add(lblText);
		
		textFieldText = new JTextField();
		textFieldText.setToolTipText("");
		textFieldText.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textFieldText.setBounds(169, 63, 329, 123);
		panel.add(textFieldText);
		textFieldText.setColumns(20);
		
		JButton btnCount = new JButton("Count words");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = textFieldText.getText();
				int wordCount = 1;
				
				for (int i = 0; i < text.length(); i++) {
					
					if(text.charAt(i) == ' ') 
						wordCount++;
				}
				textFieldTotal.setText(" " + wordCount);
			}
		});
		btnCount.setFont(new Font("Georgia", Font.BOLD, 20));
		btnCount.setBounds(169, 208, 329, 38);
		panel.add(btnCount);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(170, 257, 88, 38);
		panel.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total words");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Georgia", Font.BOLD, 15));
		lblTotal.setBounds(67, 257, 93, 38);
		panel.add(lblTotal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldText.setText("");
				textFieldTotal.setText("");
			}
		});
		btnClear.setFont(new Font("Georgia", Font.BOLD, 15));
		btnClear.setBounds(169, 314, 88, 38);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Georgia", Font.BOLD, 15));
		btnExit.setBounds(409, 314, 89, 38);
		panel.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Word Count Tool");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_2.setBounds(67, 11, 431, 41);
		panel.add(lblNewLabel_2);
	}
}
