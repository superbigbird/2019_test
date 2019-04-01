import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 15:48
 */
public class 练习8 {
    public static void main(String[] args) {
        //图灵(英国)、爱因斯坦、牛顿
        //建立管道
        Scanner input = new Scanner(System.in);
        //开始接收键盘录入
        System.out.print("STB的成绩是：");
        //ctrl+q
        float stb = input.nextFloat();
        System.out.print("Java的成绩是：");
        float java = input.nextFloat();
        System.out.print("SQL的成绩是：");
        float sql = input.nextFloat();
        System.out.println("-----------------------------");
        System.out.println("STB\t\tJava\tSQL");
        System.out.println(""+stb+"\t\t"+java+"\t\t"+sql+"");
        System.out.println("-----------------------------");
        //第三部分
        //计算成绩差
        float cha = java-sql;
        if(cha<0){
            cha=-cha;
        }
        System.out.println("Java和SQL的成绩差："+cha+"");
        float pingJunFen = (java+sql+stb)/3;
        System.out.println("3门课的平均分："+pingJunFen+"");
    }
}
