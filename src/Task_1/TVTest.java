package Task_1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

    class TVTest {
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

    }
}