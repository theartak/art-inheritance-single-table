package com.jambit.artinheritanceapi.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "ART_PIECE_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;

    public ArtPiece() {
    }

    public ArtPiece(String author) {
        this.author = author;
    }
}
