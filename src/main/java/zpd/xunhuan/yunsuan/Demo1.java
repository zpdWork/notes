package zpd.xunhuan.yunsuan;

/**
 * Created by Ada on 2017-10-25.
 */
public class Demo1 {

    public static void main(String[] args) {
        int[][] b = {{1}, {2, 2}, {2, 2, 2}};
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            for (int i1 = 0; i1 < b[i].length; i1++) {
                sum += b[i][i1];
            }
        }

//        for (int[] aB : b) {
//            for (int anAB : aB) {
//                sum += anAB;
//            }
//        }

        System.out.println(sum); // 11s
    }

}
