public class Main {
    public static void main(String[] args) {

    GenericMethods genericMethod = new GenericMethods();


    Person person = new Person("Marta", "Torrez", 30);
    String string = "String";
    int number = 5;


        genericMethod.printArguments(person,number, string);
        genericMethod.printArguments(number, string, person);
        genericMethod.printArguments(string, person, number);
    }
}

