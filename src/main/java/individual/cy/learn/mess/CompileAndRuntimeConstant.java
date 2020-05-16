package individual.cy.learn.mess;

/**
 * @author mystic
 */
public class CompileAndRuntimeConstant {
    public static void main(String[] args) {
        // No load static block
        System.out.println(Test.NAME);
        // No load static block
        System.out.println(Test.SCORE);
        // No load static block
        System.out.println(Test.PI);
        // load static block
        System.out.println(Test.CC);
        // load static block(cc and age only load once totally)
        System.out.println(Test.age);
        System.out.println();
    }
}

class Test {
    /**
     * The following three: compile-time constants
     */
    public static final String NAME = "shanxi";
    public static final int SCORE = 85;
    public static final double PI = 3.1415;

    /**
     * The following two: runtime-constants
     */
    public static final Integer CC = 2;
    public static int age = 23;

    static {
        System.out.println("Test static block: " + PI);
    }

    /**
     * The following one: compile-time constant
     */
    private final int gg = 10;
    private int hh = gg;

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }
}