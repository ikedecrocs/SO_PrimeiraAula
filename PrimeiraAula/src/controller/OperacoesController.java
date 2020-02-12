package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public void OpString() {
		String valor = "";
		double tempoInicial = System.nanoTime();
		for(int c = 0; c < 32768 ; c++) {
			valor += "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		System.out.println("String == " + tempoTotal + "s");
	}
	
	public void OpBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int c = 0; c < 32768; c++) {
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10, 9);
		System.out.println("Buffer == " + tempoTotal + "s");
	}
	
	public void OpFrase(String frase) {
		String[] palavras = frase.split(" ");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
