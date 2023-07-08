package ma.abri.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Contrat")
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Parties")
    private String Parties;
    @Column(name = "Subject")
    private String Subject;
    @Column(name = "Duration")
    private String Duration;
    @Column(name = "Conditions")
    private String Conditions;
    @Column(name = "Price")
    private String Price;
    @Column(name = "Termination")
    private String Termination;
    @Column(name = "Confidentiality")
    private String Confidentiality;
    @Column(name = "Responsibilities")
    private String Responsibilities;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParties() {
        return Parties;
    }

    public void setParties(String parties) {
        Parties = parties;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getConditions() {
        return Conditions;
    }

    public void setConditions(String conditions) {
        Conditions = conditions;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getTermination() {
        return Termination;
    }

    public void setTermination(String termination) {
        Termination = termination;
    }

    public String getConfidentiality() {
        return Confidentiality;
    }

    public void setConfidentiality(String confidentiality) {
        Confidentiality = confidentiality;
    }

    public String getResponsibilities() {
        return Responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        Responsibilities = responsibilities;
    }
}
