package individual.cy.learn.pattern.creational.builder;

/**
 * @author mystic
 */
public class BuilderPatternTester {
    public static void main(String[] args) {
        Computer hp = Computer.builder("i9", "32G").build();
        Computer dell = Computer.builder("i9", "32G")
            .display("Samsung")
            .headset("Beats")
            .keyboard("Filco")
            .build();
        System.out.println("dell = " + dell);
        System.out.println("hp = " + hp);
    }
}
