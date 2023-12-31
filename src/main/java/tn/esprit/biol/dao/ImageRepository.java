package tn.esprit.biol.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.biol.entity.ImageModel;



public interface ImageRepository extends JpaRepository<ImageModel, Long> {

    Optional<ImageModel> findByName(String name);

    Optional<ImageModel> findById(Long id);

}
