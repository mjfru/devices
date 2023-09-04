class TestDevice {
    public static void main(String[] args) {
        // Device generic = new Device();
        // System.out.println(generic.getBatteryLife());
        Phone genericPhone = new Phone();
        System.out.println(genericPhone.getBatteryLife());
        System.out.println("Fully Charged!");
        genericPhone.makeCall();
        genericPhone.makeCall();
        genericPhone.makeCall();
        System.out.println("Battery after 3 phone calls: " + genericPhone.getBatteryLife());
        genericPhone.playGame();
        genericPhone.playGame();
        System.out.println("Battery after 3 phone calls and 2 games: " + genericPhone.getBatteryLife());
        genericPhone.charge();
        System.out.println("Battery after 3 phone calls, 2 games, and a charge: " + genericPhone.getBatteryLife());
        
        //TODO Bonus: Don't allow user to play a game if below 25%: (Comment out the .charge() for effect)
        genericPhone.playGame();
        genericPhone.makeCall();
        genericPhone.playGame();

        
        //TODO Bonus: Prompt the warning message:
        genericPhone.makeCall();
        genericPhone.makeCall();
        genericPhone.makeCall();
        System.out.println(genericPhone.getBatteryLife());
    }
}