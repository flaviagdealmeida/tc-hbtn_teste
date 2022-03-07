public class OperacaoBasica {


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
			 return "Número invalido. Numero menor ou igual a 1 não é primo";
		}
		
		if (valor1 % 2 == 0) {
			return "Número válido, mas o numero não é primo";
		}else {
			return "Numero válido, o numero é primo";
		}
	
	}
}