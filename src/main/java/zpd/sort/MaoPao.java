package zpd.sort;/**
 * .
 *
 * @author zhangPengdong.
 * @date 2018-09-07 14:48.
 */

/**
 * class.
 *
 * @author zhangPengdong.
 * @date 2018/09/07.
 */
public class MaoPao {

    public static void main(String[] args) {
        Integer[] ints = {18, 32, 23, 66, 13, 97, 64, 64, 78};
        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }

        int tmp;
        for (int i = 0; i < ints.length-1; i++) {

            for (int j = 0; j < ints.length - 1 - i; j++) {
                // 用j的值与他下一个比大小
                // 大于 则交换位置
                // 一直比较到最后
                // -i可以减少循环次数
                if (ints[j] > ints[j + 1]) {
                    tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }

        System.out.println("-------------");
        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }
    }

}
