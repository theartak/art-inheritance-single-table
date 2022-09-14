package com.jambit.artinheritanceapi;

import com.jambit.artinheritanceapi.model.ArtPiece;
import com.jambit.artinheritanceapi.model.Material;
import com.jambit.artinheritanceapi.model.Painting;
import com.jambit.artinheritanceapi.model.PaintingTechnique;
import com.jambit.artinheritanceapi.model.Sculpture;
import com.jambit.artinheritanceapi.repository.ArtPieceRepository;
import com.jambit.artinheritanceapi.repository.PaintingRepository;
import com.jambit.artinheritanceapi.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArtInheritanceApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ArtInheritanceApiApplication.class, args);
        ArtPieceRepository paintingRepository = configurableApplicationContext.getBean(PaintingRepository.class);
        ArtPieceRepository sculptureRepository = configurableApplicationContext.getBean(SculptureRepository.class);

        ArtPiece sculpture = new Sculpture("Artak", Material.WOOD, 200.2);
        ArtPiece painting = new Painting("Anna", PaintingTechnique.ACRYLIC, 25.5, 44.9);

        sculptureRepository.save(sculpture);
        paintingRepository.save(painting);
    }

}
