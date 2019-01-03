package prob6.refactoring;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print(">> ");
			String expression = scanner.nextLine();

			/* 코드를 완성 합니다 */
			String tokens[] = expression.split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			String operator = tokens[1];
			
			Arith arith = null;
			
			switch (operator) {
			case "+":
				arith = new Add();
				break;
			case "-":
				arith = new Sub();
				break;
			case "*":
				arith = new Mul();
				break;
			case "/":
				arith = new Div();
				break;
			default:
				System.out.println("없는 연산자입니다. 다시입력하세요.(+, -, *, /)");
				break;
			}
			arith.setValue(a, b);
			int result = arith.calculate();
			System.out.println(">> " + result);
			System.out.println("계속 하시겠습니까?(y/n)");
			System.out.print(">> ");
			String checkflag = scanner.nextLine();
			if(checkflag.equals("n")) {
				System.out.println("quit");
				break;
			}
		}
		
		scanner.close();
	}
}
