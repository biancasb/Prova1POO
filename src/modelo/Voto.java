package modelo;

public class Voto {
	private String voto;
	private String candidato;

	public Voto(String voto) {
		this.voto = voto;
	}

	public Voto() {

	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}


	public String getCandidato() {
		return candidato;
	}
	
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	
}