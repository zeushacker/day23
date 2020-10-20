package com.study;

/*   ������
 * 
 *   - �޸� ���� ��ü�� �����ɶ� ȣ��Ǿ� ��ü�� ������ �ν��ϰ� �ϰ�
 *     �����Ǵ� ��� �������� �ʱ�ȭ�� �ϴµ� �� ������ ��
 *     
 *   - �����ڸ��� Ŭ������� ���ƾ��ϰ� ����Ÿ���� �������� ���ƾ���
 *   - ���α׷��Ӱ� ��� �����ڵ� ���� ���� �ʾ��� ���
 *     �����Ϸ��� default �����ڸ� �ڵ����� ��������   
 *     �����ڿ� ���� ���� ������
 * 
 *   - �������� ���� ������ �ǹ�
 *     - �������� ���� ������ �� ��� �ش� ��ü�� ������ �� �ִ� ���� ������ ����
 *     - Ŭ������ ���� ������ public ���� ���� �Ǿ �����ڸ� 
 *       private �� ���� �ϸ� Ŭ���� ���ο����� ������ ������
 *       
 *    - ���� protected �� ���� �Ǵ� Ŭ������ ��Ӱ����� ��ü�鸸 ������ �� ����
 *    
 *    - �������� ����
 *    
 *       [����������]  [�����ڸ�](�ڷ��� ����1, �ڷ��� ����2.......) {
 *       ���๮;
 *       ���๮;
 *      }
 *      
 *    �������� Ư¡
 *    1. Ŭ������� �Ȱ���.
 *    2. ��ȯ���� ����� �� ����.
 *    3. Ŭ���� ���ο� �����ڰ� ���� ���� �����Ϸ��� �ڵ����� ����
 *    4. �ϳ��� Ŭ�������� ������ ���� �ٸ��ų�, ������ �ڷ����� �ٸ� �����ڰ�
 *        ������ ������ �� �ִ�.(������ �����ε�)
 *    5. �������� ù ��° ���ο��� this(����) �����ڸ� ����ؼ� �ٸ� �����ڸ� 
 *        ȣ���� �� ����
 *    
 *            
 *   ������ �����ε�
 *     - �������� �����ε��� ��ü�� ���� �� �� �ִ� ����� ���� 
 *        �����ϴ� �Ͱ� ������ �޼ҵ��� �����ε��� ����. 
 *        �� �����ڸ� ���� �Ǵ� ���ڷ� ������
 */

public class MyClassEx {

	
	private String name;
	private int age;
	
	public MyClassEx() {
	      name ="����"; 
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
		MyClassEx mc2 = new MyClassEx("�ƶ�ġ");
		MyClassEx mc3 = new MyClassEx("����ġ", 36);
		MyClassEx mc4 = new MyClassEx(30,"���ڹ�");
		
		
		System.out.println(mc1.getName()+","+mc1.getAge());
		System.out.println(mc2.getName()+","+mc2.getAge());
		System.out.println(mc3.getName()+","+mc3.getAge());
		System.out.println(mc4.getName()+","+mc4.getAge());
	}

}
