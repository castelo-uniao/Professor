package professor;
import static java.lang.Math.sqrt;
public class Operacoes {
	// Métodos com retorno:
	// Primeiro método: retornar o maior número
	int numeroMaior(int primeiroNumero, int segundoNumero) {
		if(primeiroNumero > segundoNumero) {
			return primeiroNumero;
		} else {
			return segundoNumero;
		}
	}
	// Segundo método: soma dois números
	double somaNumero(double primeiroNumero, double segundoNumero) {
		double somatorio = primeiroNumero + segundoNumero;
		return somatorio;
	}
	// Terceiro método: multiplica dois numeros
	double multiplicaNumeros(double primeiroNumero, double segundoNumero) {
		double multiplicacao = primeiroNumero * segundoNumero;
		return multiplicacao;
	}
	// Quarto método: raiz quadrada
	double raizQuadrada(double numero) {
		double raiz = sqrt(numero);
		return raiz;
	}
}
