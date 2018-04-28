import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner fon = new Scanner(System.in);
		int q = 0;
		System.out.println("Digite o tamanho da pilha 1: ");
		
		
		try {
			q = fon.nextInt();
		}catch(NumberFormatException error) {
			q = 0;
			System.out.println("Error!" + error.getMessage() + ". Você deve digitar apenas NUMEROS INTEIROS.");
		}
		
		
		Pilha p1 = new Pilha(q);
		System.out.println("Digite um valor para ser empilhado na pilha 1: ");
		q = fon.nextInt();
		p1.push(q);
		System.out.println("Sua pilha 1:" + p1.mostrarPilha());
		System.out.println("Sua pilha vale: " + p1.valorPilha());
		
		System.out.println("Digite o tamanho da pilha 2: ");
		q = fon.nextInt();
		Pilha p2 = new Pilha(q);
		System.out.println("Digite um valor para ser empilhado na pilha 2: ");
		q = fon.nextInt();
		p2.push(q);
		System.out.println("Sua pilha 2:" + p2.mostrarPilha());
		System.out.println("Sua pilha vale: " + p2.valorPilha());
		
		int potencia = 0;
		int valorTotal = p1.valorPilha() + p2.valorPilha();
		for (int z = 1; z < valorTotal; z = z * 10) {
			potencia++;
		}
		Pilha pSoma = new Pilha(potencia);
		int savePotencia = potencia;
		for (int z = 0; z < savePotencia; z++) {
			int numeroPotencia = 1;
			for (int y = 1; y < potencia; y++) {
				numeroPotencia = numeroPotencia * 10;
			}
			potencia--;
			pSoma.push(valorTotal/numeroPotencia);
			valorTotal = valorTotal - ((valorTotal/numeroPotencia) * numeroPotencia);
		}
		System.out.println("Sua soma resultou na pilha:" + pSoma.mostrarPilha());			
		fon.close();
		
		// OBS: FALTA O ARMAZENAMENTO EM DISCO E O TRATAMENTO DE EXCEÇÃO
	}
}
