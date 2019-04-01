/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 16:03
 */
public class 三目运算9 {
    public static void main(String[] args) {
        /*
        语法：条件?结果1:结果2;
        特点：
        (1)、结果1与结果2必须为同一数据类型
        (2)、如果条件为true，三目运算的最终结果为结果1；否则最终结果为结果2
         */
        float java = 97;
        String result = (java>=98) && (java<=100)?"奖励mp4":"编码";
        int result2 = (java>=98) && (java<=100)?1:0;
        char result3 = (java>=98) && (java<=100)?'好':'差';
        System.out.println(result2);
    }
}
