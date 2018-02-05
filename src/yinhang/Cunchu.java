package yinhang;

import java.util.Scanner;

public class Cunchu<T> {
	public void Cunchu(T t){
		System.out.println("您选择的是存储业务");
		System.out.println("请输入您的卡号:");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		System.out.println("请输入您存入的数值:");
		int money=scanner.nextInt();
	}
}
