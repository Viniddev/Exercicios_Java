package exercicio;

public class Exercicioprimeiro {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("No início, a= "+ a +", e de b= "+ b);
		c = b;
		b = a;
		a = c;
		System.out.println("No final, a= "+ a +", e b = "+ b);

	}

}
