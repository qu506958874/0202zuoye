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
		
		System.out.println("��ѡ����ǿ���ҵ��");
		Ku kai=new Ku();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���������뿪�Ŀ���(����6λ����):");
		int id=scanner.nextInt();
		kai.setId(id);
		
		System.out.println("��������������:");
		String name=scanner.next();
		kai.setName(name);
		
		System.out.println("��������Ҫ�洢�Ľ��:");
		int money=scanner.nextInt();
		kai.setMoney(money);
		
		//���֮ǰ��list
		System.out.println(list);
		//�Ѹտ��Ļ��ŵ�list��
		System.out.println(kai.toString());
		list.add(kai);

		
		System.out.println("��ϲ�������ɹ�������");
	}
}
