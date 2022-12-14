package main.webapp.threadlocal.code;

public class ThreadLocalService {

    private ThreadLocal<String> nameStore = new ThreadLocal<>();

    public String getNameStore() {
        return nameStore.get();
    }

    public String logic(String name){
        System.out.println("์ ์ฅ name="+name+"-> nameStore = "+nameStore.get());
        nameStore.set(name);
        sleep(1000);
        System.out.println("์กฐํ nameStore="+nameStore.get());
        return nameStore.get();
    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
