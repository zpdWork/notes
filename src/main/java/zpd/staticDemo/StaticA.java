package zpd.staticDemo;

public class StaticA {

    private static StaticA staticA = new StaticA();

    {
        System.out.println("{}");
    }

    StaticA() {
        System.out.println("StaticA {}");
    }

    static {
        System.out.println("static {}");
    }

    public static void main(String[] args) {
        StaticA staticA = new StaticA();
    }

}
