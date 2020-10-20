package com.study;

/*   this�� this()
 *   
 *      - this �� Ư�� ��ü ������ �ڽ��� �����Ǿ��� ���� �ּ� �� ����
 *      - ��ü�� �ּҴ� ���� �������� �𸣱� ������ ��ü ���� �� �ڽ��� �ּҷ� ��ü��
 *      - this() �� ���� ��ü�� �����ڸ� �ǹ���
 *      - ������ �ȿ��� �����ε� �� �ٸ� �����ڸ� ȣ���� ��쿡
 *         this() ��� Ű����� ȣ����
 */


class ThisEx {
	
	String name, jumin, tel;
	
	public ThisEx() {
	this.name = "Guest";
	this.jumin="123456-1234567";
	this.tel ="010-1234-1234";
	}
	
	public ThisEx(String name) {
		this();
		this.name = name;
	}
	
	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;
	}
	
	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}
	
}

public class ThisEx1 {

	public static void main(String[] args) {
		
		ThisEx tt = new ThisEx();
		System.out.println("Name : "+tt.getName());
		System.out.println("Jumin :"+tt.getJumin());
		System.out.println("Tel :"+tt.getTel());
			
	}

}
