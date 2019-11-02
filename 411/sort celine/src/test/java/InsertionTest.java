import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sortInteger() {
        Integer[] list = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Insertion<Integer> mysort = new Insertion<>();
        mysort.sort(list);
        assertArrayEquals(expected, list);
    }

    @Test
    void sortString() {
        String[] list = {"a", "e", "d", "c", "b"};
        String[] expected = {"a", "b", "c", "d", "e"};

        Insertion<String> mysort = new Insertion<>();
        mysort.sort(list);
        assertArrayEquals(expected, list);
    }
}