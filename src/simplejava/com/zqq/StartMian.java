package simplejava.com.zqq;

import java.util.ArrayList;

public class StartMian {
	/**
	 * 整个学习运行程序的起点
	 * @param args
	 */
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.size();
	list.toArray(new Integer[10]);
	list.addAll(new ArrayList<Integer>());
	list.contains(1);
	list.get(0);
	list.isEmpty();
	list.iterator();
	list.set(0, 12);
	list.clear();
	list.remove(0);
	list.indexOf(1);
	list.stream();
}
}
