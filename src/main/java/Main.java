import com.mysql.cj.log.Log;
import hibernateUtils.DataSource;
import model.entity.*;
import model.enums.Roles;
import model.repository.*;
import model.repository.impl.*;
import org.hibernate.Session;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        RoleRepository rl=new RoleRepositoryImpl();
//        List<Role> roleLIst=rl.findAll();
//        System.out.println(roleLIst);
//        UserRepository userRepository=new UserRepositoryImpl();
//        User user=userRepository.findById(1);
//        System.out.println(user.getRole());
          TicketRepository tr=new TicketRepositoryImpl();
          List<Ticket> ticket=tr.findAll();
          System.out.println(ticket);
    }
}