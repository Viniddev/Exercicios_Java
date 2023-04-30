package faixasEtárias;
import java.util.Scanner;

public class FaixasEtárias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp = 1;
		float idade = 0, menores = 0, jovensAdultos = 0, adultos = 0, maduros = 0, idosos = 0, total = 0;
		
		while(resp != 0) {
			System.out.print("Digite a idade da pessoa: ");
			idade = sc.nextFloat();
			
			if(idade > 0 && idade <= 17) {
				menores ++;
			}else if(idade > 17 && idade <= 35) {
				jovensAdultos++;
			}else if(idade > 35 && idade <= 50) {
				adultos++;
			}else if(idade > 50 && idade <= 65) {
				maduros++;
			}else if(idade > 65 && idade <= 100) {
				idosos++;
			}else {
				System.out.println("Idade Inválida");
			}
					
			System.out.println("");
			System.out.print("Deseja continuar cadastrando: [1= sim / 0= não] ");
			resp = sc.nextInt();
			System.out.println("");
		}
		
		total = menores + jovensAdultos + adultos + maduros + idosos;
		
		menores = menores * 100 / total;
		jovensAdultos = jovensAdultos * 100 / total;
		adultos = adultos * 100 / total;
		maduros = maduros * 100 / total;
		idosos = idosos * 100 / total;
		
		
		System.out.println("");
		System.out.printf("A porcentagem de Menores (0 - 17) é:   %.2f \n", menores);
		System.out.printf("A porcentagem de Jovens Adultos (18 - 35) é:   %.2f \n", jovensAdultos);
		System.out.printf("A porcentagem de Adultos (36 - 50) é:   %.2f \n", adultos);
		System.out.printf("A porcentagem de Maduros (51 - 65) é:   %.2f \n", maduros);
		System.out.printf("A porcentagem de Idosos (65 - ) é:   %.2f \n", idosos);

	}
}
