package Test0822;

import com.kh.pre3.Person;

import test.Customer;
public class B1 {
    public static void main(String[] args) {
        int i = 0;

        Person[] pArr = new Person[3];
        pArr[i] = new Person(null);

        for (i = 0; i < pArr.length; i++) {
            pArr[i] = null;
            System.out.print(pArr[i]);
        }
    }

    static class Person {
        String name;
        

        public Person(String name) {
            this.name = name;
            
        }

        @Override
        public String toString() {
            return name;
        }
    }
}


