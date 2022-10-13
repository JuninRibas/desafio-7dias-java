package quarto_dia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JLabel lblSoma;
	private JTextField num1;
	private JTextField num2;
	private JButton btnSoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum1 = new JLabel("Número 1");
		lblNum1.setBounds(58, 31, 57, 14);
		contentPane.add(lblNum1);
		
		lblNum2 = new JLabel("Número 2");
		lblNum2.setBounds(58, 80, 46, 14);
		contentPane.add(lblNum2);
		
		lblSoma = new JLabel("SOMA");
		lblSoma.setBounds(58, 128, 46, 14);
		contentPane.add(lblSoma);
		
		num1 = new JTextField();
		num1.setBounds(123, 28, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(123, 77, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		btnSoma = new JButton("Somar");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nume1 = num1.getText();
				String nume2 = num2.getText();
				
				Integer numero1 = Integer.valueOf(nume1);
				Integer numero2 = Integer.valueOf(nume2);
				
				
				Integer soma = calcSoma(numero1,numero2);
				JOptionPane.showMessageDialog(null,"A soma dos números é: "+soma);
				
			}

			private Integer calcSoma(Integer numero1, Integer numero2) {
				Integer soma = numero1 + numero2;
				return soma;
			}

		});
		btnSoma.setBounds(120, 124, 89, 23);
		contentPane.add(btnSoma);
	}
}
