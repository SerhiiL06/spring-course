package ua.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class MusicPlayer {
    private IMusic music;


    @Autowired
    public MusicPlayer(@Qualifier("testClassic") IMusic music) {
        this.music = music;

    }

    public String getSong() {
        return this.music.getSong();
    }

    public Integer getCountOperation() {
        return  this.music.getCountOperation();
    }

    public  void setCountOperation(Integer countOperation) {
        this.music.setCountOperation(countOperation);
    }
}
