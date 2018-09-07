package zpd.sort;/**
 * .
 *
 * @author zhangPengdong.
 * @date 2018-09-07 15:17.
 */

/**
 * class.
 *
 * @author zhangPengdong.
 * @date 2018/09/07.
 */
public class KuaiSu {

    public static void main(String[] args) {
        Integer[] ints = {18, 32, 23, 66, 13, 97, 64, 64, 78};

        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }

//        sort(ints, 0, ints.length - 1);
        quickSort(ints, 0, ints.length - 1);

        System.out.println("----------");
        for (Integer integer : ints) {
            System.out.print(integer + " ");
        }
    }

    private static int sort(Integer[] ints, int s, int e) {
        int tmp = ints[s];
        while (s < e) {
            while (s < e && ints[e] >= tmp) {
                e--;
            }
            ints[s] = ints[e];
            while (s < e && ints[s] <= tmp) {
                s++;
            }
            ints[e] = ints[s];
        }
        ints[s] = tmp;
        return s;
    }

    private static void quickSort(Integer[] ints, int s, int e) {
        if (s < e) {
            int tmp = sort(ints, s, e);
            sort(ints, s, tmp - 1);
            sort(ints, tmp + 1, e);
        }
    }

}
