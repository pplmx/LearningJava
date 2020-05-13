package individual.cy.learn.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2/27/2018 17:19
 * @since JDK1.8.0_144
 */
public class JavaProgrammer implements IProgrammer {
    private final String name;

    public JavaProgrammer(String name) {
        this.name = name;
    }

    @Override
    public void implementsDemand(String demandName) {
        System.out.println(name + " implemented demand:" + demandName + " in JAVA!");
    }
}
