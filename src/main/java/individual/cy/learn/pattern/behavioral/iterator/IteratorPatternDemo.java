package individual.cy.learn.pattern.behavioral.iterator;

/**
 * @author mystic
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        for (Iterator iter = nameList.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("name = " + name);
        }
    }
}
