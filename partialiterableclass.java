import java.util.Arrays;
import java.util.Iterator;

class PartialIterableClass implements Iterable<String> {
    private String[] things;
    public PartialIterableClass( String[] things ){
        this.things = things;
    }

    @Override
    public Iterator<String> iterator() {
        return Arrays.asList(things).iterator();
    }
}
