import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }

    private static class CharProblem {
        public static int howOld(String herOld) {
            return (int) herOld.charAt(0)-'0';
        }
    }
}
