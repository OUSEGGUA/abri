package ma.abri.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Adress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "address_1")
    private String address_1;
    @Column(name = "address_2")
    private String address_2;
    @Column(name = "city")
    private String city;
    @Column(name = "postalCode")
    private int postalCode;
    @Column(name = "country")
    private String country;
}
