import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 17:09
 */
public class else_if12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的余额：");
        int money = input.nextInt();
        if(money>500){
            System.out.println("买凯迪拉克");
        }else if(money>100){
            System.out.println("买帕萨特");
        }else if(money>50){
            System.out.println("买伊兰特");
        }else if(money>10){
            System.out.println("买奥拓");
        }else{//money<=10
            System.out.println("坐11路公交或者骑摩拜");
        }
//        特点：if必须书写，else-if可以写多个,else可以写也可以不写
    }
}
