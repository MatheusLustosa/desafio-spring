package cesar.next.desafio.spring.demo.entities;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@RequestMapping
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private int dependents;
    private double income;
    private String marital_status;
    private Date createdAT;
    private Date updatedAT;
@OneToMany(mappedBy = "Client")
private List<House> houses;
@OneToMany(mappedBy = "Client")
private List<Insurance> insurances;
@OneToMany(mappedBy = "Client")
private List<Vehicle> vehicles;


}
