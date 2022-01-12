package org.sid.repositories;

import org.sid.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface FactureRepository extends JpaRepository<Facture, Long> {

}
