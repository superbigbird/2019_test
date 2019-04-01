import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 15:19
 */
public class 选择结构5 {
    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        System.out.print("请输入您的java成绩：");
        float java = input.nextFloat();
        if(java>=90){
            System.out.println("奖励一朵小红花");
            System.out.println("奖励一个大红花");
        }


    }
}
