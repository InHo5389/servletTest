package main.webapp.threadlocal;

import main.webapp.threadlocal.code.FieldService;
import main.webapp.threadlocal.code.ThreadLocalService;

public class ThreadLocalServiceTest {

    public static void main(String[] args) {

        ThreadLocalService service = new ThreadLocalService();

        Runnable userA = ()-> {
            service.logic("userA");
        };
        Runnable userB = ()-> {
            service.logic("userB");
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
