package zpd.yunsuan;

/**
 * Created by Ad on 2016-10-19.
 */
public class Mo {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            i = i + 1;
            if (i == 5) {
                break;
            }
        }
        System.out.print(i); // 输出11，为什么？自己看.
    }

}
