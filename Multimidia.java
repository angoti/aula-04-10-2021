package dome.heranca;

public class Multimidia {
	protected String comentario, titulo;
	protected boolean emprestado;
	protected double tempoDuracao;

	public Multimidia(String comentario, String titulo, boolean emprestado, 
			double tempoDuracao) {
		super();
		this.comentario = comentario;
		this.titulo = titulo;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public double getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
}