package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.VotoDAO;
import modelo.Voto;
import visao.JanelaVotos;

public class ControleVotacao implements ActionListener {

	private JanelaVotos jan;
	private VotoDAO vDAO;
	private boolean cadastro;

	public ControleVotacao(JanelaVotos jan) {
		this.jan = jan;
		this.jan.getButtonVotar().addActionListener(this);
		vDAO = new VotoDAO();
	}

	public void cadastrarVoto() {
		Voto v = new Voto();
		String voto = null;

		if (this.jan.getRadioButtonCandidatoA().isSelected()) {
			voto = this.jan.getRadioButtonCandidatoA().getText();
		}
		if (this.jan.getRadioButtonCandidatoB().isSelected()) {
			voto = this.jan.getRadioButtonCandidatoB().getText();
		}

		cadastro = vDAO.cadastrarVoto(new Voto(voto));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Votar")) {

			cadastrarVoto();

			if((!this.jan.getRadioButtonCandidatoA().isSelected()) && (!this.jan.getRadioButtonCandidatoB().isSelected()))
			{
					JOptionPane.showMessageDialog(this.jan, "Erro", "Erro", 0);
				
			}
			
				if (cadastro == true) {
					JOptionPane.showMessageDialog(this.jan, "Voto Registrado com Sucesso", "Sucesso", 1);
					this.jan.getButtonVotar();
				}

		}

	}

}