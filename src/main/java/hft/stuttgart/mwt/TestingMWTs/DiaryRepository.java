package hft.stuttgart.mwt.TestingMWTs;

import org.springframework.data.jpa.repository.JpaRepository;

interface DiaryRepository extends JpaRepository<Diary, Long>{
    
}
