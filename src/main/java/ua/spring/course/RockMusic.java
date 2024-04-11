package ua.spring.course;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements IMusic{
    private  Integer count = 0;


    @Override
    public String getSong() {
        return "Rock";
    }

    public void myInit() {
        System.out.println("Init bean");
    }

    public void myDestroy() {
        System.out.println("Destroy bean");
    }

    public Integer getCountOperation() {
        return  this.count;
    }

    public void setCountOperation(Integer countOperation) {
        this.count += countOperation;
    }
}
