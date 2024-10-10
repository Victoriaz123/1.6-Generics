public class Main {
  public static void main(String[] args) {

      NoGenericMethods object1 = new NoGenericMethods("First", "Second", "Third");
      NoGenericMethods object2 = new NoGenericMethods("Third", "First", "Second");

      System.out.println("Object 1: " + object1.getItem1() + ", " + object2.getItem2() + ", " + object2.getItem3());
      System.out.println("Object 2: " + object2.getItem1() + ", " + object2.getItem2() + ", " + object2.getItem3());
  }
}