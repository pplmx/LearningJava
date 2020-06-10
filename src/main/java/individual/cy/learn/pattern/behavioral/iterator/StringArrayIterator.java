package individual.cy.learn.pattern.behavioral.iterator;

/**
 * @author mystic
 */
public class StringArrayIterator implements Iterator{

    private final String[] args;
    private int idx;

    public StringArrayIterator(String[] args) {
        this.args = args;
    }

    @Override
    public boolean hasNext() {
        return idx < args.length;
    }

    @Override
    public Object next() {
        if(idx < args.length){
            return args[idx++];
        }
        return null;
    }
}
