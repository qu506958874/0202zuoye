package yinhang;

import java.util.Scanner;

public class Qukuan<T> {
	public void Qukuan(T t){
		System.out.println("您选择的是取款业务");
		System.out.println("请输入您的卡号:");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		System.out.println("请输入您要取的数值:");
		int money=scanner.nextInt();
		
	}
}
