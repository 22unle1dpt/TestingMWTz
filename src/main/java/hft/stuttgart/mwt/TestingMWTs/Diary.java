package hft.stuttgart.mwt.TestingMWTs;


public class Diary {
    
    private String heading;
    private String content;

    Diary (String heading, String content){
        this.heading = heading;
        this.content = content;
    }

    public void setHeading(String heading) {
        this.heading = heading;
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

    
}