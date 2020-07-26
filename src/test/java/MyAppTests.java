import org.junit.Assert;
import org.junit.Test;

public class MyAppTests {

    @Test
    public void addTest() {
        int answer = Main.add(20, 40);

        // the answer must be 60
        Assert.assertEquals(answer, 60);
    }

    @Test
    public void multiplyTest() {
        int answer = Main.add(20, 40);

        // the answer must be 60
        Assert.assertEquals(answer, 800);
    }
}
