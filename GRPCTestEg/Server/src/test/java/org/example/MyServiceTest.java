package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static junit.framework.TestCase.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ MyService.class })
public class MyServiceTest {

    @Test
    public void testPrivateMethod() throws Exception {
        // Create a mock instance of MyService
        MyService myService = PowerMockito.spy(new MyService("Test"));

        // Mock the private method
        PowerMockito.when(myService, "privateMethod").thenReturn("Mocked Private Method");

        // Call the private method
        String result = Whitebox.invokeMethod(myService,"privateMethod");

        // Assert the result
        assertEquals("Mocked Private Method", result);
    }

    @Test
    public void testStaticMethod() {
        PowerMockito.mockStatic(MyService.class);

        PowerMockito.when(MyService.staticMethod()).thenReturn("Mocked Static Method");

        String result = MyService.staticMethod();

        assertEquals("Mocked Static Method", result);
    }
     @Test
    public void testFinalMethod(){
        MyService mockFinal = mock(MyService.class);

        PowerMockito.when(mockFinal.finalMethod()).thenReturn("Mocked Final Method");

        String result = mockFinal.finalMethod();

        assertEquals("Mocked Final Method",result);
    }
}
