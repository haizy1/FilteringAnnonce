package com.example.filtre.controller;

import com.example.filtre.feign.AnnonceDTO;
import com.example.filtre.enums.TypeBien;
import com.example.filtre.enums.TypeLogement;
import com.example.filtre.enums.StatusAnnonce;
//import com.example.filtre.feign.NotificationDTO;
import com.example.filtre.service.AnnonceService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/annonces")
public class AnnonceController {
    private final AnnonceService annonceService;

    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

//    // Handle user interest in an annonce
//    @PostMapping("/interested")
//    @CrossOrigin(origins = "http://localhost:3000")
//    public void handleInterested(@RequestBody NotificationDTO notificationDTO) {
//        // Trigger notification creation
//        annonceService.notifyInterestInAnnonce(notificationDTO);
//    }
//    @PostMapping("/add")
//    public AnnonceDTO addAnnonce(@RequestBody AnnonceDTO annonce) {
//        return annonceService.saveAnnonce(annonce);
//    }


    @GetMapping("/search")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<AnnonceDTO> searchAnnonces(
            @RequestParam(required = false) TypeBien typeBien,
            @RequestParam(required = false) TypeLogement typeLogement,
            @RequestParam(required = false) StatusAnnonce statusAnnonce,
            @RequestParam(defaultValue = "") String ville,
            @RequestParam(defaultValue = "") String quartier,
            @RequestParam(defaultValue = "") String rue,
            @RequestParam(required = false) BigDecimal minPrix,
            @RequestParam(required = false) BigDecimal maxPrix,
            @RequestParam(required = false) Boolean meuble,
            @RequestParam(required = false) Integer nombrePieces,
            @RequestParam(required = false) Integer nombreChambres,
            @RequestParam(required = false) Integer nombreSalleBain) {

        return annonceService.searchAnnonces(
                typeBien,
                typeLogement,
                statusAnnonce,
                ville,
                quartier,
                rue,
                minPrix,
                maxPrix,
                meuble,
                nombrePieces,
                nombreChambres,
                nombreSalleBain
        );
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public AnnonceDTO getAnnonceById(@PathVariable("id") Integer id) {
        return annonceService.getAnnonceById(id);
    }
}