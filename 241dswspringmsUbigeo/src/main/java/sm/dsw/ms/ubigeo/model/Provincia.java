package sm.dsw.ms.ubigeo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {
    
    @Id
    private Long id;
    
    private String name;
    
    @Column(name = "departamento_id")
    private Long departamentoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartamento_id() {
        return departamentoId;
    }

    public void setDepartamento_id(Long departamento_id) {
        this.departamentoId = departamento_id;
    }
    
    
}
