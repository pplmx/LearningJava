package individual.cy.learn.pattern.behavioral.iterator;

/**
 * @author mystic
 */
public class NameList implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }

}
