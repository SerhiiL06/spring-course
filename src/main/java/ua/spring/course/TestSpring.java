package ua.spring.course;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("player", MusicPlayer.class);

        System.out.println(player.getSong());

        context.close();
    }
}
