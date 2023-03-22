package me.sppf.batchdemo.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Writer {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private String value;
    
}
