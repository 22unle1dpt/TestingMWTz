package hft.stuttgart.mwt.TestingMWTs;

public class DiaryNotFoundException extends RuntimeException {
    
    
    DiaryNotFoundException(Long id) {
        super("Could not find diary " + id);
    }
}
