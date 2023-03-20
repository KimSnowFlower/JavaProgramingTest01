import java.util.Scanner;

public class No12switch {
	   public static void main(String[] args) {
	      System.out.println("����>>");
	      Scanner scanner = new Scanner(System.in);
	      
	      double num1 = scanner.nextDouble();
	      String operator = scanner.next();
	      double num2 = scanner.nextDouble();
	      
	      double result = 0;
	      switch(operator) {
	         case "+":
	            result = num1 + num2;
	            break;
	         case "-":
	            result = num1 - num2;
	            break;
	         case "*":
	            result = num1 * num2;
	            break;
	         case "/":
	            if(num2 == 0) {
	               System.out.print("0���� ���� �� �����ϴ�.");
	               return;
	            }
	            result = num1 / num2;
	            break;
	         default:
	            System.out.print("�߸��� �����ڸ� �Է��Ͽ����ϴ�.");
	            return;
	      }
	      
	      System.out.println(num1 + operator + num2 + "�� ������� " + result);
	      scanner.close();
	   }
}
