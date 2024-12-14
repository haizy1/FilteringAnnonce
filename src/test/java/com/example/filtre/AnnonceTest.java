//package com.example.filtre;
//
//import com.example.filtre.Entity.*;
//import com.example.filtre.enums.*;
//import com.example.filtre.repository.AnnonceRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//
//@SpringBootTest
//public class AnnonceTest {
//
//    @Autowired
//    private AnnonceRepository annonceRepository;
//
//    @Test
//    public void addSampleAnnonces() {
//        // Annonce 1: Entire Apartment in Rabat
//        Annonce annonce1 = new Annonce();
//        annonce1.setTypeLogement(TypeLogement.LOGEMENT_ENTIER);
//        annonce1.setStatusAnnonce(StatusAnnonce.DISPONIBLE);
//        annonce1.setTypeBien(TypeBien.APPARTEMENT);
//        annonce1.setTitre("Spacious Apartment in Rabat");
//        annonce1.setDescription("A well-furnished 3-bedroom apartment with modern amenities in a calm neighborhood.");
//        annonce1.setCapacite_accueil(5);
//        annonce1.setNombre_pieces(4);
//        annonce1.setSurface(120);
//        annonce1.setNombre_totale_chambres(3);
//        annonce1.setNbr_salle_bain(2);
//        annonce1.setSalon(Salon.PRIVE);
//        annonce1.setCuisine(Cuisine.PRIVE);
//        annonce1.setMeuble(true);
//        annonce1.setEauEtElectriciteInclus(true);
//        annonce1.setEquipements(Arrays.asList(Equipement.TV, Equipement.WIFI, Equipement.LAVE_LINGE));
//        annonce1.setCuisineEquipements(Arrays.asList(CuisineEquipement.FOUR, CuisineEquipement.REFRIGERATEUR));
//        annonce1.setServices(Arrays.asList(Service.CONTRAT, Service.MENAGE));
//        annonce1.setPrix(BigDecimal.valueOf(9000));
//        annonce1.setDate_disponibilite(LocalDateTime.now().plusDays(5));
//        annonce1.setDuree_location(LocalDateTime.now().plusMonths(6));
//
//        // Annonce 2: Shared Studio in Casablanca
//        Annonce annonce2 = new Annonce();
//        annonce2.setTypeLogement(TypeLogement.EN_COLOCATION);
//        annonce2.setStatusAnnonce(StatusAnnonce.DISPONIBLE);
//        annonce2.setTypeBien(TypeBien.STUDIO);
//        annonce2.setTitre("Cozy Studio in Casablanca");
//        annonce2.setDescription("Affordable shared studio, perfect for students or young professionals.");
//        annonce2.setCapacite_accueil(2);
//        annonce2.setNombre_pieces(1);
//        annonce2.setSurface(30);
//        annonce2.setNombre_totale_chambres(0); // Studio doesn't have separate bedrooms
//        annonce2.setNbr_salle_bain(1);
//        annonce2.setSalon(Salon.COMMUN);
//        annonce2.setCuisine(Cuisine.COMMUN);
//        annonce2.setMeuble(true);
//        annonce2.setEauEtElectriciteInclus(false);
//        annonce2.setEquipements(Arrays.asList(Equipement.WIFI, Equipement.LINGE_LIT));
//        annonce2.setCuisineEquipements(Arrays.asList(CuisineEquipement.PLAQUES_CUISSON, CuisineEquipement.MICRO_ONDES));
//        annonce2.setServices(Arrays.asList(Service.CONCIERGERIE));
//        annonce2.setPrix(BigDecimal.valueOf(4000));
//        annonce2.setDate_disponibilite(LocalDateTime.now().plusDays(10));
//        annonce2.setDuree_location(LocalDateTime.now().plusMonths(3));
//
//        // Save both annonces to the database
//        annonceRepository.saveAll(Arrays.asList(annonce1, annonce2));
//
//        System.out.println("Sample annonces added successfully!");
//    }
//}
