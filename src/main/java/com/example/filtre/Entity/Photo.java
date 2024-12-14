package com.example.filtre.Entity;

import com.example.filtre.enums.TypePiece;
import com.example.filtre.feign.AnnonceDTO;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor

@Builder
@Getter
@Setter
@Entity
public class Photo {
    private String url;
    @Getter
    @Setter
    @Id
    private Long id;
    // Add other photo-related fields as needed

    public Photo() {}

    // Getters and setters
}
