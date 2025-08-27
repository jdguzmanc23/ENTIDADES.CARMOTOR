package co.edu.uniandes.dse.CarMotor_Back.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class ClienteEntity extends BaseEntity {

    private String nombre;
    private String email;
    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<testdriveEntity> testDrives = new ArrayList<>();

}
