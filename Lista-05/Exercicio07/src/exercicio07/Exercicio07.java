package exercicio07;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário do usuário: ");
		float sal = sc.nextFloat();
		System.out.print("Digite o valor da parcela: ");
		float parc = sc.nextFloat();

		if(parc >= (sal * 0.30)) {
			System.out.print("Impossibilitado de obter o crédito pois \n o valor da parcela é maior que 30% do salário");
		}else {
			System.out.print("Crédito aprovado com sucesso!");
		}
	}
}
