package example;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Endre Czirbesz <endre@czirbesz.hu>
 */
@Data
@Entity
@Accessors(chain = true, fluent = true)
public class Artifact {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "collector_id")
    private Collector owner;
}
