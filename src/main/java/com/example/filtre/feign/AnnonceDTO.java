package com.example.filtre.feign;

import com.example.filtre.Entity.Adresse;
import com.example.filtre.Entity.Photo;
import com.example.filtre.enums.TypeBien;
import com.example.filtre.enums.TypeLogement;
import com.example.filtre.enums.StatusAnnonce;
import com.example.filtre.enums.Salon;
import com.example.filtre.enums.Cuisine;
import com.example.filtre.enums.Equipement;
import com.example.filtre.enums.CuisineEquipement;
import com.example.filtre.enums.Service;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
@Data
public class AnnonceDTO {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private TypeLogement typeLogement;

    @Getter
    @Setter
    private TypeBien typeBien;

    @Getter
    @Setter
    private StatusAnnonce statusAnnonce;

    @Getter
    @Setter
    private Salon salon;

    @Getter
    @Setter
    private Cuisine cuisine;

    @Getter
    @Setter
    @JsonProperty("adresse") // Maps the JSON field "adresse" to this field
    private Adresse adresse;

    @JsonProperty("photos") // Maps the JSON field "photos" to this field
    private List<Photo> photos;

    @Getter
    @Setter
    private String titre;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private int capacite_accueil;

    @Getter
    @Setter
    private Integer nombrePieces;

    @Getter
    @Setter
    private long surface;

    @Getter
    @Setter
    private Integer nombreTotaleChambres;

    @Getter
    @Setter
    private Integer nbrSalleBain;

    @Getter
    @Setter
    private boolean meuble;

    @Getter
    @Setter
    private boolean eauEtElectriciteInclus;

    @Getter
    @Setter
    private List<Equipement> equipements;

    @Getter
    @Setter
    private List<CuisineEquipement> cuisineEquipements;

    @Getter
    @Setter
    private List<Service> services;

    @Getter
    @Setter
    private List<StatusAnnonce> statusAnnonces;

    @Getter
    @Setter
    private BigDecimal prix;

    @Getter
    @Setter
    private LocalDateTime date_disponibilite;

    @Getter
    @Setter
    private LocalDateTime duree_location;

    @Getter
    @Setter
    private List<String> commentairesContenus;

    @Getter
    @Setter
    @JsonProperty("loueurId") // Maps the JSON field "loueurId" to this field
    private Integer loueurId; // Add the Loueur ID


}

