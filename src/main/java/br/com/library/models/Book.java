package br.com.library.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Book {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public Integer year;
    public Boolean available;
    public BigDecimal price;
}
