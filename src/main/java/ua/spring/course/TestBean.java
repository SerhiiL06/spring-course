package ua.spring.course;

public class TestBean {
    private String name;



    public TestBean(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return  "OK changed";
    }
}
