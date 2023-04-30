package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextFloat();
		System.out.print("Digite mais um número: ");
		num2 = sc.nextFloat();
		
		
		if(num1 == num2) {
			System.out.print("Os números digitados são iguais");
		}else {
			System.out.print("Os números digitados são diferentes");
		}
	}
}
