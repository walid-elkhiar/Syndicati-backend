package org.sid.repositories;

import org.sid.entities.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ImmeubeleRepository extends JpaRepository<Immeuble, Long>  {

}
