import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    void testEmpty() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        assertTrue(customList.isEmpty());
        assertTrue(arrayList.isEmpty());

        assertEquals(0, customList.size());
        assertEquals(0, arrayList.size());
    }

    @Test
    void testAddAndGet() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(2, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));
    }

    @Test
    void testAddIndex() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        customList.add(1, 3);
        arrayList.add(1, 3);

        assertEquals(3, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));
        assertEquals(arrayList.get(2), customList.get(2));
    }

    @Test
    void testSet() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        customList.set(1, 3);
        arrayList.set(1, 3);

        assertEquals(2, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(3, customList.get(1));
        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));
    }

    @Test
    void testRemoveIndex() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        customList.remove(1);
        arrayList.remove(1);

        assertEquals(1, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(2, customList.get(0));
        assertEquals(arrayList.get(0), customList.get(0));
    }

    @Test
    void testRemoveObject() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        customList.remove(Integer.valueOf(2));
        arrayList.remove(Integer.valueOf(2));

        assertEquals(1, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(5, customList.get(0));
        assertEquals(arrayList.get(0), customList.get(0));
    }

    @Test
    void testContains() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(2, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(arrayList.contains(2), customList.contains(2));
        assertEquals(arrayList.contains(5), customList.contains(5));
        assertEquals(arrayList.contains(-3), customList.contains(-3));
        assertEquals(arrayList.contains(null), customList.contains(null));
    }

    @Test
    void testIndexOf() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(5);

        assertEquals(4, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(arrayList.indexOf(2), customList.indexOf(2));
        assertEquals(arrayList.indexOf(5), customList.indexOf(5));
        assertEquals(arrayList.indexOf(10), customList.indexOf(10));
    }

    @Test
    void testLastIndexOf() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(5);

        assertEquals(4, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(arrayList.lastIndexOf(2), customList.lastIndexOf(2));
        assertEquals(arrayList.lastIndexOf(5), customList.lastIndexOf(5));
        assertEquals(arrayList.lastIndexOf(10), customList.lastIndexOf(10));
    }

    @Test
    void testClear() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(2, customList.size());
        assertEquals(arrayList.size(), customList.size());

        customList.clear();
        arrayList.clear();

        assertTrue(customList.isEmpty());
        assertTrue(arrayList.isEmpty());

        assertEquals(0, customList.size());
        assertEquals(0, arrayList.size());
    }

    @Test
    void testAddAll() {
        Collection<Integer> collection = new ArrayList<>();
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        collection.add(2);
        collection.add(5);
        collection.add(3);

        customList.addAll(Collections.emptyList());
        assertEquals(0, customList.size());

        customList.addAll(collection);
        arrayList.addAll(collection);

        assertEquals(collection.size(), customList.size());
        assertEquals(collection.size(), arrayList.size());

        assertEquals(2, customList.get(0));
        assertEquals(5, customList.get(1));
        assertEquals(3, customList.get(2));

        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));
        assertEquals(arrayList.get(2), customList.get(2));

    }

    @Test
    void testRemoveAll() {
        Collection<Integer> collection = new ArrayList<>();
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        collection.add(2);
        collection.add(3);

        customList.add(2);
        customList.add(5);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);

        customList.removeAll(Collections.emptyList());
        assertEquals(3, customList.size());

        customList.removeAll(collection);
        arrayList.removeAll(collection);

        assertEquals(1, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(5, customList.get(0));
        assertEquals(arrayList.get(0), customList.get(0));

        assertFalse(customList.contains(2));
        assertFalse(customList.contains(3));
    }

    @Test
    void testRetainAll() {
        Collection<Integer> collection = new ArrayList<>();
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        collection.add(2);
        collection.add(3);

        customList.add(2);
        customList.add(5);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);

        customList.retainAll(collection);
        arrayList.retainAll(collection);

        assertEquals(2, customList.size());
        assertEquals(arrayList.size(), customList.size());

        assertEquals(2, customList.get(0));
        assertEquals(3, customList.get(1));
        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));

        assertFalse(customList.contains(5));

        customList.retainAll(Collections.emptyList());
        assertTrue(customList.isEmpty());
    }

    @Test
    void testContainsAll() {
        Collection<Integer> collection1 = new ArrayList<>();
        Collection<Integer> collection2 = new ArrayList<>();
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        collection1.add(2);
        collection1.add(3);

        collection2.add(10);
        collection2.add(8);

        customList.add(2);
        customList.add(5);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);

        assertEquals(arrayList.containsAll(collection1), customList.containsAll(collection1));
        assertEquals(arrayList.containsAll(collection2), customList.containsAll(collection2));

        assertFalse(customList.contains(10));
        assertFalse(customList.contains(8));

        assertTrue(customList.containsAll(Collections.emptyList()));
    }

    @Test
    void testIterator() {
        CustomList<Integer> customList = new CustomList<>();
        CustomList<Integer> emptyList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);

        Iterator<Integer> customIter = customList.iterator();
        Iterator<Integer> arrayIter = arrayList.iterator();

        assertEquals(arrayList.size(), customList.size());

        while (customIter.hasNext() && arrayIter.hasNext()) {
            assertEquals(customIter.next(), arrayIter.next());
        }

        assertFalse(emptyList.iterator().hasNext());
    }

    @Test
    void testListIterator() {
        CustomList<Integer> customList = new CustomList<>();
        CustomList<Integer> emptyList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);

        ListIterator<Integer> customIter = customList.listIterator();
        ListIterator<Integer> emptyIter = emptyList.listIterator();
        ListIterator<Integer> arrayIter = arrayList.listIterator();

        assertEquals(customList.size(), arrayList.size());

        while (customIter.hasNext() && arrayIter.hasNext()) {
            assertEquals(arrayIter.hasNext(), customIter.hasNext());
            assertEquals(arrayIter.nextIndex(), customIter.nextIndex());
            assertEquals(arrayIter.next(), customIter.next());
        }

        while (customIter.hasPrevious() && arrayIter.hasPrevious()) {
            assertEquals(arrayIter.hasPrevious(), customIter.hasPrevious());
            assertEquals(arrayIter.previousIndex(), customIter.previousIndex());
            assertEquals(arrayIter.previous(), customIter.previous());
        }

        assertFalse(emptyIter.hasNext());
        assertFalse(emptyIter.hasPrevious());
    }

    @Test
    void testNull() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(null);
        customList.add(3);

        arrayList.add(2);
        arrayList.add(null);
        arrayList.add(3);

        assertEquals(3, customList.size());
        assertEquals(3, arrayList.size());

        assertEquals(arrayList.contains(null), customList.contains(null));
        assertEquals(arrayList.indexOf(null), customList.indexOf(null));

        assertEquals(arrayList.remove(null), customList.remove(null));

        assertEquals(2, customList.size());
        assertEquals(2, arrayList.size());
        assertEquals(arrayList.contains(null), customList.contains(null));
        assertEquals(arrayList.indexOf(null), customList.indexOf(null));

        assertEquals(arrayList.get(0), customList.get(0));
        assertEquals(arrayList.get(1), customList.get(1));
    }
}
