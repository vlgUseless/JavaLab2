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
}
