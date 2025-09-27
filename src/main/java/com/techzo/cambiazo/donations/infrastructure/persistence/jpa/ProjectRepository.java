package com.techzo.cambiazo.donations.infrastructure.persistence.jpa;

import com.techzo.cambiazo.donations.domain.model.aggregates.Ong;
import com.techzo.cambiazo.donations.domain.model.aggregates.Project;
import com.techzo.cambiazo.donations.domain.model.valueobjects.ProjectName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository  extends JpaRepository<Project, Long> {

    Optional<Project>findByName(ProjectName name);

    List<Project>findByOngId(Ong id);
}
