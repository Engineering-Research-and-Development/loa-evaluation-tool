package eng.it.loatool.process_segment_list_element;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessSegmentListElementRepository extends PagingAndSortingRepository<ProcessSegmentListElement, Integer> {

    @Query(
        " from ProcessSegmentListElement p" +
        " where" +
        "   p.mainProcess.pkTbId = :mainProcessId and" +
        "   p.subProcessLevel1 = null and" +
        "   p.subProcessLevel2 = null and" +
        "   p.subProcessLevel3 = null and" +
        "   p.subProcessLevel4 = null and" +
        "   p.subProcessLevel5 = null"
    )
    Optional<ProcessSegmentListElement> getProcessSegmentListElementWhichHasNoSubprocesses(@Param("mainProcessId") Integer mainProcessId);

    @Query(
        " from ProcessSegmentListElement p" +
        " where" +
        "   lower(p.mainProcess.name) like lower(concat('%', :namePiece,'%'))"
    )
    Page<ProcessSegmentListElement> getProcessSegmentListElementsLike(@Param("namePiece") String namePiece, Pageable pageable);

    @Query(
        " from ProcessSegmentListElement p" +
        " where" +
        "   lower(p.mainProcess.name) like lower(concat('%', :namePiece, '%'))"
    )
    Iterable<ProcessSegmentListElement> getProcessSegmentListElementsLike(@Param("namePiece") String namePiece);

    @Query(
        " from ProcessSegmentListElement p" +
        " where" +
        "   p.mainProcess.pkTbId = :mainProcessId"
    )
    Iterable<ProcessSegmentListElement> getProcessSegmentListElementsByProcessId(@Param("mainProcessId") Integer mainProcessId);

}
