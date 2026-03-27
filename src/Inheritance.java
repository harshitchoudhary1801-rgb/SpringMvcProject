class Phone {
    private int number;

    Phone() {

    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    public void call() {
        System.out.println("Call is made");
    }

    public void message() {
        System.out.println("Message is sent");
    }

}

class SmartPhone extends Phone {

    int cameraMegaPX;

    public void click() {
        System.out.println("A photograph was clicked");
    }

    public void playMusic() {
        System.out.println("Music Started Playing");
    }

    public void pauseMusic() {
        System.out.println("Music Paused");
    }

    public void stopMusic() {
        System.out.println("Music Stopped");
    }
}

class main  {
    public static void main(String args[]) {


        SmartPhone p1 = new SmartPhone();
        p1.setNumber(97736);
        System.out.println("Phone number is: " + p1.getNumber());
        p1.call();
        p1.playMusic();
    }
}