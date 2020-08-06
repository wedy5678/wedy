package homework;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.out;

public class homework10_2_format {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNum;
		String number;
		while (true) {
			out.print("請輸入數字:");
			inputNum = sc.next();
			if (inputNum.matches("[0-9]*")) {
				break;
			} else {
				out.println("數字格式不正確，請再輸入一次");
				continue;
			}
		}
		double dNum = Double.parseDouble(inputNum);

		while (true) {
			out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
			number = sc.next();
			if (number.matches("[1-3]")) {
				break;
			} else {
				out.println("請輸入1-3");
			}
		}
		int num = Integer.parseInt(number);

		switch (num) {
		case 1:
			out.println("千分位數字: " + new DecimalFormat(",###").format(dNum));
			break;
		case 2:
			out.println("百分比數字: " + new DecimalFormat("0%").format(dNum));
			break;
		case 3:
			out.println("科學記號數字: " + new DecimalFormat("#.###E00").format(dNum));
			break;
		}
		sc.close();

	}

}
