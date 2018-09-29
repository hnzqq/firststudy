package simplejava.com.zqq.chapter3;

import java.util.Scanner;

/**
 * 
* @ClassName: InputTest 
* @Description: 控制台输入输出流
* @author zhangqianqiang 
* @date 2018年9月29日 下午12:07:30 
*
 */
public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		int monthNum = (int) (Math.random() * 10);
		System.out.println("可能你需要再等" + monthNum + "个月才会转运。");
	}

}
