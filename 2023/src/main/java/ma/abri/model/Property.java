package ma.abri.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "designation")
    protected String designation;
    @Column(name = "surface")
    protected int surface;
    @Column(name = "price")
    protected int price;
    @Column(name = "number_pieces")
    protected int number_pieces;
    @Column(name = "parking")
    protected boolean parking;
    @Column(name = "heater")
    protected boolean heater;
    @Column(name = "equipped")
    protected boolean equipped;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber_pieces() {
        return number_pieces;
    }

    public void setNumber_pieces(int number_pieces) {
        this.number_pieces = number_pieces;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isHeater() {
        return heater;
    }

    public void setHeater(boolean heater) {
        this.heater = heater;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }
}
