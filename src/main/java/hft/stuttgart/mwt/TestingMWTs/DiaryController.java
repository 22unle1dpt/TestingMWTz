package hft.stuttgart.mwt.TestingMWTs;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {

    private final DiaryRepository repository;
    private final DiaryEntryRepository entryRepository;

    DiaryController(DiaryRepository repository, DiaryEntryRepository entryRepository) {
        this.repository = repository;
        this.entryRepository = entryRepository;
    }

    // Diaries

    @GetMapping("/diaries")
    List<Diary> getAllDiaries() {
        return repository.findAll();
    }

    @GetMapping("/diary/{id}")
    Diary getDiaryById(@PathVariable Long id) {
        Optional<Diary> diary = repository.findById(id);
        if (diary.isEmpty()) {
            // throw new DiaryNotFoundException(id);
            return diary.get();
        } else {
            Diary foundDiary = diary.get();
            return foundDiary;
        }
    }

    @PostMapping("/newdiary")
    public String createDiary(@RequestBody Diary newDiary) {
        repository.save(newDiary);
        return "Created Diary: " + newDiary.toString();
    }

    @PutMapping("/diary/{id}")
    String updateDiaryById(@RequestBody Diary newDiary, @PathVariable Long id) {
        if (repository.findById(id).isEmpty()) {
            Diary diary = new Diary(newDiary.getTitle());
            repository.save(diary);
            return "Created Diary: " + diary;
        } else {
            Diary diaryFromDB = repository.findById(id).get();
            diaryFromDB.setTitle(newDiary.getTitle());
            repository.save(diaryFromDB);
            return "Updated Diary: " + diaryFromDB;
        }

    }

    @DeleteMapping("/diary/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // Diary Entries
/*    @GetMapping("/diary/{id}/entries")
    Optional<DiaryEntry> getAllEntriesPerId(@PathVariable Long id) {
        Optional<DiaryEntry> diaryEntries = entryRepository.getEntry(id);
        return diaryEntries;
      /*   if (diary.isEmpty()) {
            // throw new DiaryNotFoundException(id);
            return  "Not Found id =" + id;
        } else {
            entryRepository
            return foundDiary.toString(); 
        }*/
        
 

    @PostMapping("/diary/{id}/newEntry")
    public String createDiaryEntry(@PathVariable Long id, @RequestBody DiaryEntry diaryEntry) {
        Diary diary = getDiaryById(id);
        DiaryEntry newDiaryEntry = new DiaryEntry(diary.getId(), diary.getTitle(), diaryEntry.getHeading(),
                diaryEntry.getContent());
        entryRepository.save(newDiaryEntry);
        return "Created Diary Entry: " + newDiaryEntry.toString();
    }

}
