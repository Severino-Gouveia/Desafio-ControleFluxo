import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		/*try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			// O segundo parâmetro deve ser maior que o primeiro
		}
		
	}*/
	//static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	 	
			int contagem = parametroDois - parametroUm;

			System.out.println(parametroUm);
			System.out.println(parametroDois);
		//realizar o for para imprimir os números com base na variável contagem
	}
}