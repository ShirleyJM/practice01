import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		//1.�����Է�
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���>>");
		int num = sc.nextInt();
		int startNum=0;//�̰��� �ǹ��ϴ� ��?
		int sum=0;
			
			//���� �Ǵ�(¦���̸�~, Ȧ���̸�~) 
			
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
		System.out.println("�����:"+sum);
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	