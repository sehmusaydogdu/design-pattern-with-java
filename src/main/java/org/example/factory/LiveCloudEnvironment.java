package org.example.factory;

public class LiveCloudEnvironment implements ICloudEnvironment{
    @Override
    public String environment() {
        return "I am LIVE environment";
    }
}
