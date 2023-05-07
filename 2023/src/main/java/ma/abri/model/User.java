package ma.abri.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "User")
@Inheritance( strategy = InheritanceType.JOINED )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;
    @Column(name = "firstName")
    protected String firstName;


    @Column(name = "lastName")
    protected String lastName;

    @Column(name = "cin")
    protected String cin;

    @Column(name = "birthDate")
    protected Date birthDate;
    @Column(name = "email")
    protected String email;

    @Column(name = "password")
    protected String password;

    //List<Role> roles;

   // @OneToMany(mappedBy = "user")
//    private Set<Announce> announces;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Set<Announce> getAnnounces() {
//        return announces;
//    }
//
//    public void setAnnounces(Set<Announce> announces) {
//        this.announces = announces;
//    }

}
