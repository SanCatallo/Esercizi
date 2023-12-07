package com.example.Calendar.Service;

import com.example.Calendar.Models.User;
import com.example.Calendar.Models.Calendar;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    void addUser(User user);

    void updateUser(Long userId, User newUser);

    void deleteUser(Long userId);

    void addCalendarForUser(Long userId, Calendar calendar);

}
