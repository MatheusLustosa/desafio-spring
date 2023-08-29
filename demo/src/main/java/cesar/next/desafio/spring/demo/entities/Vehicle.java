package cesar.next.desafio.spring.demo.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@RequestMapping
public class Vehicle{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String brand;
 private String model;
 private int year;   
@ManyToOne
 private Client cliente;
}
