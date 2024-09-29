package org.example.factory;

public final class CloudEnvironmentFactory {

    private CloudEnvironmentFactory(){
        throw new IllegalArgumentException("you should not create object");
    }

    public static ICloudEnvironment cloudEnvironment(CloudEnvironment cloudEnvironment){
        if (null == cloudEnvironment){
            throw new IllegalArgumentException("cloud environment must be not null");
        }
        switch (cloudEnvironment){
            case TEST -> {
                return new TestCloudEnvironment();
            }
            case UAT -> {
                return new UatCloudEnvironment();
            }
            case LIVE -> {
                return new LiveCloudEnvironment();
            }
            default -> throw new IllegalArgumentException("cloud environment not valid");
        }
    }
}
