package controle;

import visao.JanelaVotos;

public class App {

	public static void main(String[] args) {

		JanelaVotos jan = new JanelaVotos();
		jan.setVisible(true);
		ControleVotacao cvoto = new ControleVotacao(jan);
	}
}