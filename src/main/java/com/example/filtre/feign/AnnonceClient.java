package com.example.filtre.feign;

import com.example.filtre.enums.StatusAnnonce;
import com.example.filtre.enums.TypeBien;
import com.example.filtre.enums.TypeLogement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(name = "annonce-microservice", url = "http://localhost:1016") // Adjust the URL as per your service
public interface AnnonceClient {
    @GetMapping("/loueur/Annonce")
    List<AnnonceDTO> searchAnnonces(
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
            @RequestParam(required = false) Integer nombreSalleBain
    );

    @GetMapping("/loueur/Annonce/find/{id}")
    AnnonceDTO getAnnonceById(@PathVariable("id") Integer id);

    @PostMapping("/api/annonces/add")
    AnnonceDTO addAnnonce(@RequestBody AnnonceDTO annonce);
}
