package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class UserServiceTest {


    @Test
    void testMockingUserService() {
        UserService userServiceMock = Mockito.mock(UserService.class);
        when(userServiceMock.getUserById(1)).thenReturn(new User(1, "John"));
        when(userServiceMock.getUserById(2)).thenReturn(new User(2, "Alice"));// Perform test operations using the mock object
        User user1 = userServiceMock.getUserById(1);
        User user2 = userServiceMock.getUserById(2);

        // Assertions to verify the behavior of the mock object
        // Here, we are verifying that the mock object returned the expected users.
        assertEquals("John", user1.getName());
        assertEquals("Alice", user2.getName());
    }

    @Test
    void testCalculatorAddition() {
        // Create a mock object for the Calculator class
        Calculator calculatorMock = Mockito.mock(Calculator.class);

        // Define the behavior of the mock object's "add" method
        when(calculatorMock.add(2, 3)).thenReturn(5);
        when(calculatorMock.add(5, 7)).thenReturn(12);

        // Perform test operations using the mock object
        int result1 = calculatorMock.add(2, 3);
        int result2 = calculatorMock.add(5, 7);

        // Assertions to verify the behavior of the mock object
        // Here, we are verifying that the mock object returns the expected results.
        assertEquals(5, result1);
        assertEquals(12, result2);
    }

    @Test
    void testUserRegistration() {
        // Create a mock object for the UserService interface
        UserService userServiceMock = Mockito.mock(UserService.class);

        // Perform a hypothetical user registration process
        User newUser = new User(1, "Doe");
        userServiceMock.registerUser(newUser);

        // Verify that the "registerUser" method was called with the expected user
        verify(userServiceMock).registerUser(newUser);
    }

    @Test
    void testAdditionWithArgumentMatchers() {
        // Create a mock object for the Calculator class
        Calculator calculatorMock = Mockito.mock(Calculator.class);

        // Define the behavior of the mock object's "add" method
        when(calculatorMock.add(eq(2), anyInt())).thenReturn(12);

        // Perform test operations using the mock object
        int result = calculatorMock.add(2, 10);

        // Verify that the "add" method was called with specific arguments
        Mockito.verify(calculatorMock).add(eq(2), anyInt());

        // Assertions to verify the result
        assertEquals(12, result);
    }

    @Test
    void testDivisionException() throws ArithmeticException {
        // Create a mock object for the Calculator class
        Calculator calculatorMock = Mockito.mock(Calculator.class);

        // Stub  method to throw a custom exception
        when(calculatorMock.divide(5, 0)).thenThrow(new ArithmeticException("Cannot be Divided By Zero!!"));

        // Test
        try {
            calculatorMock.divide(5, 0);
        } catch (ArithmeticException e) {
            // Verify that the exception was thrown
            verify(calculatorMock).divide(5, 0);

            // Assert the exception message
            assertEquals("Cannot be Divided By Zero!!", e.getMessage());
        }
    }

    @Test
    void testUserRegistrationVoid() {
        UserService userServiceMock = Mockito.mock(UserService.class);

        doNothing().when(userServiceMock).registerUser(new User(1, "John"));

        User newUser = new User(1, "John");
        userServiceMock.registerUser(newUser);

        verify(userServiceMock).registerUser(newUser);
    }

    @Test
    void testPartialMock() {
        User user  = new User(1,"Spoorthi");
        TestingEx testingEx = new TestingEx(user);
        TestingEx mocktestingEx = spy(testingEx);
        // specify mocked behavior
        when(mocktestingEx.Name(user.getName())).thenReturn("Hello Spoorthi!! ");

        // invoke method under test
        String greetings = mocktestingEx.Greeting();
        assertEquals("Hello Spoorthi!! Welcome to Testing FrameWork", greetings);

    }

    @Test
    void testResetMock(){
        List<String> mockList = mock(List.class);

// Perform some mocking
        when(mockList.size()).thenReturn(5);

// Reset the mock
        reset(mockList);

// Mock again
        when(mockList.size()).thenReturn(10);

// Verify
        assertEquals(10, mockList.size());
    }

    @Test
    void testInorder(){
        List<String> mockList = mock(List.class);
        mockList.add("second");
        mockList.add("first");

        InOrder inOrder = inOrder(mockList);
        inOrder.verify(mockList).add("second");
        inOrder.verify(mockList).add("first");
    }
}