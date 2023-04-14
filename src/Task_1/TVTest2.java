package Task_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Task_1.TV;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TVTest2 {
@Test
    public void test() {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

        Assert.assertEquals(30,tv1.getChannel());
        assertEquals(1,tv2.getChannel());
        tv2.channelUp();
        assertEquals(2,tv2.getChannel());
    }
}