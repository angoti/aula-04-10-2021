package dome.heranca;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Multimidia> listaMultimida;
	
	public BaseDados() {
		listaMultimida = new ArrayList<Multimidia>();
	}
	
	public void inserir(Multimidia multimidia) {
		listaMultimida.add(multimidia);
	}
	
	public void listar() {		
		for(Multimidia multimidia : listaMultimida) {
			System.out.println(multimidia);
		}
	}
}