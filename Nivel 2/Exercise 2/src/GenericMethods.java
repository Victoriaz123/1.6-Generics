import java.util.Arrays;

public class GenericMethods {

    @SafeVarargs
    public final <T> void printArguments(String argument1, T argument2, T argument3, T... arguments) {
        System.out.println(argument1 + ", " + argument2 + ", " + argument3 + ", " + Arrays.toString(arguments));
     }
}
