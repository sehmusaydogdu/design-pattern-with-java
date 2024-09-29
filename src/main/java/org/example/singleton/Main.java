package org.example.singleton;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        SingletonDataSource instance = SingletonDataSource.getInstance();
        if (Objects.nonNull(instance))
            System.out.println("Singleton Instance Created.");
    }
}