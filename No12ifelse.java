import java.util.Scanner;

public class No12ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >> ");
		float n1 = scanner.nextFloat();
		String opreator = scanner.next();
		float n2 = scanner.nextFloat();
		
		float sum = 0;
		
		if(n2 == 0 && opreator.equals("/")) {
			System.out.println("0���� ���� �� �����ϴ�.");
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
			System.out.println("���� ��ȣ�Դϴ�.");
			return;
		}
		
		System.out.println(n1 + opreator + n2 + " = " + (int)sum + "�Դϴ�");
		
		scanner.close();
	}

}
