package dpucp.working.testCrud.models;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String name;
    private String password;
    
    @Column(name = "email_address", unique = true)
    private String email;

}
