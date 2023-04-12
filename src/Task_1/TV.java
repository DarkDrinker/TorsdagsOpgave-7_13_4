package Task_1;

public class TV {
   private int channel = 1;
   private int volume = 0;
   private boolean isOn;

    public TV() {
        this.channel = 1;
        this.volume = 0;
    }

    public void turnOn(){
        this.isOn = true;
    }

        public void setChannel(int requestedChannel){
        if(this.isOn && (requestedChannel > 1 && requestedChannel < 100)) {
            this.channel = requestedChannel;
        } else {
            System.out.println("has to be between 1-100");
        }
        }

    public void setVolume(int amount){
        if(isOn && (amount > 1 && amount < 100)){
            this.volume = amount;
        } else{
            System.out.println("has to be between 1-100");
        }
    }

        public void channelDown() {
            if(this.channel > 0 && isOn) {
                this.channel -= 1;
            }
    }

        public void channelUp() {
            if(this.channel < 100 && isOn) {
                this.channel += 1;
            }
    }

    public void volumeUp(){
        if(isOn && this.volume < 100){
            this.volume += 1;
        }
    }

    public void volumeDown(){
        if(isOn && this.volume >0){
            this.volume -=1;
        }

    }

    public void printall(){
        System.out.println(this.channel);
        System.out.println(this.isOn);
        System.out.println(this.volume);
    }


}



