package prob6;

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
			
			switch (tokens[1]) {
			case "+":
				Add addObj = new Add();
				addObj.setValue(a, b);
				System.out.println(">> " + addObj.calculate());
				break;
			case "-":
				Sub subObj = new Sub();
				subObj.setValue(a, b);
				System.out.println(">> " + subObj.calculate());
				break;
			case "*":
				Mul mulObj = new Mul();
				mulObj.setValue(a, b);
				System.out.println(">> " + mulObj.calculate());
				break;
			case "/":
				Div divObj = new Div();
				divObj.setValue(a, b);
				System.out.println(">> " + divObj.calculate());
				break;
			default:
				System.out.println("없는 연산자입니다. 다시입력하세요.(+, -, *, /)");
				break;
			}
			System.out.println("계속 하시겠습니까?(y/n)");
			System.out.print(">> ");
			String checkflag = scanner.nextLine();
			if(checkflag.equals("n")) {
				System.out.println("quit");
				break;
			}
		}
	}
}
