package individual.cy.learn.pattern.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2/27/2018 17:19
 */
public class JavaDesigner implements IDesigner {
    private final String name;

    public JavaDesigner(String name) {
        this.name = name;
    }

    @Override
    public void implementsDemand(String demandName) {
        System.out.println("A Java Designer [ " + name + " ] implemented demand: {{ " + demandName + " }} in JAVA!");
    }
}
