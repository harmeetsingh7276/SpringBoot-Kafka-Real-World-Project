package net.kafka.springboot.repository;

import net.kafka.springboot.entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepository extends JpaRepository<WikiMediaData,Long> {
}
