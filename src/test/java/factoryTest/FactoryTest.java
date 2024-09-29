package factoryTest;

import org.example.factory.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void testPrivateConstructor() {
        InvocationTargetException exception = assertThrows(InvocationTargetException.class, () -> {
            var constructor = CloudEnvironmentFactory.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            throw exception.getCause();
        });
    }

    @Test
    void givenTestParam_thenReturnTestEnvironment(){
        ICloudEnvironment cloudEnvironment = CloudEnvironmentFactory.cloudEnvironment(CloudEnvironment.TEST);
        assertNotNull(cloudEnvironment);
        assertTrue(cloudEnvironment instanceof TestCloudEnvironment);
        assertEquals("I am TEST environment", cloudEnvironment.environment());
    }

    @Test
    void givenUatParam_thenReturnUatEnvironment(){
        ICloudEnvironment cloudEnvironment = CloudEnvironmentFactory.cloudEnvironment(CloudEnvironment.UAT);
        assertNotNull(cloudEnvironment);
        assertTrue(cloudEnvironment instanceof UatCloudEnvironment);
        assertEquals("I am UAT environment", cloudEnvironment.environment());
    }

    @Test
    void givenLiveParam_thenReturnLiveEnvironment(){
        ICloudEnvironment cloudEnvironment = CloudEnvironmentFactory.cloudEnvironment(CloudEnvironment.LIVE);
        assertNotNull(cloudEnvironment);
        assertTrue(cloudEnvironment instanceof LiveCloudEnvironment);
        assertEquals("I am LIVE environment", cloudEnvironment.environment());
    }

    @Test
    void givenNullParam_thenThrowException(){
        CloudEnvironment environment = null;
        assertThrows(IllegalArgumentException.class, ()-> CloudEnvironmentFactory.cloudEnvironment(environment), "cloud environment must be not null");
    }

}
