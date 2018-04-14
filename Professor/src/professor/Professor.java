package professor;
public class Professor {
	public static void main(String[] args) {
		Operacoes operacao1 = new Operacoes();
		int valor1 = operacao1.numeroMaior(55, 100);
		System.out.println("Maior número: " + valor1);
		
		Operacoes operacao2 = new Operacoes();
		double valor2 = operacao2.somaNumero(155, 450);
		System.out.println("Soma dos números: " + valor2);
		
		Operacoes operacao3 = new Operacoes();
		double valor3 = operacao3.multiplicaNumeros(5.5, 50.5);
		System.out.println("Multiplicação dos números: " + valor3);
		
		Operacoes operacao4 = new Operacoes();
		double valor4 = operacao4.raizQuadrada(144);
		System.out.println("Raiz quadrada: " + valor4);
	}

}
