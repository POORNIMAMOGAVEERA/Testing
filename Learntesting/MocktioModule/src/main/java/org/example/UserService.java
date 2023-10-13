package org.example;

public interface UserService {
    User getUserById(int id);
    void registerUser(User user);
}
