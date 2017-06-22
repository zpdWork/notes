package zpd.string;

/**
 * String，不可改变的是：在内存中的空间，每当改变后都会return new String.
 * <p/>
 * Created by Ada on 2016-06-15.
 */
public class StringDemo {

    public static void main(String[] args) {

        String str = "asd";

        System.out.println(str);

        String strObj = new String("aaa");
        strObj = "bbb";

        System.out.println(strObj);


    }

}
