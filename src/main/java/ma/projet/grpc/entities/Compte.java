package ma.projet.grpc.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

public class Compte {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy="uuid2")
    private String id;
    private float solde;
    private String dateCreation;
    private String type;

    // Getters et Setters :

    public String getId() {
        return id;
    }

    public float getSolde() {
        return solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setType(String type) {
        this.type = type;
    }
}
