import Task_1.TV;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TVTest {
        @Test
    public void test() {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

        assertEquals(30,tv1.getChannel());
        assertEquals(1,tv2.getChannel());
        tv2.channelUp();
        assertEquals(2,tv2.getChannel());
    }
}