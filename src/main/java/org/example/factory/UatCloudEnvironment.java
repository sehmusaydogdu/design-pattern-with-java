package org.example.factory;

public class UatCloudEnvironment implements ICloudEnvironment{
    @Override
    public String environment() {
        return "I am UAT environment";
    }
}
