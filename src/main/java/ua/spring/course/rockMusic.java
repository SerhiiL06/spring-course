package ua.spring.course;

public class rockMusic implements IMusic{

    public rockMusic(String s) {
    }

    @Override
    public String getSong() {
        return "Rock";
    }
}
