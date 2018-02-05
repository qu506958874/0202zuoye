package yinhang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******欢迎使用人民银行********");
		List<Ku> list=new ArrayList<Ku>();
		List kabao=new ArrayList();
		List qian=new ArrayList();
		
		Kaihu<Integer> k1=new Kaihu<Integer>();
		Cunchu<Integer> c1=new Cunchu<Integer>();
		Qukuan<Integer> q1=new Qukuan<Integer>();
		Zhuanzhang<Integer> z1=new Zhuanzhang<Integer>();
		while(true){
			System.out.println("---------------------------");
			System.out.println("1---------开户");
			System.out.println("2---------存储");
			System.out.println("3---------取款");
			System.out.println("4---------转账");
			System.out.println("---------------------------");
			Scanner scanner=new Scanner(System.in);
			int in=scanner.nextInt();
			if(in==1){
				//k1.kaihu(in);
				System.out.println("您选择的是开户业务");
				//Ku kaihu=new Ku();
				
				System.out.println("请输入您设置的卡号:");
				int id=scanner.nextInt();
				//kaihu.setId(id);
				//int kahao=kaihu.getId();
				
				System.out.println("请输入您的姓名:");
				String name=scanner.next();
				//kaihu.setName(name);
				
				System.out.println("请输入您要存储的金额:");
				int money=scanner.nextInt();
				//kaihu.setMoney(money);
				//int yue=kaihu.getMoney();
				
				//输出之前的list
				System.out.println(list);
				//把刚开的户放到list里
				Ku kaihu=new Ku(id,name,money);
				System.out.println(kaihu.toString());
				list.add(kaihu);
				kabao.add(id);
				qian.add(money);
				
				
				System.out.println("恭喜您开户成功！！！");
				
			}else if(in==2){
				//c1.Cunchu(in);
				System.out.println("您选择的是存储业务");
				System.out.println("请输入您的卡号:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						//Object ka=kabao.get(i);
						Ku ka=(Ku)list.get(i);
						//System.out.println(obj);
						if(id.equals(ka.getId())){
							System.out.println("请输入您存入的金额:");
							int money=scanner.nextInt();
							Object yue=ka.getMoney();
							int new_money=(int)yue+(int)money;
							System.out.println("您的余额为:"+new_money);
							ka.setMoney(new_money);
						}
					}
				}else{
					System.out.println("您输入的有误，请重新输入");
				}
			}else if(in==3){
				//q1.Qukuan(in);
				System.out.println("您选择的是取款业务");
				System.out.println("请输入您的卡号:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						Ku ka=(Ku)list.get(i);
						if(id.equals(ka.getId())){
							System.out.println("请输入您要取的金额:");
							int money=scanner.nextInt();
							Object yue=ka.getMoney();
							int new_money=(int)yue-(int)money;
							System.out.println("您的余额为:"+new_money);
							ka.setMoney(new_money);
							System.out.println(list);
						}
					}
				}else{
					System.out.println("您输入的有误，请重新输入");
				}
				
			}else if(in==4){
				//z1.Zhuanzhang(in);
				System.out.println("您选择的是转账业务");
				System.out.println("请输入您的卡号:");
				Object id=scanner.nextInt();
				if(kabao.contains(id)){
					for(int i=0;i<kabao.size();i++){
						Ku ka=(Ku)list.get(i);
						if(id.equals(ka.getId())){
							System.out.println("请输入您要转账的卡号:");
							Object id2=scanner.nextInt();
							if(kabao.contains(id2)){
								for(int j=0;j<kabao.size();j++){
									Ku ka2=(Ku)list.get(j);
									System.out.println(ka2);
									if(id2.equals(ka2.getId())){
										System.out.println("请输入您要转账的金额:");
										Object mon=scanner.nextInt();
										if((int)mon<ka.getMoney()&&(int)mon>0){
											Object money1_y=ka.getMoney();
											Object money2_y=ka2.getMoney();
											int new_money1=(int)money1_y-(int)mon;
											int new_money2=(int)money2_y+(int)mon;
											System.out.println("您的余额:"+new_money1);
											ka.setMoney(new_money1);
											ka2.setMoney(new_money2);
											System.out.println(list);
										}else{
											
											System.out.println("您的余额不足！！！");
											System.out.println("您的余额为:"+ka.getMoney());
										}
									}
								}
							}
						}
					}
				}else{
					System.out.println("您输入的有误，请重新输入");
				}
				
			}else{
				System.out.println("您输入的有误，请重新输入");
				
			}
		}
	}

}
