package hft.stuttgart.mwt.TestingMWTs;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


@Entity
public class DiaryEntry {
    private @jakarta.persistence.Id @GeneratedValue Long Id;
    private Long diaryId;
    private String diary;
    private String heading;
    private String content;
    private LocalDateTime date;


    DiaryEntry(){}

    

    public DiaryEntry(Long diaryId, String diary, String heading, String content, LocalDateTime date) {
        this.diaryId = diaryId;
        this.diary = diary;
        this.heading = heading;
        this.content = content;
        this.date = date;
    }

    
    public DiaryEntry(String heading, String content, LocalDateTime date) {
        this.heading = heading;
        this.content = content;
        this.date = date;
    }

    public DiaryEntry(String heading, String content) {
        this.heading = heading;
        this.content = content;
    }



    public LocalDateTime getDate() {
        return date;
    }

    public Long getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Long diaryId) {
        this.diaryId = diaryId;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeading() {
        return heading;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return Id;
    }

    public String getDiary() {
        return diary;
    }

    public void setDiary(String diary) {
        this.diary = diary;
    }



    @Override
    public String toString() {
        return "DiaryEntry [Id=" + Id + ", diaryId=" + diaryId + ", diary=" + diary + ", heading=" + heading
                + ", content=" + content + ", date=" + date + "]";
    }

}
