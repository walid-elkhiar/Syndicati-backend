package org.sid;


import java.util.Date;

import org.sid.entities.Appartement;
import org.sid.entities.Facture;
import org.sid.entities.Immeuble;
import org.sid.entities.Personne;
import org.sid.entities.Reçu;
import org.sid.repositories.AppartementRepository;
import org.sid.repositories.FactureRepository;
import org.sid.repositories.ImmeubeleRepository;
import org.sid.repositories.PersonneRepository;
import org.sid.repositories.ReçuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SyndicatiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyndicatiAppApplication.class, args);
	}

@Bean
CommandLineRunner start(PersonneRepository personneRepository,
		AppartementRepository appartementRepository,
		FactureRepository factureRepository,
		ImmeubeleRepository immeubeleRepository,
		ReçuRepository reçurepository) {
	return args -> {
		personneRepository.save(new Personne(null,"walid el khiar","065754465400"));
		appartementRepository.save(new Appartement(null,300,"A12",false));
		factureRepository.save(new Facture(null,2467.80,new Date(),"les charges de l'eau et l'éléctricité"));
		immeubeleRepository.save(new Immeuble(null,"Salah","SAL77857057357",1));
		reçurepository.save(new Reçu(null,new Date(),800.00));
		personneRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		appartementRepository.findAll().forEach(a->{
			System.out.println(a.toString());
		});
		factureRepository.findAll().forEach(f->{
			System.out.println(f.toString());
		});
		immeubeleRepository.findAll().forEach(i->{
			System.out.println(i.toString());
		});
		reçurepository.findAll().forEach(r->{
			System.out.println(r.toString());
		});
	};
}

}
