package exercise1;

import org.junit.Test;
import org.junit.Assert;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(-1000,  "€");
        Assert.assertEquals("-€1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
        String money = MoneyUtil.format(-1000,  null);

    }
}
