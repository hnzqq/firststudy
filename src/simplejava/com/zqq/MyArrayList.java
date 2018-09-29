package simplejava.com.zqq;

import java.util.Arrays;

public class MyArrayList {

	private Object[] element;
	
	private static final int initialSize = 10; 
	
	private int size = 0;
	
	public MyArrayList() {
		element = new Object[initialSize];
	}
	public MyArrayList(int initialSize) {
		element = new Object[initialSize];
	}
	
	/**
	 * ���
	 * @param obj
	 * @return
	 */
	public int add(Object obj) {
		checkAndExpansion();
		element[size] = obj;
		size++;
		return size;
	}
	
	/**
	 * ��鲢�������������
	 */
	private void checkAndExpansion() {
		if(size == element.length) {
			Object[] newEle = new Object[(int) (size*1.5)];
			element = Arrays.copyOf(element, newEle.length);
		}
	}
}
