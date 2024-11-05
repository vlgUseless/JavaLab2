import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
