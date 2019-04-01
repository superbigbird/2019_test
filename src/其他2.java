import java.util.Scanner;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 14:13
 */
public class 其他2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = input.next();
        //System.out.println("您输入的字符串为："+str1);

        //字符串与字符串之间通过：equals()
        //str1.equals(str2)：boolean
        String str2 = "admin";
        boolean flag = str1.equals(str2);
        System.out.println("flag="+flag);
    }
}
