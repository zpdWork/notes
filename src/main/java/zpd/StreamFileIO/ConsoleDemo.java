package zpd.StreamFileIO;

import java.util.Scanner;

/**
 * 控制台输入.
 * <p/>
 * Created by Ad on 2016-07-07.
 */
public class ConsoleDemo {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入起始表：");
        Integer startT = cin.nextInt();
        System.out.println("请输入终止表：");
        Integer endT = cin.nextInt();
        System.out.println("起始表：" + startT + "，终止表：" + endT);
    }

}
