package yinhang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******��ӭʹ����������********");
		List<Ku> list=new ArrayList<Ku>();
		List kabao=new ArrayList();
		List qian=new ArrayList();
		
		Kaihu<Integer> k1=new Kaihu<Integer>();
		Cunchu<Integer> c1=new Cunchu<Integer>();
		Qukuan<Integer> q1=new Qukuan<Integer>();
		Zhuanzhang<Integer> z1=new Zhuanzhang<Integer>();
		while(true){
			System.out.println("---------------------------");
			System.out.println("1---------����");
			System.out.println("2---------�洢");
			System.out.println("3---------ȡ��");
			System.out.println("4---------ת��");
			System.out.println("---------------------------");
			Scanner scanner=new Scanner(System.in);
			int in=scanner.nextInt();
			if(in==1){
				//k1.kaihu(in);
				System.out.println("��ѡ����ǿ���ҵ��");
				//Ku kaihu=new Ku();
				
				System.out.println("�����������õĿ���:");
				int id=scanner.nextInt();
				//kaihu.setId(id);
				//int kahao=kaihu.getId();
				
				System.out.println("��������������:");
				String name=scanner.next();
				//kaihu.setName(name);
				
				System.out.println("��������Ҫ�洢�Ľ��:");
				int money=scanner.nextInt();
				//kaihu.setMoney(money);
				//int yue=kaihu.getMoney();
				
				//���֮ǰ��list
				System.out.println(list);
				//�Ѹտ��Ļ��ŵ�list��
				Ku kaihu=new Ku(id,name,money);
				System.out.println(kaihu.toString());
				list.add(kaihu);
				kabao.add(id);
				qian.add(money);
				
				
				System.out.println("��ϲ�������ɹ�������");
				
			}else if(in==2){
				//c1.Cunchu(in);
				System.out.println("��ѡ����Ǵ洢ҵ��");
				System.out.println("���������Ŀ���:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						//Object ka=kabao.get(i);
						Ku ka=(Ku)list.get(i);
						//System.out.println(obj);
						if(id.equals(ka.getId())){
							System.out.println("������������Ľ��:");
							int money=scanner.nextInt();
							Object yue=ka.getMoney();
							int new_money=(int)yue+(int)money;
							System.out.println("�������Ϊ:"+new_money);
							ka.setMoney(new_money);
						}
					}
				}else{
					System.out.println("���������������������");
				}
			}else if(in==3){
				//q1.Qukuan(in);
				System.out.println("��ѡ�����ȡ��ҵ��");
				System.out.println("���������Ŀ���:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						Ku ka=(Ku)list.get(i);
						if(id.equals(ka.getId())){
							System.out.println("��������Ҫȡ�Ľ��:");
							int money=scanner.nextInt();
							Object yue=ka.getMoney();
							int new_money=(int)yue-(int)money;
							System.out.println("�������Ϊ:"+new_money);
							ka.setMoney(new_money);
							System.out.println(list);
						}
					}
				}else{
					System.out.println("���������������������");
				}
				
			}else if(in==4){
				//z1.Zhuanzhang(in);
				System.out.println("��ѡ�����ת��ҵ��");
				System.out.println("���������Ŀ���:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						Ku ka=(Ku)list.get(i);
						if(id.equals(ka.getId())){
							System.out.println("��������Ҫת�˵Ŀ���:");
							Object id2=scanner.nextInt();
							if(kabao.contains(id2)){
								for(int j=0;j<kabao.size();j++){
									Ku ka2=(Ku)list.get(j);
									System.out.println(ka2);
									if(id2.equals(ka2.getId())){
										System.out.println("��������Ҫת�˵Ľ��:");
										Object mon=scanner.nextInt();
										if((int)mon<ka.getMoney()&&(int)mon>0){
											Object money1_y=ka.getMoney();
											Object money2_y=ka2.getMoney();
											int new_money1=(int)money1_y-(int)mon;
											int new_money2=(int)money2_y+(int)mon;
											System.out.println("�������:"+new_money1);
											ka.setMoney(new_money1);
											ka2.setMoney(new_money2);
											System.out.println(list);
										}else{
											
											System.out.println("�������㣡����");
											System.out.println("�������Ϊ:"+ka.getMoney());
										}
									}
								}
							}
						}
					}
				}else{
					System.out.println("���������������������");
				}
				
			}else{
				System.out.println("���������������������");
				
			}
		}
	}

}
