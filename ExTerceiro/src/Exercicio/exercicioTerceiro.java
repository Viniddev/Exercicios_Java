package Exercicio;
import java.util.Scanner;

public class exercicioTerceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos anos você tem: ");
		int anos = sc.nextInt();
		System.out.print("Quantos meses você tem: ");
		int meses = sc.nextInt();
		System.out.print("Quantos dias você tem: ");
		int dias = sc.nextInt();
		
		int idadeDias = (anos*365)+(meses*30)+dias;
		System.out.println("O fulaninho possui: "+idadeDias+" dias de vida.");

	}

}
