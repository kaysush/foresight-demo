import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MyShinyClassTest {

    @org.junit.jupiter.api.Test
    void compute() {
        MyShinyClass testObj = new MyShinyClass();
        int result = testObj.compute();
        Assert.assertEquals(0, result);
    }
}