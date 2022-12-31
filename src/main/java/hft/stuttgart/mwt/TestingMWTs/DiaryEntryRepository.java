package hft.stuttgart.mwt.TestingMWTs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface DiaryEntryRepository extends JpaRepository<DiaryEntry, Long>{
   
  @Query(value = "SELECT * FROM diary_entry WHERE diary_id = :diary_id", nativeQuery = true)
  List <DiaryEntry> findAllEntriesPerId(@Param("diary_id") Long diary_id);

}
