/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 14:45
 */
public class 逻辑运算符与逻辑表达式4 {
    public static void main(String[] args) {
        //常见的逻辑运算符：&&(与)、||(或)、!(非)
        //与语法：条件1 && 条件2
        //特点：当条件1与条件2同时为true，最终结果才为true；否则均为false
        //逻辑表达式：通过逻辑运算符连接起来的式子称之为逻辑表达式，最终结果为boolean
        boolean flag1 = (3>2) && (20>10);
        //System.out.println("flag1="+flag1);

        //或(||)： 条件1 || 条件2
        //特点：当条件1与条件2同时为false，最终结果才为false；否则均为true
        boolean flag2 = (3>20) || (20>100);
        //System.out.println("flag2="+flag2);

        //非：!条件
        //特点：当条件为true，则非一把后为false；当条件为false，非一把后为true
        boolean flag3 = !(300>20);
        System.out.println("flag3="+flag3);
    }
}
