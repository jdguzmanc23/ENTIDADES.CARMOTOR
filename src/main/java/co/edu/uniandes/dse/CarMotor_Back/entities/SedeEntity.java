package co.edu.uniandes.dse.CarMotor_Back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;
@Getter
@Setter
@Entity

public class SedeEntity extends BaseEntity  {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String horarios;

    // Relación OneToMany con Asesor
    @OneToMany(mappedBy = "sede")
    private List<AsesorEntity> asesores = new ArrayList <> () ;

    // Relación OneToMany con Vehiculo
    @OneToMany(mappedBy = "sede")
    private List<vehiculoEntity> vehiculos = new ArrayList <> ();
    // Relacion ManyToMany con Banco Convenio
    @ManyToMany
    private List<bancoConvenioEntity> bancosConvenio = new ArrayList<>();
    @OneToMany(mappedBy= "sede")
    private List<testdriveEntity> testdrives= new ArrayList<>();
    

}
