package simplejava.com.zqq.chapter3;

public class SelfOperation {

	/**
	 * 
	* @Title: main 
	* @Description: 理解自运算
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	 */
	public static void main(String[] args) {
		int m = 7;
		int n = 7;
		int a = 2 + m++;//先运算，再自增
		int b = 2 + ++n;//先自增，再运算
		System.out.println("a = " + a + ",b = " + b);

	}

}
