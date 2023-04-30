package exercicio06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sexo;
		int masculinos = 0, femininos = 0, nBinario = 0;
		float percentMasc = 0, percentFem = 0, percentNB = 0;
		
		for(int i = 0; i < 30; i++) {
			System.out.print("Digite o sexo: [M/F/NB] ");
			sexo = sc.nextLine().toUpperCase().trim();
			
			if(sexo.equals("M")) {
				masculinos++;
			}else if(sexo.equals("F")) {
				femininos++;
			}else if(sexo.equals("NB")) {
				nBinario++;
			}else {
				System.out.println("Digite uma opção válida");
				i = i -1;
			}
		}
		int tot = masculinos + femininos + nBinario;
		
		percentMasc = masculinos * 100 / tot;
		percentFem = femininos * 100 / tot;
		percentNB = nBinario * 100 / tot;
		
		System.out.printf("Masculinos: %.1f porcento \nFemininos: %.1f porcento \nNão Binarios: %.1f porcento", percentMasc, percentFem, percentNB );
	}
}
