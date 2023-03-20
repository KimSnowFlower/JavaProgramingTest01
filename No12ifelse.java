import java.util.Scanner;

public class No12ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >> ");
		float n1 = scanner.nextFloat();
		String opreator = scanner.next();
		float n2 = scanner.nextFloat();
		
		float sum = 0;
		
		if(n2 == 0 && opreator.equals("/")) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		
		if(opreator.equals("+")) 
			sum = n1 + n2;
		else if(opreator.equals("-"))
			sum = n1 - n2;
		else if(opreator.equals("*"))
			sum = n1 * n2;
		else if(opreator.equals("/"))
			sum = n1 / n2;
		else {
			System.out.println("없는 기호입니다.");
			return;
		}
		
		System.out.println(n1 + opreator + n2 + " = " + (int)sum + "입니다");
		
		scanner.close();
	}

}
