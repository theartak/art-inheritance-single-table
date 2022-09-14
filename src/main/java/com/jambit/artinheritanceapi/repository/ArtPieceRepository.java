package com.jambit.artinheritanceapi.repository;

import com.jambit.artinheritanceapi.model.ArtPiece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece, Long> {
}
