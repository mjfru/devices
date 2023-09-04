public class Phone extends Device {
    public void makeCall() {
        this.batteryLife -= 5;
        if (this.batteryLife < 10) {
            System.out.println("Battery less than 10%, please charge.");
        }
    }

    public void playGame() {
        if (this.batteryLife < 10) {
            System.out.println("Battery less than 10%, please charge.");
        }
        if (this.batteryLife < 25) {
            System.out.println("Battery low, please charge to play.");
        } else {
            this.batteryLife -= 20;
        }
    }

    public void charge() {
        this.batteryLife += 50;
    }
}