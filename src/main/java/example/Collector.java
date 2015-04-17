package example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author Endre Czirbesz <endre@czirbesz.hu>
 */
@Data
@Entity
public class Collector {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Artifact> artifacts;
}
