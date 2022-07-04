import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.artplan.reversestring.ReverseStringMain;

public class ReverseStringMainTest {
    @Test
    public void reverseTest() {
        String word = "abcdefg1234567890";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ReverseStringMain.reverseString(word);
        }
        long totalTimes = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            ReverseStringMain.reverseString(word);
        }
        long totalTimeThousand = System.currentTimeMillis() - start;

        Assert.assertEquals(totalTimeThousand, totalTimes / 100);
        Assert.assertEquals("0987654321gfedcba", ReverseStringMain.reverseString(word));

    }
}