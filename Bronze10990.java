import java.util.Scanner;
public class Bronze10990 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n-1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i = 2; i <= n; i++) {
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			
			for(int j = 1; j <= (i-2)*2+1; j++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			
			System.out.println();
		}
	}
}
