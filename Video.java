package dome.heranca;

public class Video extends Multimidia {
	
	private String diretor;
	
	public Video(String comentario, String titulo, boolean emprestado, double tempoDuracao,
			String diretor) {
		super(comentario, titulo, emprestado, tempoDuracao);
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String toString() {
		return diretor + " - " + comentario + " - " + titulo + " - " + 
			   emprestado + " - " + tempoDuracao;
	}
}