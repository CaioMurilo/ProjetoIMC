package br.com.saude.pessoa;

public class Main {

	public static void main(String[] args) {

		//Instanciar Pessoa COmum
		Pessoa objPcomum = new Pessoa("Julio", 82.0, 1.78);
		objPcomum.mostrarIMC();
		
		System.out.println("==========================================================================");
		
		//Instanciar Atleta
		Atleta objAtleta = new Atleta("Giorgian De Arrascaeta", 73.0, 1.78, "Futebol");
		objAtleta.mostrarIMC();
	}
}