package coderslab;

import coderslab.dao.UserDao;
import coderslab.entity.User;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException {

        User user = new User();
        user.setUserName("anna");
        user.setEmail("jan.anowak@onet.pl");
        user.setPassword("asdsd");

        UserDao userDao = new UserDao();
//        userDao.create(user);

        System.out.println(Arrays.asList(userDao.findAll()));


//        userDao.delete(7);
//        userDao.create(user);
//        User user = userDao.read(7);
//        System.out.println(user);
//        user.setId(555);
//        user.setPassword("fooabr");

//        userDao.update(user);

//        System.out.println(user);
    }
}
