package simplejava.com.zqq.chapter3;

/**
 * 
* @ClassName: Size 
* @Description: 枚举类型 衣服尺码
* @author zhangqianqiang 
* @date 2018年9月29日 下午12:26:41 
*
 */
public enum Size {
	S,M,L,XL,XXL,XXXL
}
class test{
	public static void main(String[] args) {
		Size p = Size.S;
		Size a = Size.XXXL;
		System.out.println(p.equals(Size.S));
	}
}
