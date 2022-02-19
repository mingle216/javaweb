package java基础加强.junit;
/**
 * @author mingle
 * @date 2022/2/19 21:01
 * @description 计算器测试类
 */
public class CalculatorTest {
    public static void main(String[] args){
        //创建对象
        Calculator c=new Calculator();
        //调用ADD方法
        int result=c.add(1,2);
        System.out.println(result);
        //调用sub方法
        int result2=c.add(1,1);
        System.out.println(result2);

    }

}
