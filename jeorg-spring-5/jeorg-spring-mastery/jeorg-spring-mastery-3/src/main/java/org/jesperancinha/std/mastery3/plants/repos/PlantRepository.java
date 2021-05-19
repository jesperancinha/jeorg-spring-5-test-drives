package org.jesperancinha.std.mastery3.plants.repos;

import org.jesperancinha.std.mastery3.plants.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
