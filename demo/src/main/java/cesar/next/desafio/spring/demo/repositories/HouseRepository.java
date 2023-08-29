package cesar.next.desafio.spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cesar.next.desafio.spring.demo.entities.House;

public interface HouseRepository extends JpaRepository<House, Long>{
    
}
