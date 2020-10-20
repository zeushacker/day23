package com.study;

/*   this와 this()
 *   
 *      - this 란 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수
 *      - 객체의 주소는 생성 전까지는 모르기 때문에 객체 생성 후 자신의 주소로 대체됨
 *      - this() 는 현재 객체의 생성자를 의미함
 *      - 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우에
 *         this() 라는 키워드로 호출함
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
