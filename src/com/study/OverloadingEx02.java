package com.study;

/*  �޼ҵ� �����ε�
 * 
 *   - �ϳ��� Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ������ ���� �Ǵ� ���� ����
 *   - ���� �̸��� �޼ҵ忡 ����(�Ű�����, �Ķ����)�� �ٸ���
 *   - �Ű� ������ �ٸ��ٴ� ���� ������ �ٸ��ų�, �ڷ����� �ٸ��ų�, 
 *     �Ű������� ������ �ٸ��ٴ� ���� �ǹ���
 *   - ���� �������� ����� ������ �����ϴ� �޼ҵ���� ��� �̸��� ���� ����� 
 *     �ϰ����� ���� �ϴµ� �ǹ̸� ��
 *     
 *     ���� 
 *      
 *      ����������    ��ȯ��        �޼ҵ��                  (�ڷ��� ����, �ڷ��� ����,...)
 *      (      �������      )      (�ݵ�� �����ؾ���)  (�ݵ�� �ٸ��� ������)
 */



public class OverloadingEx02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);	
	}
	
	private int getLength(String str) {
		System.out.println("�Է��� ���� ���� :"+str.length());
		return 0;
	}
	
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		OverloadingEx02 oe = new OverloadingEx02();
		//oe.getLength(1000);//1
		oe.getLength(1000f);
		oe.getLength(3.14f);
		oe.getLength("10000");
		oe.getLength(1000f);
		
		
	}

}
