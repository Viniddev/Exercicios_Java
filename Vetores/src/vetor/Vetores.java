package vetor;
import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		System.out.println("Vetores em java!");
		
		for(int n=0;n<5;n++) {
			System.out.print("Digite um valor: ");
			int num = sc.nextInt();
			nums[n] = num;
		}
		System.out.print("As posições dentro do vetor e os respectivos valores foram: ");
		for(int c=0;c<5;c++){
			System.out.printf("\n %d = %d " , c , nums[c]);
		}
		System.out.println();
		Arrays.sort(nums);
		System.out.printf("Os valores digitados em ordem crescente: ");
		for(int c=0;c<5;c++){
			System.out.printf("\n %d = %d " , c , nums[c]);
		}	
		sc.close();
	}
}
