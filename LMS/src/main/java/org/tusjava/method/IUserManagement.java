package org.tusjava.method;

import org.tusjava.enties.User;

public interface IUserManagement {
    void addUser(User user);
    User getUser(String email);
    void updateUser(User user);
    void deleteUser(String email);
}
