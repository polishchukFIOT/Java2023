
import java.util.Comparator;

public class SortByFreshness implements Comparator<Flowers>{
    @Override
    public int compare(Flowers one, Flowers two) {
        return one.getFreshness() - two.getFreshness();
    }
}