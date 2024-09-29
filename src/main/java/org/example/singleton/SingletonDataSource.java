package org.example.singleton;

public final class SingletonDataSource {

    private SingletonDataSource(){}
    private static class SingletonDataSourceHelper{
      private static final SingletonDataSource INSTANCE = new SingletonDataSource();
    }

    public static SingletonDataSource getInstance(){
        return SingletonDataSourceHelper.INSTANCE;
    }
}
