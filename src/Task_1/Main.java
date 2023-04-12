package Task_1;

public class Main {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        tv1.printall();

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
        tv2.printall();
    }

}