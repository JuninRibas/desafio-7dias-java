package quinto_dia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(92, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(287, 11, 46, 14);
		contentPane.add(lblNewLabel_1);

		num1 = new JTextField();
		num1.setForeground(Color.RED);
		num1.setBounds(73, 31, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);

		num2 = new JTextField();
		num2.setForeground(Color.RED);
		num2.setBounds(265, 31, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);

		JButton btnSoma = new JButton("+");
		btnSoma.setForeground(Color.BLUE);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer nume1 = Integer.valueOf(num1.getText());
				Integer nume2 = Integer.valueOf(num2.getText());

				Integer soma = calcSoma(nume1, nume2);
				JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
			}

			private Integer calcSoma(Integer nume1, Integer nume2) {
				Integer soma = nume1 + nume2;
				return soma;
			}
		});
		btnSoma.setBounds(70, 108, 89, 23);
		contentPane.add(btnSoma);

		JButton btnDivisao = new JButton("/");
		btnDivisao.setForeground(Color.BLUE);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Float nume1 = Float.valueOf(num1.getText());
				Float nume2 = Float.valueOf(num2.getText());

				Float divisao = calcDivisao(nume1, nume2);
				JOptionPane.showMessageDialog(null, "A divisão dos números é: " + divisao);
			}

			private Float calcDivisao(Float nume1, Float nume2) {
				Float divisao = nume1 / nume2;
				return divisao;
			}
		});
		btnDivisao.setBounds(70, 198, 89, 23);
		contentPane.add(btnDivisao);

		JButton btnMenos = new JButton("-");
		btnMenos.setForeground(Color.BLUE);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer nume1 = Integer.valueOf(num1.getText());
				Integer nume2 = Integer.valueOf(num2.getText());

				Integer menos = calcMenos(nume1, nume2);
				JOptionPane.showMessageDialog(null, " A subtração dos números é: " + menos);
			}

			private Integer calcMenos(Integer nume1, Integer nume2) {
				Integer menos = nume1 - nume2;
				return menos;
			}
		});
		btnMenos.setBounds(265, 108, 89, 23);
		contentPane.add(btnMenos);

		JButton btnVezes = new JButton("*");
		btnVezes.setForeground(Color.BLUE);
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer nume1 = Integer.valueOf(num1.getText());
				Integer nume2 = Integer.valueOf(num2.getText());

				Integer vezes = calcVezes(nume1, nume2);
				JOptionPane.showMessageDialog(null, "A multiplicação dos números é: " + vezes);
			}

			private Integer calcVezes(Integer nume1, Integer nume2) {
				Integer vezes = nume1 * nume2;
				return vezes;
			}
		});
		btnVezes.setBounds(262, 198, 89, 23);
		contentPane.add(btnVezes);
	}
}
