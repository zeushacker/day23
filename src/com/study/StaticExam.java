package com.study;

/*
 *  static  �����
 *  
 *  - �޼ҵ峪 ��� ������ ������ �� ������ ���������� Ŭ���� ���� ���� �Ұ�
 *  - static Ű���带 ����ϸ� static ����(Ŭ��������), static �޼ҵ�� ��Ī��
 *  - ��������� ��� �޼ҵ�� �ش� ��ü�� �����ɴ� heap ������ ������ 
 *  - static ���� ����� �ʵ�, �޼ҵ�� static ������ �����ϰ� ��������鼭
 *     ��� ��ü���� ����� �� �ִ� ���� ������ ������ ������
 *  - ��ü�� �������� �ʴ��� ����� �� ����
 *  - Ŭ������.������ �Ǵ� Ŭ������.�޼ҵ�� ���� ���� ����
 *  
 *  static �޼ҵ� �����
 *   [����������] static ��ȯ�� �޼ҵ��(�ڷ��� ����1,�ڷ��� ����2..){}
 *   
 *  static �ʵ�(�������) �����
 *  [����������] static �ڷ��� ������;
 *  
 */

class StaticEx {
	int x; // �������(��ü�� �����ؾ߸� ���ٰ���)
	static int y; // Ŭ�������� (��ü�� �������� �ʰ� ���ٰ���)
}

public class StaticExam {

	public static void main(String[] args) {
		
		//System.out.println(StaticEx.x);
		// ��ü�� �����ؾ߸� ���ٰ���
		System.out.println(StaticEx.y);
		// Ŭ���������� �ʱ�ȭ�� ���� ���� ��� �ڵ����� 0���� �ʱ�ȭ��
		StaticEx.y = 100;
		System.out.println(StaticEx.y);
		
		StaticEx se = new StaticEx();
		System.out.println(se.x);
		System.out.println(se.y);
		
		
		

	}

}
