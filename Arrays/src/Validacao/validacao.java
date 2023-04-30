package Validacao;
import java.util.Scanner;

public class validacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomes[] = new String[10];
		int idades[] = new int[10];
		String sexos[] = new String[10];
		
		for(int i=0;i<=10;i++) {
			System.out.print("Digite o nome da pessoa: ");
			String nome = sc.nextLine();
			System.out.print("Qual a idade da pessoa? ");
			int idade = sc.nextInt();
			System.out.print("Digite o sexo da pessoa: ");
			String sexo = sc.nextLine();
			
			System.out.print("");
			
			idades[i] = idade;
			sexos[i] = sexo;
			nomes[i] = nome;
			
			nome = " ";
			idade = 0;
			sexo = " ";	
		}
		System.out.println(nomes);
		System.out.println(idades);
		System.out.println(sexos);

	}
}
