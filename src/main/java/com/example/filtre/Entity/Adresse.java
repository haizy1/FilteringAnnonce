package com.example.filtre.Entity;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@Embeddable
public class Adresse {
    private String rue;
    private String quartier;
    private String ville; // You could use the Ville enum here or String
    private String codePostal;

    // Constructors, getters, and setters
    public Adresse() {}

    public Adresse(String rue, String quartier, String ville, String codePostal) {
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;

    }
}
