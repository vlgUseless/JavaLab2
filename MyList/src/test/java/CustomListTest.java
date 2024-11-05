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
}
