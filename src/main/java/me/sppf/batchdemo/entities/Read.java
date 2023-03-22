package me.sppf.batchdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Read {

    @Id   
    private Long id;

    private String name;

    private String value;
}
