package timur.project.demo.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "staff_role")
public class role implements GrantedAuthority {
    @Id
    private Long id;
    private String role;
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<user> users;
    public role() {
    }

    public role(Long id) {
        this.id = id;
    }

    public role(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<user> getUsers() {
        return users;
    }

    public void setUsers(Set<user> users) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }

}
