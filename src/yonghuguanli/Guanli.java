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
		System.out.println("********欢迎使用用户管理系统********");
		while(true){
			System.out.println("---------------------------");
			System.out.println("1---------添加用户");
			System.out.println("2---------删除用户");
			System.out.println("3---------修改用户");
			System.out.println("4---------查询用户");
			System.out.println("---------------------------");
			Scanner scanner=new Scanner(System.in);
			int in=scanner.nextInt();
			if(in==1){
				System.out.println("您选择的是添加用户功能");
				System.out.println("请设置您的学号:");
				int id=scanner.nextInt();
				System.out.println("请设置您的姓名:");
				String name=scanner.next();
				System.out.println("请设置您的性别:");
				String sex=scanner.next();
				//输出之前添加的用户
				System.out.println(list);
				//把刚添加的用户放到list里
				Person p=new Person(id,name,sex);
				System.out.println(p.toString());
				list.add(p);
				xuehao.add(id);
				
				
			}else if(in==2){
				System.out.println("您选择的是删除用户功能");
				System.out.println("请输入您要删除的学号:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Object xh=xuehao.get(i);
						if(id.equals(xh)){
							list.remove(i);
							System.out.println("恭喜您删除成功！！！");
						}
							
						
					}
				}else{
					System.out.println("您输入的有误,请重新输入！");
				}
			}else if(in==3){
				System.out.println("您选择的是修改用户功能");
				System.out.println("请输入您要修改的学号:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Person p1=(Person)list.get(i);
						if(id.equals(p1.getId())){
							
							System.out.println("请输入您要修改的姓名:");
							String name_h=scanner.next();
							System.out.println("请输入您要修改的性别:");
							String sex_h=scanner.next();
							p1.setName(name_h);
							p1.setSex(sex_h);
							
						}
					}
				}else{
					System.out.println("您输入的有误,请重新输入！");
				}
			}else if(in==4){
				System.out.println("您选择的是查询用户功能");
				System.out.println("请输入您要查询的学号:");
				Object id=scanner.nextInt();
				if(xuehao.contains(id)){
					for(int i=0;i<xuehao.size();i++){
						Person p2=(Person)list.get(i);
						if(id.equals(p2.getId())){
							
							System.out.println(p2);
						}
							
						
					}
				}else{
					System.out.println("您输入的有误,请重新输入！");
				}
			}else{
				System.out.println("您输入的有误,请重新输入！！！");
			}
		}
	}

}
