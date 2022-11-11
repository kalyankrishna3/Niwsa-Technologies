package com.niwsatechnologies.ems.Repository;

import com.niwsatechnologies.ems.Model.niwsaEms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
public interface niwsaEmsRepository extends JpaRepository<niwsaEms, Long> {
    public niwsaEms findByempEmail(String email);
}
