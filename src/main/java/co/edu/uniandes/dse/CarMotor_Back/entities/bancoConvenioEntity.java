package co.edu.uniandes.dse.CarMotor_Back.entities;
import jakarta.persistence.*;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "bancos_convenio")
@Data
public class bancoConvenioEntity extends BaseEntity{
    private String nombre;
    private String logoURL;
    private String telefono_asesor;

    @PodamExclude
    @ManyToMany(mappedBy = "bancosConvenio", fetch = FetchType.LAZY)
    private List<SedeEntity> sedes = new ArrayList<>();
}