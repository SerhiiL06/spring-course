package ua.spring.course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        musicPlayer music =  context.getBean("musicPlayer", musicPlayer.class);

        System.out.println(music.getSong());

        context.close();
    }
}
