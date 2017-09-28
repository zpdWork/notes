package zpd.jdk8.object;

import java.util.Objects;

/**
 * Created by Ada on 2017-9-28.
 */
public class Demo1 {

    public static void main(String[] args) {
        testIsNull();
    }

    private static void testIsNull(){
        System.out.println(Objects.isNull(null));
    }

}
