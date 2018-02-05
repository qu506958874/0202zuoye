package yinhang;

public class Ku {
	
	private int id;
	private String name;
	private int money;
	
	@Override
	public String toString() {
		return "Ku [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
	public Ku(){
		
	}
	public Ku(int id,String name,int money){
		this.id=id;
		this.name=name;
		this.money=money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
