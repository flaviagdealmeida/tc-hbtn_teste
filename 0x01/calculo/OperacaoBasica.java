
public class OperacaoBasica {
	private  static int cont;

	public static double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public static double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public static double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public static double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public static double sqrt(double valor1) {
		return Math.sqrt(valor1);
	}

	public static String numero_primo(double valor1) {

		if (valor1 <= 1) {
			 return "N�mero invalido. Numero menor ou igual a 1 n�o � primo";
		}
		for (int i = 0; i < valor1; i++) {
			cont = 0;
			if (valor1 % i == 0) {
				cont++;
			}

			if (cont == 2) {
				return "Numero v�lido, o numero � primo";
			} else {
				return "N�mero v�lido, mas n�o � primo";
			}

		}
		return null;
	}
}