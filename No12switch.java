import java.util.Scanner;

public class No12switch {
	   public static void main(String[] args) {
	      System.out.println("연산>>");
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
	               System.out.print("0으로 나눌 수 없습니다.");
	               return;
	            }
	            result = num1 / num2;
	            break;
	         default:
	            System.out.print("잘못된 연산자를 입력하였습니다.");
	            return;
	      }
	      
	      System.out.println(num1 + operator + num2 + "의 계산결과는 " + result);
	      scanner.close();
	   }
}
