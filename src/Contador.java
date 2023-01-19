//Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir
// os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

//Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de
// ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

import java.text.ParseException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
	
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            //chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
        }catch (Exception e ) {
			System.out.println(e.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }
		
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
		throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
        for (int i = 1;i <=contagem ;i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}