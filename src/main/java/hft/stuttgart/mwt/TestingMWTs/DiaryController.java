package hft.stuttgart.mwt.TestingMWTs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {
    
    @RequestMapping(value="/diary/{id}", method = RequestMethod.GET)
    @ResponseBody
    String hello(@PathVariable String id){
        if(Integer.valueOf(id) == 1){
            return "Hello Lennart";
        }
        else {
            return "Diary "+ id +  " is unknown. Select a different ID.";
        }
    }

    @RequestMapping(value="/diary/entry", method = RequestMethod.POST)
    @ResponseBody
    public String postDiaryEntry(){
        return "Post some Diary Entries";
    }
}
