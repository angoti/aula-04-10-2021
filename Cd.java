package dome.heranca;

public class Cd extends Multimidia {
	private String artista;
	private int nroMusicas;
	
	public Cd(String comentario, String titulo, boolean emprestado, double tempoDuracao, 
			String artista, int nroMusicas) {
		super(comentario, titulo, emprestado, tempoDuracao);
		this.artista = artista;
		this.nroMusicas = nroMusicas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNroMusicas() {
		return nroMusicas;
	}

	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}
	
	public String toString() {
		return artista + " - " + comentario + " - " + titulo + " - " + 
			   emprestado + " - " + nroMusicas + " - " + tempoDuracao;
	}
}