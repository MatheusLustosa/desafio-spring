package cesar.next.desafio.spring.demo.entities;

import java.util.Date;
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
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private int risk;
    private String analysis;
    private String observation;
    private Date createdAT;
    private Date updatedAT;
@ManyToOne
private Client cliente;
}

