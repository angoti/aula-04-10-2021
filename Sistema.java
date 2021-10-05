package dome.heranca;

import java.util.Scanner;

public class Sistema {

	private BaseDados dados;
	private Scanner teclado;

	public Sistema() {
		dados = new BaseDados();
		teclado = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Sistema sis = new Sistema();
		sis.exibeMenu();
	}

	private void exibeMenu() {
		int op;
		do {
			System.out.println("0 - sair");
			System.out.println("1 - cadastrar novo");
			System.out.println("2 - listar");
			op = teclado.nextInt();
			switch (op) {
			case 0:
				System.out.println("Até mais");
				break;
			case 1:
				cadastrarCd();
				break;
			case 2:
				listar();
				break;
			}
		} while (op != 0);
	}

	private void listar() {
		dados.listar();
	}

	private void cadastrarCd() {
		teclado.nextLine();// limpeza do buffer do scanner
		
		System.out.println("Digite o nome do artista");
		String artista = teclado.nextLine();
		
		System.out.println("Digite o comentario");
		String comentario = teclado.nextLine();
		
		System.out.println("Digite o titulo");
		String titulo = teclado.nextLine();
		
		System.out.println("Está emprestado? (sim/não)");
		String respostaEmprestado = teclado.nextLine();
		
		System.out.println("Número de músicas do CD");
		int nroMusicas = teclado.nextInt();

		System.out.println("Tempo de duração do CD");
		double tempoDuracao = teclado.nextDouble();
		
		Cd cd = new Cd(comentario, titulo, 
				respostaEmprestado.equals("sim") ? true : false,
				tempoDuracao, artista, nroMusicas);		
		dados.inserir(cd);
	}
}