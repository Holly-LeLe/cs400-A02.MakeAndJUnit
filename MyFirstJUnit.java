import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyFirstJUnit {

    @Test
    public void testSizeOfList() {
        MyList<Boolean> list = new MyList<>();
        assertEquals(0, list.size());
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        assertEquals(4, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testInserting100Numbers() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100; i++)
            list.add(i + 1);
        for (int i = 0; i < 99; i++)
            assertTrue(list.get(i) < list.get(i + 1));
    }

    @Test
    public void testRemovingFromEnds() {
        MyList<String> list = new MyList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("durian");

        assertEquals("durian", list.remove(list.size() - 1));
        assertEquals("cherry", list.get(list.size() - 1));
        assertEquals("apple", list.remove(0));
        assertEquals("banana", list.get(0));
    }

    @Test
    public void testCapacityExpansionPrecondition() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 20; i++)
            list.add(i);
        assertEquals(20, list.size());
        list.add(21);
        assertEquals(21, list.size());
    }
}
