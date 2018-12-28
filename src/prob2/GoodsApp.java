package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = sc.nextLine();
			String[] tokens = line.split(" ");
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int countStock = Integer.parseInt(tokens[2]);

			goods[i] = new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setCountStock(countStock);
		}

		for (int i = 0; i < goods.length; i++) {
			goods[i].showInfo();
		}
	}
}
