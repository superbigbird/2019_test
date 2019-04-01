import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 17:40
 */
public class 作业13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入考试成绩：");
        int score = input.nextInt();
        if(score==100){
            System.out.println("买一辆玩具车");
        }else if(score>=90){
            System.out.println("买MP4");
        }else if(score>=60){
            System.out.println("买java从入门到放弃!!!");
        }else{
            System.out.println("什么都不买");
        }
    }
}
