package exercicio06;
import java.util.Scanner;
import java.lang.Math;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a altura do usuário: ");
		float alt = sc.nextFloat();
		System.out.print("Digite qual o peso do usuário: ");
		float peso = sc.nextFloat();
		
		float imc =  peso/(alt*alt);
		
		if(imc < 18.5){
			System.out.print("Usuário em estado de MAGREZA");
		}else if(imc >= 18.5 && imc <= 24.9 ){
			System.out.print("Usuário em estado NORMAL");
		}else if(imc >= 25 && imc <= 29.9 ){
			System.out.print("Usuário em estado de SOBREPESO");
		}else if(imc >= 30.0 && imc <= 39.9 ){
			System.out.print("Usuário em estado de OBESIDADE");
		}else if(imc > 40){
			System.out.print("Usuário em estado de OBESIDADE GRAVE");
		}else {
			System.out.print("Erro na análise dos dados.");
		}
		
	}
}
