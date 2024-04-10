package ua.spring.course;

public class musicPlayer {
    private  IMusic music;

    public musicPlayer(IMusic music) {
        this.music = music;
    }

    public IMusic getSong() {
        return this.music;
    }

}
