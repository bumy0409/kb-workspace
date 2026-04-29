package main.java.ch03_class.basic.sec07.exam01.run;

import main.java.ch03_class.basic.sec07.exam01.service.ClsService;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

public class ClsRun {
    public static void main(String[] args) {
        Student myStudent = new Student();
//        myStudent.ex();

        ClsService service = new ClsService();;
        service.ex3();

    }
}
