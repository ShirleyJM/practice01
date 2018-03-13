import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		int max=0;
		int arr[]= new int[5];
		System.out.println("숫자를 입력하세요");
		
		for(int i=0;i<5;i++) {//0번방부터 4번방까지 총 5개 숫자.
			arr[i]= sc.nextInt();
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		System.out.println("최대값은"+max+"입니다.");		
		sc.close();
	}

}
