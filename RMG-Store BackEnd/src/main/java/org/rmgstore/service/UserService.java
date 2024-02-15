package org.rmgstore.service;

import org.rmgstore.model.User;

public interface UserService {
    String login(User user);
    User save (User user);
}
