package professor;
import static java.lang.Math.sqrt;
public class Operacoes {
	// M�todos com retorno:
	// Primeiro m�todo: retornar o maior n�mero
	int numeroMaior(int primeiroNumero, int segundoNumero) {
		if(primeiroNumero > segundoNumero) {
			return primeiroNumero;
		} else {
			return segundoNumero;
		}
	}
	// Segundo m�todo: soma dois n�meros
	double somaNumero(double primeiroNumero, double segundoNumero) {
		double somatorio = primeiroNumero + segundoNumero;
		return somatorio;
	}
	// Terceiro m�todo: multiplica dois numeros
	double multiplicaNumeros(double primeiroNumero, double segundoNumero) {
		double multiplicacao = primeiroNumero * segundoNumero;
		return multiplicacao;
	}
	// Quarto m�todo: raiz quadrada
	double raizQuadrada(double numero) {
		double raiz = sqrt(numero);
		return raiz;
	}
}
