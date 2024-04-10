package ua.spring.course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean tBean = context.getBean("testBean", TestBean.class);

        tBean.setName("Serhii");

        System.out.println(tBean.getName());

        context.close();
    }
}
