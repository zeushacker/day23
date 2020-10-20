package com.study;

/*   생성자
 * 
 *   - 메모리 내에 객체가 생성될때 호출되어 객체의 구조를 인식하게 하고
 *     생성되는 멤버 변수들의 초기화를 하는데 그 목적을 둠
 *     
 *   - 생성자명은 클래스명과 같아야하고 리턴타입을 정의하지 말아야함
 *   - 프로그래머가 어떠한 생성자도 정의 하지 않았을 경우
 *     컴파일러가 default 생성자를 자동으로 생성해줌   
 *     생성자에 인자 없는 생성자
 * 
 *   - 생성자의 접근 제한의 의미
 *     - 생성자의 접근 제한을 둘 경우 해당 객체를 생성할 수 있는 접근 권한을 가짐
 *     - 클래스의 접근 제한이 public 으로 정의 되어도 생성자를 
 *       private 로 정의 하면 클래스 내부에서만 접근이 가능함
 *       
 *    - 만약 protected 로 정의 되는 클래스는 상속관계의 객체들만 생성할 수 있음
 *    
 *    - 생성자의 구성
 *    
 *       [접근제한자]  [생성자명](자료형 인자1, 자료형 인자2.......) {
 *       수행문;
 *       수행문;
 *      }
 *      
 *    생성자의 특징
 *    1. 클래스명과 똑같다.
 *    2. 반환형을 명시할 수 없다.
 *    3. 클래스 내부에 생성자가 없을 때는 컴파일러가 자동으로 생성
 *    4. 하나의 클래스에는 인자의 수가 다르거나, 인자의 자료형이 다른 생성자가
 *        여러개 존재할 수 있다.(생성자 오버로딩)
 *    5. 생성자의 첫 번째 라인에서 this(인자) 생성자를 사용해서 다른 생성자를 
 *        호출할 수 있음
 *    
 *            
 *   생성자 오버로딩
 *     - 생성자의 오버로딩은 객체를 생성 할 수 있는 방법의 수를 
 *        제공하는 것과 같으며 메소드의 오버로딩과 같다. 
 *        각 생성자를 구분 또는 인자로 구별함
 */

public class MyClassEx {

	
	private String name;
	private int age;
	
	public MyClassEx() {
	      name ="무명"; 
	}
	
	public MyClassEx(String n) {
		name = n;
	}
	
	public MyClassEx(int a, String n) {
		age = a;
		name = n;
	}
	
	public MyClassEx(String n, int a) {
		age =a;
		name = n;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {
	
		MyClassEx mc1 = new MyClassEx();
		MyClassEx mc2 = new MyClassEx("아라치");
		MyClassEx mc3 = new MyClassEx("마루치", 36);
		MyClassEx mc4 = new MyClassEx(30,"빅자바");
		
		
		System.out.println(mc1.getName()+","+mc1.getAge());
		System.out.println(mc2.getName()+","+mc2.getAge());
		System.out.println(mc3.getName()+","+mc3.getAge());
		System.out.println(mc4.getName()+","+mc4.getAge());
	}

}
