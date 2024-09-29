package singletonTest;

import org.example.singleton.SingletonDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void singleInstanceNotNull(){
        SingletonDataSource instance = SingletonDataSource.getInstance();
        Assertions.assertNotNull(instance);
    }

    @Test
    void twoSingleInstanceEqualsTrue(){
        SingletonDataSource instance1 = SingletonDataSource.getInstance();
        SingletonDataSource instance2 = SingletonDataSource.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }
}
