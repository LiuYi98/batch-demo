package me.sppf.batchdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import me.sppf.batchdemo.entities.Writer;

public interface WriteRepository extends JpaRepository<Writer, Long> {
    
}
