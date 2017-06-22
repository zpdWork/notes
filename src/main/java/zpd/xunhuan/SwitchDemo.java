package zpd.xunhuan;

/**
 * switch循环.
 * <p/>
 * switch语句中的变量类型只能为byte、short、int或者char。
 * switch语句可以拥有多个case语句。每个case后面跟一个要比较的值和冒号。
 * case语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
 * 当变量的值与case语句的值相等时，那么case语句之后的语句开始执行，直到break语句出现才会跳出switch语句。3
 * 当遇到break语句时，switch语句终止。程序跳转到switch语句后面的语句执行。case语句不必须要包含break语句。如果没有break语句出现，程序会继续执行下一条case语句，直到出现break语句。
 * switch语句可以包含一个default分支，该分支必须是switch语句的最后一个分支。default在没有case语句的值和变量值相等的时候执行。default分支不需要break语句。
 * <p/>
 * <p/>
 * <p/>
 * Created by Ada on 2016-06-13.
 */
public class SwitchDemo {

    public static void main(String[] args) {
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                //break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                //break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);


    }

}
