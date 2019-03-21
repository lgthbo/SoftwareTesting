import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestMin<T extends Comparable<? super T>> {
	private List<T> list;
	
    private T expected;

    public TestMin(List<T> list, T expected) {
        this.list = list;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Min.min({0})={1}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(
                new Object[][] { { Arrays.asList(1, 2, 3), 1 },{ Arrays.asList("a", "b", "c"), "a" }});
    }

    @Test
    public void testMinValue() {
        T result = Min.min(list);
        assertEquals(expected, result);
    }
}
