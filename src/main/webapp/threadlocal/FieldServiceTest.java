package main.webapp.threadlocal;

import main.webapp.threadlocal.code.FieldService;

public class FieldServiceTest {

    public static void main(String[] args) {

        FieldService fieldService = new FieldService();

        Runnable userA = ()-> {
            fieldService.logic("userA");
        };
        Runnable userB = ()-> {
            fieldService.logic("userB");
        };

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadA.setName("thread-B");

        threadA.start();
        sleep(100);
        threadB.start();
    }

    public static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
