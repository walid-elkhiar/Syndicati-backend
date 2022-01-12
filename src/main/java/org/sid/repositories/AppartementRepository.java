package org.sid.repositories;

import org.sid.entities.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AppartementRepository extends JpaRepository<Appartement, Long> {
	

}
