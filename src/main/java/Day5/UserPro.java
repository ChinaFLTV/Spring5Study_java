package Day5;

/*
 ** @author LiGuanda
 ** @date  PM 3:59:10
 ** @description This is a description of User
 ** @params
 ** @return
 ** @since version-1.0  */

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 */
@Component
public class User {


    @SuppressWarnings("FieldMayBeFinal")
    private String name = null;
    @SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
    private int age = 0;


    public void show() {

        System.out.println("can can need .......");

    }


    @Override
    public String toString() {

        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }


}
