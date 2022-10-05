import model.entity.User;
import model.repository.UserRepository;
import model.repository.impl.UserRepositoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository user=new UserRepositoryImpl();
        List<User> sq=user.findAll(User.class);
    }
}