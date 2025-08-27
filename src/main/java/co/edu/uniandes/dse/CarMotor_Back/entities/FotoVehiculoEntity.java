package co.edu.uniandes.dse.CarMotor_Back.entities;

import jakarta.persistence.*;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fotos_vehiculo")
public class FotoVehiculoEntity extends BaseEntity {

    @Column(nullable = false, length = 400)
    private String urlImagen;

// Se intenta guardar las fotos  EXTERIOR, INTERIOR o MOTOR como texto
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoFotoEntity tipo;

    @Column(nullable = false)
    private boolean principal = false; // true = foto de portada

// Segun el UML esta tiene una relación muchos a 1 con Vehiculo
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehiculo_id", nullable = false,
                foreignKey = @ForeignKey(name = "fk_foto_vehiculo"))
    @JsonBackReference
    private vehiculoEntity vehiculo;
}