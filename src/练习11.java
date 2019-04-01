import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 16:46
 */
public class 练习11 {
    public static void main(String[] args) {
        //1、从键盘输入用户名与密码
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();
        //2、开始判断admin、123
        boolean flag1 = "admin".equals(username);
        boolean flag2  = "123".equals(pwd);
        String result = flag1&&flag2?"登录成功":"登录失败";
        System.out.println(result);
    }
}
