package simplejava.com.zqq.chapter3;

/**
 * 
 * @ClassName: Constants
 * @Description: chapter3.4.2
 * @author zhangqianqiang
 * @date 2018年9月29日 上午10:41:39
 *
 */
public class Constants {
	/**
	 * 
	* @Title: main 
	* @Description: 常量的学习
	* 					CH_PER_INCH 可以写成常量 static
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	 */
	public static void main(String[] args) {
		final double CH_PER_INCH = 2.54;
		double pageWidth = 8.5;
		double pageHeight = 11;
		System.out.println("Page size in centimeters:" + pageWidth * CH_PER_INCH + " by " + pageHeight * CH_PER_INCH);
	}
}
