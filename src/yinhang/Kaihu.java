package yinhang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Kaihu<T> {
	List<Ku> list=new ArrayList<Ku>();
	public void kaihu(T t){
		
		System.out.println("您选择的是开户业务");
		Ku kai=new Ku();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入您想开的卡号(必须6位数字):");
		int id=scanner.nextInt();
		kai.setId(id);
		
		System.out.println("请输入您的姓名:");
		String name=scanner.next();
		kai.setName(name);
		
		System.out.println("请输入您要存储的金额:");
		int money=scanner.nextInt();
		kai.setMoney(money);
		
		//输出之前的list
		System.out.println(list);
		//把刚开的户放到list里
		System.out.println(kai.toString());
		list.add(kai);

		
		System.out.println("恭喜您开户成功！！！");
	}
}
