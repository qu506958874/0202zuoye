package yinhang;

import java.util.Scanner;

public class Zhuanzhang<T> {
	public void Zhuanzhang(T t){
		System.out.println("��ѡ�����ת��ҵ��");
		System.out.println("���������Ŀ���:");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		System.out.println("��������Ҫת�˵Ŀ���:");
		int id2=scanner.nextInt();
		System.out.println("��������Ҫת�˵���ֵ:");
		int money=scanner.nextInt();
	}
}
