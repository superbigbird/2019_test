import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 15:43
 */
public class if_else练习7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请录入张浩的java成绩(0~100分)：");
        float java = input.nextFloat();
        if((java>=98) && (java<=100)){
            System.out.println("奖励mp4");
        }else{
            System.out.println("编码!!!");
        }
    }
}
