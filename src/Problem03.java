import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {

		
		int dan;
		int num;
		
		//���ڸ��� �Է��ϵ���.
		for(num=1;num<=9;num++) {
			
			for(dan=2;dan<=9;dan++){
				//�������=print
				System.out.print(dan+"*"+num+"="+(dan*num)+"\t");
			} 
			System.out.println();
			
		}
	}

}
