public class Smartphone implements Telephone {

    @Override
    public void call() {
       System.out.println("You are calling");
    }

    public void takePhotos(){
        System.out.println("You are taking photos");
    }
}
