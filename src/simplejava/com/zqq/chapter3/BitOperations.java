package simplejava.com.zqq.chapter3;

/**
 * 
* @ClassName: BitOperations 
* @Description: 位运算  &（与） |（或） ~（非） ^（异或）
* @author zhangqianqiang 
* @date 2018年9月29日 上午11:45:18 
*
 */
public class BitOperations {

	/** 
	* @Title: main 
	* @Description: TODO(测试位运算) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public static void main(String[] args) {
		int n = 10;
		int forthbitforright = n&0b1000;
		System.out.println(forthbitforright); //打印8
		
		//>>右移    << 左移  >>> 带着符号位右移
		System.out.println(8>>2); //打印2
		System.out.println(8<<2);//打印32
		System.out.println(8>>>2);//打印2
		System.out.println(-8>>>2);//打印1073741822

	}

}
