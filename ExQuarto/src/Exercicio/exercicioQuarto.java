package Exercicio;
import java.util.Scanner;

public class exercicioQuarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do salário do trabalhador: ");
		float sal = sc.nextFloat();
		System.out.print("Qual o valor do reajuste salarial: [em %] ");
		float reaj = sc.nextFloat();
		
		float novoSal = sal * ((reaj/100)+1);
		System.out.println("O novo salário do funcionáro é: R$"+novoSal);
		

	}
}
