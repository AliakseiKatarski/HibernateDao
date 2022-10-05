
import model.entity.*;

import model.repository.*;
import model.repository.impl.*;


public class Main {
    public static void main(String[] args) {

        UserRepository user=new UserRepositoryImpl();
        User user1=user.findById(1,User.class);
        System.out.println(user1);
    }
}