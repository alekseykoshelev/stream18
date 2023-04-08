package memory;

import java.util.Stack;

public class MemoryHw {

    public static void main(String[] args) {
        /*
//        int value = 33;
//        changeValue(value);
//        System.out.println(value);
//
//        Integer[] arr = new Integer[]{3, 4};
//        changeValue(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int a = 5;
//        a = 6;
        Person person = new Person("Lyapis", "Trubetskoy");
        person = new Person("aa", "bb");

        person.changePerson(person);
//        System.out.println(person);
        System.out.println(factorial(5));
        
         */

        System.out.println((int)'a');


        // Вот как все работает через стэк фрэйм и кучу?
        // garbage collector
        // наследование

        SpecificPerson specificPerson = new SpecificPerson("foo", "baz", "gus");
        System.out.println(specificPerson.getName());
        System.out.println(specificPerson.getSurname());
        specificPerson.spec();
        System.out.println(specificPerson.getType());
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValue(Integer[] value) {
        value[0] = 99;
    }
}
