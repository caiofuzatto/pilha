public class Pilha {
		private int index = 0;
		private int[] pilha;
		
		public Pilha(int tamanho) {
			pilha = new int[tamanho];
		}
		
		public void Clear(){
			for (int x = 0; x < pilha.length; x++) {
				pilha[x] = 0;
			}
		}
		
		public void isEmpty(){
			if (this.pilha[0] == 0) {
				System.out.println("Essa pilha está vazia.");
			}else {
				System.out.println("Essa pilha não está vazia.");
			}
		}
		
		public void isFull(){
			if (this.pilha[(this.pilha.length-1)] != 0) {
				System.out.println("Essa pilha está cheia.");
			}else {
				System.out.println("Essa pilha não está cheia.");
			}
		}
		
		public void push(int elemento) {
			int potencia = 0;
			for (int z = 1; z < elemento; z = z * 10) {
				potencia++;
			}
			int savePotencia = potencia;
			for (int z = 0; z < savePotencia; z++) {
				int numeroPotencia = 1;
				for (int y = 1; y < potencia; y++) {
					numeroPotencia = numeroPotencia * 10;
				}
				potencia--;
				if (index < this.pilha.length) {
					this.pilha[index] = (elemento/numeroPotencia);
					index++;
				}else {
					System.out.println("A pilha está lotada.");
					break;
				}
				elemento = elemento - ((elemento/numeroPotencia) * numeroPotencia);
			}
		}
		
		public void pop() {
			if (index > 0) {
				System.out.println("O elemento mais alto da pilha: " + this.pilha[index-1] + ", de altura: " + index + " foi removido.");
				this.pilha[index-1] = 0;
				index--;
			}else {
				System.out.println("Essa pilha está vazia.");
			}
		}
		
		public void topElement() {
			if (this.index > 0) {
				System.out.println("Elemento mais alto da pilha: " + this.pilha[index-1] + ", altura: " + index);
			}else {
				System.out.println("Essa pilha está vazia.");
			}
		}
		
		public String mostrarPilha() {
			String print = "-";
			for (int x = this.pilha.length-1; x >= 0; x--) {
				print = print + pilha[x] + "-";
			}
			return print;
		}
		
		public int valorPilha() {
			int potencia = this.index;
			int soma = 0;
			for (int x = 0; x < this.index; x++) {
				int valor = 1;
				for (int y = 1; y < potencia; y++) {
					valor = valor * 10;
				}
				potencia--;
				soma = soma + (pilha[x] * valor);
			}
			return soma;
		}
}
