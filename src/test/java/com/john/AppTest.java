package com.john;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private App mathRules;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Before
    public void setUp() throws Exception {

        mathRules = new App();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void QuantityEquality() {
        int result = mathRules.Quantity(3, 3, 3);
        Assert.assertEquals(1, result);
    }

    @Test
    public void QuantityIdentity() {
        int result = mathRules.Quantity(2, 2, 2);
        Assert.assertSame(1, result);
    }
    @Test
    public void QuantityFail() {
        Assert.fail("Sorry the test has failed (**)");
    }

    @Test (timeout = 130)
    public void QuantityTimeout() {
        int result = mathRules.Quantity(1, 1, 1);
        Assert.assertSame(1, result);
    }

    @Ignore
    @Test
    public void volumeDisable() {
        int result = mathRules.Quantity(0, 0, 0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void main() {
    }
}
