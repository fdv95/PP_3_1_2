package ru.fadeev.pp_3_1_2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fadeev.pp_3_1_2.dao.UserDao;
import ru.fadeev.pp_3_1_2.model.User;

import java.util.List;


@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(int id, User updateUser) {
        userDao.updateUser(id, updateUser);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
