package core.basesyntax;

import java.time.LocalDate;


public class Hello_World {
    private String a;
    private int variable, age, size;

    private String buildString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
             result.append(i).append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Hello_World hello = new Hello_World();
        System.out.println(hello.buildString());
    }

    private void sayHello(String HELLO) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! Your task is to fix the checkstyle in this file." +
        " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(HELLO);
    }

    private void initializeVariables() {
        a = "Hello mates!";
        System.out.println(a);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
