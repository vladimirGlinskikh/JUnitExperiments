package quality;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }
}
