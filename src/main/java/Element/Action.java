package Element;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Action {
    Collection<Element> getUniqueElements(Collection<Element> collection) {
        return collection.stream()
                .filter(e -> e.getAge() > 20)
                .collect(Collectors.toCollection(() -> new TreeSet<Element>(
                        Comparator.comparing(element -> element.getNum()))));
    }
}
