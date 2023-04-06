package ma.abri.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Announce")
@Data
@NoArgsConstructor
public class Announce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
//    @Column(name = "priceMin")
//    private double priceMin;
//    @Column(name = "priceMax")
//    private double priceMax;
//    @Column(name = "category")
//    private Category category;
    @Column(name = "location")
    private String location;
    @Column(name = "dateAnnounce")
    private Date dateAnnounce;
//    @Column(name = "user")
//    private User user;
    @Column(name = "status")
    private Boolean status;
}
