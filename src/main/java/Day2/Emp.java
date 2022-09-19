package day1.bean;

/*
 ** @author LiGuanda
 ** @date  PM 5:00:52
 ** @description This is a description of Emp
 ** @params
 ** @return
 ** @since version-1.0  */


public class Emp {


    private String name;
    private String gender;
    private Dept dept;

    public Dept getDept() {

        return dept;

    }

    public void setName(String name) {

        this.name = name;

    }


    public void setGender(String gender) {

        this.gender = gender;

    }


    public void setDept(Dept dept) {

        this.dept = dept;

    }


    public void add() {

        System.out.println("add...." + name + " " + gender + " " + dept);

    }


}
