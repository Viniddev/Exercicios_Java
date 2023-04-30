package Exercicio;
import java.util.Scanner;

public class exercicioSexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o salário bruto do funcionário? ");
		float sal = sc.nextFloat();
		System.out.print("Quantos carros ele vendeu nesse mês?  ");
		int carros = sc.nextInt();
		System.out.print("Qual a comissão que o funcionário recebe?  ");
		float comis = sc.nextFloat();
		System.out.print("Qual o valor bruto que esse funcionário vendeu em carros? ");
		float valCar = sc.nextFloat();
		
		double salfinal = sal + (((comis/100)+1)*carros) + (0.05*valCar);
		
		System.out.printf("O salário final do funcionário é %.2f", salfinal);
	}
}
