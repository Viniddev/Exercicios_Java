package Temperaturas;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		do {
			System.out.println("Qual conversão deseja fazer? ");
			System.out.println("");
			System.out.println("1 ) Celsius para Fahrenheit");
			System.out.println("2 ) Celsius para Kelvin ");
			System.out.println("3 ) Celsius para Réaumur ");
			System.out.println("4 ) Celsius para Rankie ");
			System.out.print("Opção: ");
			int opc = sc.nextInt();
			
			System.out.println("Qual temperatura você deseja converter? [oC.] ");
			float temp = sc.nextFloat();
			
			if (opc<0 || opc>4) {
				System.out.println("Digite uma resposta válida");
			}else if (opc == 1) {
				double novaTemp = (temp * 1.8) + 32;
				System.out.printf("A temperatura %.2f convertida para Fahrenheit é %.2f \n", temp, novaTemp);
			}else if(opc == 2) {
				double novaTemp =temp + 273.15;
				System.out.printf("A temperatura %.2f convertida para Kelvin é %.2f \n", temp, novaTemp);
			}else if(opc == 3) {
				double novaTemp = temp * 0.8;
				System.out.printf("A temperatura %.2f convertida para Réaumur é %.2f \n", temp, novaTemp);
			}else {
				double novaTemp =  (((temp * 1.8) + 32) + 459.67);
				System.out.printf("A temperatura %.2f convertida para Rankie é %.2f \n", temp, novaTemp);
			}
			
			System.out.print("Deseja continuar? ");
			resp = sc.next().charAt(0);
		}while(resp!='n');
	}
}
