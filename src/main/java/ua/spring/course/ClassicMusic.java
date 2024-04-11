package ua.spring.course;

import org.springframework.stereotype.Component;

@Component("testClassic")
public class ClassicMusic implements IMusic{

    private Integer countOperation = 0;

    @Override
    public String getSong() {
        return "Classic Music";
    }

    public Integer getCountOperation() {
        return  this.countOperation;
    }

    public void setCountOperation(Integer countOperation) {
        this.countOperation += countOperation;
    }
}
