package day1.bean;


/*
** @author LiGuanda
** @date  PM 5:02:42
** @description This is a description of Dept
** @params
** @return
** @since version-1.0  */



public class Dept {


    private String name;


    public void setName(String name) {

        this.name = name;

    }


    @Override
    public String toString() {

        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }


}
