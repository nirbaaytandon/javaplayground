package redis.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Model layer for application
 */
@Entity
@NoArgsConstructor
@Data
public class User implements Serializable {

    public static final long serialVersionUID = 9876873145125386L;

    @Id
    @SequenceGenerator(sequenceName = "SEQ_USER", name = "SEQ_GEN", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    private Long id;
    private String name;
    private long followers;

    public User(String name, long followers) {
        this.name = name;
        this.followers = followers;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", followers=" + followers +
                '}';
    }
}
