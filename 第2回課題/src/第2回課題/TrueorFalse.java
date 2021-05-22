package 第2回課題;
//コンソールに「引数が0なら偽。引数が1なら真」と表示

import java.util.Scanner;

public class TrueorFalse {

	public static void main(String[] args) {
		System.out.println("0または1を入力してください");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number == 1 ) {
			System.out.println("真");
		}	else {
			System.out.println("偽");
		}		
		scan.close();
  
	}

}