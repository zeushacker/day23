package com.study;

/*  �簢���� ����  : ���� * ���� 
 *  ���� ����        : ������ * ������ * 3.141592
 * 
 */
public class OverloadingEx03 {

	public int area(int w, int h) {
	     return w * h;	
	}
	
	public double area(int r) {
		return (double)r * r * 3.141592;
	}

	public void write(int result) {
		System.out.println("�簢���� ���� :"+result);
	}
	
	public void write(double result) {
		System.out.println("�� ���� :"+result);
	}
	
	public static void main(String[] args) {
		OverloadingEx03 oe3 = new OverloadingEx03();
		int re = oe3.area(10, 5);
		double ci = oe3.area(10);
		
		oe3.write(re);
		oe3.write(ci);

	}

}
