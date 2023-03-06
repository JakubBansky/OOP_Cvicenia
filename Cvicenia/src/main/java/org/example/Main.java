package org.example;
import org.example.First.Compare;
import org.example.First.HelloWorld;

public class Main {
    public static void main(String[] args) {
        Compare a = new Compare();
        a.setA(3);
        a.setB(2);
        System.out.println(a.compare());

    }
}