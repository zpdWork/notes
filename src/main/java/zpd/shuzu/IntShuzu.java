package zpd.shuzu;

import java.util.Arrays;

/**
 * int 数组练习.
 * <p/>
 * Created by Ada on 2016-06-15.
 */
public class IntShuzu {

    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4, 7, 6, 5};
        int total = 0;
        for (int i1 : i) {
            total += i1;
        }
        System.out.println(total);

        /** 得到最大值. **/
        // 第一种
        //int max = i[0];
        //for (int i1 = 1; i1 < i.length; i1++) {
        //    max = max > i[i1] ? max : i[i1];
        //}
        //System.out.println(max);
        // 第二种
        Arrays.sort(i);
        System.out.println("最大值：" + i[i.length - 1]);// 得到最大值
        System.out.println("最小值：" + i[0]); // 得到最小值
        for (int i_1 : i) {
            System.out.println(i_1);
        }
        // sort默认正序，想倒序:反着输出，但是应该有一个倒序算法的.
        for (int i1 = i.length - 1; i1 >= 0; i1--) {
            System.out.println(i[i1]);
        }

        System.out.println(Arrays.binarySearch(i, 5)); // 通过二分查找法，在数组中查找指定的内容


    }

}
