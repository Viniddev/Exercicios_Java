package Exercicio;
import java.util.Scanner;

public class exercicioSegundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a altura do retângulo: ");
		float alt = sc.nextFloat();
		System.out.printf("Digite a largura da base do retângulo: ");
		float comp = sc.nextFloat();
		
		float area = alt*comp;
		
		System.out.println("A área do retângulo de base = " + comp +
				", e de altura = " + alt + ", é = " + area + "m^2");

	}
}
