package zpd.sort;

/**
 * 直接插入排序.
 *
 * @author zhangPengdong.
 * @date 2018/09/07.
 */
public class ZhiJieChaRu {

    public static void main(String[] args) {

        Integer[] ints = {18, 32, 23, 66, 13, 97, 64, 64, 78};
        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }

        int j;
        int tmp;
        for (int i = 1; i < ints.length; i++) {
            // 取当前值
            tmp = ints[i];
            // 用当前值与他之前的所有值循环比较
            // 小于 则 把这个大的值往后一位放
            // 第一种
//            for (j = i - 1; j >= 0 && tmp < ints[j]; j--) {
//                ints[j + 1] = ints[j];
//            }
            // 第二种
            j = i - 1;
            while (j >= 0 && tmp < ints[j]) {
                ints[j + 1] = ints[j];
                j--;
            }
            // 将当前值 放置新的位子
            ints[j + 1] = tmp;
        }

        System.out.println("-------------");
        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }

    }

}
