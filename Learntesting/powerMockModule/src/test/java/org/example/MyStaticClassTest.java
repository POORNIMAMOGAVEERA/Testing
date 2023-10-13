package org.example;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyClass.class)
public class MyStaticClassTest {

    @Test
    public void testStaticMethodMocking() {
        // Mock the static method
        PowerMockito.mockStatic(MyClass.class);
        PowerMockito.when(MyClass.myStaticMethod()).thenReturn("MockedValue");

        // Perform the test using the mocked static method
        String result = MyClass.myStaticMethod();

        // Verify that the method used the mocked value
        assertEquals("MockedValue", result);
    }

    @Test
    public void testPrivateMethodMocking() throws Exception {
        // Create a mock of the class with the private method
        MyClass myClass = PowerMockito.spy(new MyClass());

        // Mock the private method
        PowerMockito.when(myClass, "myPrivateMethod").thenReturn("MockedValue");

        // Perform the test
        String result = myClass.myPrivateMethodEg();

        // Verify that the private method was mocked
        Assert.assertEquals("MockedValue", result);
    }

    @Test
    public void testConstructorMocking() throws Exception {
        // Mock the constructor of MyClassWithConstructor
        MyClass mockInstance = PowerMockito.mock(MyClass.class);

        // When the constructor is called, return the mock instance
        PowerMockito.whenNew(MyClass.class).withNoArguments().thenReturn(mockInstance);

        // Perform the test
        MyClass newInstance = new MyClass();

        // Verify that the constructor was mocked
        Assert.assertSame(mockInstance, newInstance);
    }

    @Test
    public void testPrivateMethod() throws Exception {
        MyClass obj = new MyClass();
        Method privateMethod = MyClass.class.getDeclaredMethod("add", int.class, int.class);
        privateMethod.setAccessible(true);
        int result = (int) privateMethod.invoke(obj, 3, 4);
        assertEquals(7, result); 
    }
}
