import java.util.Scanner;

public class IF {

    public static void main(String[] args) {


           Scanner scanner = new Scanner(System.in);
           System.out.println("请输入第一个数值：");
           int a = scanner.nextInt();

            System.out.println("请输入第二个数值：");
            int b = scanner.nextInt();
            int c=a+b;
            System.out.println(a+"+"+b+"="+c);
        }

}
