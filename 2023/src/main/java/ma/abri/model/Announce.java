package ma.abri.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Announce")

public class Announce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "minPrice")
    private double minPrice;
    @Column(name = "maxPrice")
    private double maxPrice;
//    @Column(name = "category")
//    private Category category;
    @Column(name = "location")
    private String location;
    @Column(name = "dateAnnounce")
    private Date dateAnnounce;

    @ManyToOne
    //@JoinColumn(name="cart_id", nullable=false)
    private User user;

    @Column(name = "status")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateAnnounce() {
        return dateAnnounce;
    }

    public void setDateAnnounce(Date dateAnnounce) {
        this.dateAnnounce = dateAnnounce;
    }

   // public User getUser() {
     //   return user;
    //}

    //public void setUser(User user) {
     //   this.user = user;
   // }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
