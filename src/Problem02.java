import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>>");
		
		int num =sc.nextInt();
		int i;
		int j;
	
		for(i=1; i<=num; i++) {
			//���η� ���� �þ�� �ϴ� ���
			for(j=2;j<=i ;j++) {
				
				System.out.print(i);
			}
			
			System.out.println(i);
		
		
		}//for
		
		sc.close();
		

	}

}
