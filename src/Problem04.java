import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		int max=0;
		int arr[]= new int[5];
		System.out.println("���ڸ� �Է��ϼ���");
		
		for(int i=0;i<5;i++) {//0������� 4������� �� 5�� ����.
			arr[i]= sc.nextInt();
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		System.out.println("�ִ밪��"+max+"�Դϴ�.");		
		sc.close();
	}

}
