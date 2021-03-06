package example;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
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
@Accessors(chain = true, fluent = true)
public class Collector {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Artifact> artifacts;
}
