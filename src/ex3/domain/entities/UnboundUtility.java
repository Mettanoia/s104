package ex3.domain.entities;

public class UnboundUtility {
    static void unboundSomething(){
        throw new ArrayIndexOutOfBoundsException();
    }
}
