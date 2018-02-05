package yinhang;

import java.util.Scanner;

public class Zhuanzhang<T> {
	public void Zhuanzhang(T t){
		System.out.println("您选择的是转账业务");
		System.out.println("请输入您的卡号:");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		System.out.println("请输入您要转账的卡号:");
		int id2=scanner.nextInt();
		System.out.println("请输入您要转账的数值:");
		int money=scanner.nextInt();
	}
}
