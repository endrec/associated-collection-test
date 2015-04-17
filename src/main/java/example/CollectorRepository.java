package example;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Endre Czirbesz <endre@czirbesz.hu>
 */
public interface CollectorRepository extends PagingAndSortingRepository<Collector, Long> {
}
