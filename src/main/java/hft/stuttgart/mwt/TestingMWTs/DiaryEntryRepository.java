package hft.stuttgart.mwt.TestingMWTs;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface DiaryEntryRepository extends JpaRepository<DiaryEntry, Long>{
   
 //  Optional<DiaryEntry> getEntry(Long diary_id);

}
