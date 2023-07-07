package baittap.bai2;
import lombok.Data;

import java.util.List;
@Data
public class Employee {
    private int id;
    private String name;
    private String email;
    private  String department;
    List<String> roles;

}
