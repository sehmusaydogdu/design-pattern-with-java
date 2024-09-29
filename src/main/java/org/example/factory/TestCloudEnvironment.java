package org.example.factory;

public class TestCloudEnvironment implements ICloudEnvironment{
    @Override
    public String environment() {
        return "I am TEST environment";
    }
}
