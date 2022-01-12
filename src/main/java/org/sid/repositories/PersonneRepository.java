package org.sid.repositories;

import org.sid.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
