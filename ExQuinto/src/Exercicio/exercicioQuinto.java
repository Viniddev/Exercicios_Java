package Exercicio;
import java.util.Scanner;

public class exercicioQuinto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o custo de produção do automovel: [Em R$] ");
		float custo = sc.nextFloat();
		
		double precFinal =(custo* 0.28) + (custo*0.45) + custo;
		System.out.printf("Com o custo de produção R$ %.2f, o carro vai a concessionaria pelo valor R$ %.2f", custo, precFinal);

	}

}
