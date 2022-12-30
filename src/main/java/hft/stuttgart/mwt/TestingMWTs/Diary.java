package hft.stuttgart.mwt.TestingMWTs;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Diary {

    private @jakarta.persistence.Id @GeneratedValue Long id;
    private String title;

    public Diary() {
    }

    public Diary(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Diary [Id=" + id + ", owner=" + title + "]";
    }

   

}
