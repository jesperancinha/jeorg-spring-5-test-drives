package org.jesperancinha.std.flash411.repository.repository;

import org.jesperancinha.std.flash411.repository.domain.Kurzgesagt;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;


@RepositoryDefinition(domainClass = Kurzgesagt.class,
        idClass = Long.class)
public interface KurzgesagtRepository {
    Kurzgesagt save(Kurzgesagt book);

    List<Kurzgesagt> findAll();
}
