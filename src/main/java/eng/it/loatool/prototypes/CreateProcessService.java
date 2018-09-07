package eng.it.loatool.prototypes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eng.it.loatool.process_sequence.ProcessSequence;
import eng.it.loatool.process_sequence.ProcessSequenceRepository;

@Service
public class CreateProcessService {

    @Transactional
    public Optional<ProcessSequence> createProcess(ProcessSequence tbAceProSeq) {
        if (
            tbAceProSeq.getPkTbId() == null ||
            !tbAceProSeqRepository.existsById(tbAceProSeq.getPkTbId())
        ) {
            tbAceProSeqRepository.save(tbAceProSeq);
            return Optional.of(tbAceProSeq);
        }
        return Optional.empty();
    }

    @Autowired private ProcessSequenceRepository tbAceProSeqRepository;

}
