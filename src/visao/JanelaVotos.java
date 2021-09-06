package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JanelaVotos extends JFrame {

	private JPanel contentPane;
	JButton buttonVotar;
	JRadioButton radioButtonCandidatoA;
	JRadioButton radioButtonCandidatoB;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaVotos frame = new JanelaVotos();
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
	public JanelaVotos() {
		setTitle("Janela de Vota\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 475);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelImagemCandidatoA = new JLabel("");
		labelImagemCandidatoA.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemCandidatoA.setIcon(new ImageIcon(JanelaVotos.class.getResource("/figuras/mulher.png")));
		labelImagemCandidatoA.setBounds(10, 26, 287, 217);
		contentPane.add(labelImagemCandidatoA);
		
		JLabel labelImagemCandidatoB = new JLabel("");
		labelImagemCandidatoB.setHorizontalAlignment(SwingConstants.CENTER);
		labelImagemCandidatoB.setIcon(new ImageIcon(JanelaVotos.class.getResource("/figuras/homem.png")));
		labelImagemCandidatoB.setBounds(318, 26, 287, 217);
		contentPane.add(labelImagemCandidatoB);
		
		radioButtonCandidatoA = new JRadioButton("Candidato - A");
		radioButtonCandidatoA.setBackground(Color.WHITE);
		radioButtonCandidatoA.setForeground(Color.BLACK);
		radioButtonCandidatoA.setBounds(106, 263, 127, 25);
		contentPane.add(radioButtonCandidatoA);
		
		radioButtonCandidatoB = new JRadioButton("Candidato - B");
		radioButtonCandidatoB.setForeground(Color.BLACK);
		radioButtonCandidatoB.setBackground(Color.WHITE);
		radioButtonCandidatoB.setBounds(418, 263, 127, 25);
		contentPane.add(radioButtonCandidatoB);
		
		buttonVotar = new JButton("Votar");
		buttonVotar.setActionCommand("votar");
		buttonVotar.setIcon(new ImageIcon(JanelaVotos.class.getResource("/figuras/ok1.png")));
		buttonVotar.setForeground(Color.BLACK);
		buttonVotar.setBackground(Color.WHITE);
		buttonVotar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonVotar.setBounds(154, 342, 269, 59);
		contentPane.add(buttonVotar);
	}
	
	public JButton getButtonVotar() {
		return buttonVotar;
	}

	public void setButtonVotar(JButton buttonVotar) {
		this.buttonVotar = buttonVotar;
	}

	public JRadioButton getRadioButtonCandidatoA() {
		return radioButtonCandidatoA;
	}

	public void setRadioButtonCandidatoA(JRadioButton radioButtonCandidatoA) {
		this.radioButtonCandidatoA = radioButtonCandidatoA;
	}

	public JRadioButton getRadioButtonCandidatoB() {
		return radioButtonCandidatoB;
	}

	public void setRadioButtonCandidatoB(JRadioButton radioButtonCandidatoB) {
		this.radioButtonCandidatoB = radioButtonCandidatoB;
	}
	
}
