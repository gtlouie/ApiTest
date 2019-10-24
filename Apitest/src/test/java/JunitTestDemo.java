import org.junit.Assert;
import org.junit.Test;

public class JunitTestDemo {
    @Test
    public void testOne(){
        Assert.assertEquals(1,1);

    }

    @Test
    public void testTwo(){
        Assert.assertEquals(1,2);

    }
}
