package com.example.filtre.service;

import com.example.filtre.feign.AnnonceClient;
import com.example.filtre.feign.AnnonceDTO;
import com.example.filtre.enums.TypeBien;
import com.example.filtre.enums.TypeLogement;
import com.example.filtre.enums.StatusAnnonce;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnnonceService {
    private final AnnonceClient annonceClient;

    public AnnonceService(AnnonceClient annonceClient) {
        this.annonceClient = annonceClient;
    }



    public List<AnnonceDTO> searchAnnonces(
            TypeBien typeBien,
            TypeLogement typeLogement,
            StatusAnnonce statusAnnonce,
            String ville,
            String quartier,
            String rue,
            BigDecimal minPrix,
            BigDecimal maxPrix,
            Boolean meuble,
            Integer nombrePieces,
            Integer nombreChambres,
            Integer nombreSalleBain) {

        // Fetch all annonces from the microservice using OpenFeign
        List<AnnonceDTO> annonces = annonceClient.searchAnnonces(
                typeBien, typeLogement, statusAnnonce, ville, quartier, rue, minPrix, maxPrix, meuble, nombrePieces, nombreChambres, nombreSalleBain);

        // Apply filtering logic with default values for typeBien and typeLogement
        return annonces.stream()
                .filter(annonce -> (typeBien == null || annonce.getTypeBien() == typeBien))
                .filter(annonce -> (typeLogement == null || annonce.getTypeLogement() == typeLogement))
                .filter(annonce -> ville == null || ville.isEmpty() || annonce.getAdresse().getVille().equalsIgnoreCase(ville))
                .filter(annonce -> quartier == null || quartier.isEmpty() || annonce.getAdresse().getQuartier().equalsIgnoreCase(quartier))
                .filter(annonce -> rue == null || rue.isEmpty() || annonce.getAdresse().getRue().equalsIgnoreCase(rue))
                .filter(annonce -> minPrix == null || annonce.getPrix().compareTo(minPrix) >= 0)
                .filter(annonce -> maxPrix == null || annonce.getPrix().compareTo(maxPrix) <= 0)
                .filter(annonce -> meuble == null || annonce.isMeuble() == meuble)
                .filter(annonce -> nombrePieces == null || annonce.getNombrePieces() == nombrePieces)
                .filter(annonce -> nombreChambres == null || annonce.getNombreTotaleChambres() == nombreChambres)
                .filter(annonce -> nombreSalleBain == null || annonce.getNbrSalleBain() == nombreSalleBain)
                .collect(Collectors.toList());
    }

    public AnnonceDTO getAnnonceById(Integer id) {
        return annonceClient.getAnnonceById(id);
    }

    public void notifyInterestInAnnonce(Integer annonceId, Long interestedUserId) {
        // Fetch annonce details
        AnnonceDTO annonce = getAnnonceById(annonceId);


    }}
