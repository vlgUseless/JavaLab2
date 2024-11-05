import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomListTest {

    @Test
    void testEmpty() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        assertEquals(customList.isEmpty(), arrayList.isEmpty());
        assertEquals(customList.size(), Integer.valueOf(0));
        assertEquals(customList.size(), arrayList.size());
    }

    @Test
    void testAddAndGet() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(customList.size(), Integer.valueOf(2));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), arrayList.get(0));
        assertEquals(customList.get(1), arrayList.get(1));
    }

    @Test
    void testAddIndex() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.add(1, 3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1, 3);

        assertEquals(customList.size(), Integer.valueOf(3));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), arrayList.get(0));
        assertEquals(customList.get(1), arrayList.get(1));
        assertEquals(customList.get(2), arrayList.get(2));
    }

    @Test
    void testSet() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.set(1, 3);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.set(1, 3);

        assertEquals(customList.size(), Integer.valueOf(2));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(1), Integer.valueOf(3));
        assertEquals(customList.get(0), arrayList.get(0));
        assertEquals(customList.get(1), arrayList.get(1));
    }

    @Test
    void testRemoveIndex() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.remove(1);

        arrayList.add(2);
        arrayList.add(5);
        arrayList.remove(1);

        assertEquals(customList.size(), Integer.valueOf(1));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), Integer.valueOf(2));
        assertEquals(customList.get(0), arrayList.get(0));
    }

    @Test
    void testRemoveObject() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);
        customList.remove(Integer.valueOf(2));

        arrayList.add(2);
        arrayList.add(5);
        arrayList.remove(Integer.valueOf(2));

        assertEquals(customList.size(), Integer.valueOf(1));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), Integer.valueOf(5));
        assertEquals(customList.get(0), arrayList.get(0));
    }

    @Test
    void testContains() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(customList.size(), Integer.valueOf(2));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.contains(2), arrayList.contains(2));
        assertEquals(customList.contains(5), arrayList.contains(5));
        assertEquals(customList.contains(-3), arrayList.contains(-3));
        assertEquals(customList.contains(null), arrayList.contains(null));
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

        assertEquals(customList.size(), Integer.valueOf(4));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.indexOf(2), arrayList.indexOf(2));
        assertEquals(customList.indexOf(5), arrayList.indexOf(5));
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

        assertEquals(customList.size(), Integer.valueOf(4));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.lastIndexOf(2), arrayList.lastIndexOf(2));
        assertEquals(customList.lastIndexOf(5), arrayList.lastIndexOf(5));
    }

    @Test
    void testClear() {
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        customList.add(2);
        customList.add(5);

        arrayList.add(2);
        arrayList.add(5);

        assertEquals(customList.size(), Integer.valueOf(2));
        assertEquals(customList.size(), arrayList.size());

        customList.clear();
        arrayList.clear();

        assertEquals(customList.isEmpty(), arrayList.isEmpty());
        assertEquals(customList.size(), Integer.valueOf(0));
        assertEquals(customList.size(), arrayList.size());
    }

    @Test
    void testAddAll() {
        Collection<Integer> collection = new ArrayList<>();
        CustomList<Integer> customList = new CustomList<>();
        List<Integer> arrayList = new ArrayList<>();

        collection.add(2);
        collection.add(5);
        collection.add(3);

        customList.addAll(collection);
        arrayList.addAll(collection);

        assertEquals(customList.size(), collection.size());
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), Integer.valueOf(2));
        assertEquals(customList.get(1), Integer.valueOf(5));
        assertEquals(customList.get(2), Integer.valueOf(3));

        assertEquals(customList.get(0), arrayList.get(0));
        assertEquals(customList.get(1), arrayList.get(1));
        assertEquals(customList.get(2), arrayList.get(2));
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

        customList.removeAll(collection);
        arrayList.removeAll(collection);

        assertEquals(customList.size(), Integer.valueOf(1));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), Integer.valueOf(5));
        assertEquals(customList.get(0), arrayList.get(0));
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

        assertEquals(customList.size(), Integer.valueOf(2));
        assertEquals(customList.size(), arrayList.size());

        assertEquals(customList.get(0), Integer.valueOf(2));
        assertEquals(customList.get(1), Integer.valueOf(3));
        assertEquals(customList.get(0), arrayList.get(0));
        assertEquals(customList.get(1), arrayList.get(1));
    }
}
