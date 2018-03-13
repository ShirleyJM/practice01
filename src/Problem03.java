import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {

		
		int dan;
		int num;
		
		//숫자먼저 입력하도록.
		for(num=1;num<=9;num++) {
			
			for(dan=2;dan<=9;dan++){
				//가로출력=print
				System.out.print(dan+"*"+num+"="+(dan*num)+"\t");
			} 
			System.out.println();
			
		}
	}

}
