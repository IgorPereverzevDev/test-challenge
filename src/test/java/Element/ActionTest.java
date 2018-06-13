package Element;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

public class ActionTest {

    private Collection<Element> collection = new ArrayList<>();

    @Test
    public void getUniqueElementsSuccess() {
        Action action = new Action();

        Element elementOne = new Element();
        elementOne.setNum(1);
        elementOne.setAge(21);

        Element elementTwo = new Element();
        elementTwo.setNum(2);
        elementTwo.setAge(31);

        Element elementThree = new Element();
        elementThree.setNum(2);
        elementThree.setAge(31);

        collection.add(elementOne);
        collection.add(elementTwo);
        collection.add(elementThree);

        assertFalse(action.getUniqueElements(collection).isEmpty());
        assertEquals(2, action.getUniqueElements(collection).size());

    }

    @Test
    public void getUniqueElementsFail() {
        Action action = new Action();

        Element elementOne = new Element();
        Element elementTwo = new Element();

        collection.add(elementOne);
        collection.add(elementTwo);

        assertTrue(action.getUniqueElements(collection).isEmpty());

    }

}