package org.rmgstore.serviceimpl;

import org.rmgstore.model.User;
import org.rmgstore.repository.UserRepository;
import org.rmgstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public String login(User user) {

        User user1 = userRepository.findByNameAndPassword(user.getName(),user.getPassword());
        if(user1==null)
            return "Failure";

        return "Success";
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
