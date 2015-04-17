package example;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Endre Czirbesz <endre@czirbesz.hu>
 */
public interface ArtifactRepository extends PagingAndSortingRepository<Artifact, Long> {
}
