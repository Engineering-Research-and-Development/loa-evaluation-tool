package eng.it.loatool.process_sequence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessSequenceRepository extends CrudRepository<ProcessSequence, Integer> {
}
