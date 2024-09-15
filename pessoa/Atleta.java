package br.com.saude.pessoa;

public class Atleta extends Pessoa {

	private String esportePraticado;

	public Atleta(String nome, double peso, double altura, String esportePraticado) {
		super(nome, peso, altura); //Chamando o construtor da classe mãe (Pessoa)
		this.esportePraticado = esportePraticado;
	}

	//Sobrescrevendo o método calcularIMC
	@Override
	public double calcularIMC() {
		//Polimorfismo
		double imcOriginal = super.calcularIMC(); //Chama o método da classe Mãe (Pessoa)
		return imcOriginal * 0.95; //Reduz o IMC em 5%
	}

	//Método de informações
	@Override
	public void mostrarIMC() {
		System.out.println(getNome()+" (Atleta de "+ esportePraticado+ ") possui um IMC ajustado de "+String.format("%.2f", calcularIMC()));
	}
}