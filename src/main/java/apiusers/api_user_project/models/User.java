package apiusers.api_user_project.models;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String name;
    private String googleId;
    
    //getter a setters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getGoogleId() {return googleId;}
    public void setGoogleId(String googleId) {this.googleId = googleId;}

}
