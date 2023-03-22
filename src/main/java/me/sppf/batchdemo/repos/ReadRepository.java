package me.sppf.batchdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import me.sppf.batchdemo.entities.Read;

public interface ReadRepository extends JpaRepository<Read, Long> {
    
}
