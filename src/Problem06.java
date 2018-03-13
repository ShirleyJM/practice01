import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		//1.숫자입력
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num = sc.nextInt();
		int startNum=0;//이것이 의미하는 것?
		int sum=0;
			
			//숫자 판단(짝수이면~, 홀수이면~) 
			
		/*if(num%2==1){
				for(startNum=1;i<=num;i+=2) {
					sum=sum+i;
				}
				System.out.println(sum);
			} else {
				for(startNum=2;i<=num;i+=2) {
					sum=sum+i;
					}
				System.out.println(sum);
				
		  }*/
		
		if(num%2==0) {
			startNum = 2;
		}else {
			startNum = 1;
		}
		for(int i=startNum; i<=num; i=i+2) {
			sum=sum+i;
		}
		System.out.println("결과값:"+sum);
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	