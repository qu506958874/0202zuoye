package yonghuguanli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Guanli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		List<Integer> xuehao=new ArrayList<Integer>();
		System.out.println("********��ӭʹ���û�����ϵͳ********");
		while(true){
			System.out.println("---------------------------");
			System.out.println("1---------����û�");
			System.out.println("2---------ɾ���û�");
			System.out.println("3---------�޸��û�");
			System.out.println("4---------��ѯ�û�");
			System.out.println("---------------------------");
			Scanner scanner=new Scanner(System.in);
			int in=scanner.nextInt();
			if(in==1){
				System.out.println("��ѡ���������û�����");
				System.out.println("����������ѧ��:");
				int id=scanner.nextInt();
				System.out.println("��������������:");
				String name=scanner.next();
				System.out.println("�����������Ա�:");
				String sex=scanner.next();
				//���֮ǰ��ӵ��û�
				System.out.println(list);
				//�Ѹ���ӵ��û��ŵ�list��
				Person p=new Person(id,name,sex);
				System.out.println(p.toString());
				list.add(p);
				xuehao.add(id);
				
				
			}else if(in==2){
				System.out.println("��ѡ�����ɾ���û�����");
				System.out.println("��������Ҫɾ����ѧ��:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Object xh=xuehao.get(i);
						if(id.equals(xh)){
							list.remove(i);
							System.out.println("��ϲ��ɾ���ɹ�������");
						}
							
						
					}
				}else{
					System.out.println("�����������,���������룡");
				}
			}else if(in==3){
				System.out.println("��ѡ������޸��û�����");
				System.out.println("��������Ҫ�޸ĵ�ѧ��:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Person p1=(Person)list.get(i);
						if(id.equals(p1.getId())){
							
							System.out.println("��������Ҫ�޸ĵ�����:");
							String name_h=scanner.next();
							System.out.println("��������Ҫ�޸ĵ��Ա�:");
							String sex_h=scanner.next();
							p1.setName(name_h);
							p1.setSex(sex_h);
							
						}
					}
				}else{
					System.out.println("�����������,���������룡");
				}
			}else if(in==4){
				System.out.println("��ѡ����ǲ�ѯ�û�����");
				System.out.println("��������Ҫ��ѯ��ѧ��:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Person p2=(Person)list.get(i);
						if(id.equals(p2.getId())){
							
							System.out.println(p2);
						}
							
						
					}
				}else{
					System.out.println("�����������,���������룡");
				}
			}else{
				System.out.println("�����������,���������룡����");
			}
		}
	}

}
