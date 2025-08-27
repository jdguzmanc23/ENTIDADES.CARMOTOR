package co.edu.uniandes.dse.CarMotor_Back.repositories;
import co.edu.uniandes.dse.CarMotor_Back.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
    List<ClienteEntity> findByEmail(String email);
}
