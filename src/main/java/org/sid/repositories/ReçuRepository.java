package org.sid.repositories;

import org.sid.entities.Reçu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ReçuRepository extends JpaRepository<Reçu, Long> {

}
