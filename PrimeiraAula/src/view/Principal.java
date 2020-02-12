package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
		opController.OpString();
		opController.OpBuffer();
		String frase = "Blz cara mas Ser gamer, ser um jogador";
		opController.OpFrase(frase);
		
	}

}
