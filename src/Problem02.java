import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		
		int num =sc.nextInt();
		int i;
		int j;
	
		for(i=1; i<=num; i++) {
			//세로로 숫자 늘어나게 하는 방법
			for(j=2;j<=i ;j++) {
				
				System.out.print(i);
			}
			
			System.out.println(i);
		
		
		}//for
		
		sc.close();
		

	}

}
