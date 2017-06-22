package zpd.fanxingDemo;

/**
 * Created by Ad on 2016-09-29.
 */
public class Ada3<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        Ada3<String> ada3_1 = new Ada3<>();
        ada3_1.setT("字符串");
        System.out.println(ada3_1.getT());

        Ada3<Integer> ada3_2 = new Ada3<>();
        ada3_2.setT(1992);
        System.out.println(ada3_2.getT());
    }

}
