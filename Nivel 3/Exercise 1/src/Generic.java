public class Generic {

    public final <T extends Telephone> void usePhone( T phone) {
       phone.call();
       //cannot call the takePhotos() method here
    }

    public void useSmartphone(Smartphone smartphone) {
        smartphone.call();
        smartphone.takePhotos();
    }
}
