package co.edu.uniandes.dse.CarMotor_Back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

public class AsesorEntity extends BaseEntity {

    private String nombre;
    private String fotoUrl;
    private String telefono;
    private String email;

    @ManyToOne
    private SedeEntity sede;

    // Relación de Asesor uno a muchos TestDrive
    @OneToMany(mappedBy = "asesor")
    private List<testdriveEntity> testDrives = new ArrayList<>();
}
