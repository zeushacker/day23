package com.study;

/*
 *  static  예약어
 *  
 *  - 메소드나 멤버 변수에 정의할 수 있으며 지역변수나 클래스 에는 정의 불가
 *  - static 키워드를 사용하면 static 변수(클래스변수), static 메소드라 지칭함
 *  - 멤버변수나 멤버 메소드는 해당 객체가 생성될대 heap 영역에 존재함 
 *  - static 으로 선언된 필드, 메소드는 static 영역에 유일하게 만들어지면서
 *     모든 객체들이 사용할 수 있는 공유 개념을 가지기 때문임
 *  - 객체를 생성하지 않더라도 사용할 수 있음
 *  - 클래스명.변수명 또는 클래스명.메소드명 으로 접근 가능
 *  
 *  static 메소드 선언법
 *   [접근제한자] static 반환형 메소드명(자료형 인자1,자료형 인자2..){}
 *   
 *  static 필드(멤버변수) 선언법
 *  [접근제한자] static 자료형 변수명;
 *  
 */

class StaticEx {
	int x; // 멤버변수(객체를 생성해야만 접근가능)
	static int y; // 클래스변수 (객체를 생성하지 않고도 접근가능)
}

public class StaticExam {

	public static void main(String[] args) {
		
		//System.out.println(StaticEx.x);
		// 객체를 생성해야만 접근가능
		System.out.println(StaticEx.y);
		// 클래스변수는 초기화를 하지 않을 경우 자동으로 0으로 초기화됨
		StaticEx.y = 100;
		System.out.println(StaticEx.y);
		
		StaticEx se = new StaticEx();
		System.out.println(se.x);
		System.out.println(se.y);
		
		
		

	}

}
