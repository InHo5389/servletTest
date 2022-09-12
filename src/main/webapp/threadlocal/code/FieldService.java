package main.webapp.threadlocal.code;

public class FieldService {

    private String nameStore;

    public String getNameStore() {
        return nameStore;
    }

    public String logic(String name){
        System.out.println("저장 name="+name+"-> nameStore = "+nameStore);
        nameStore = name;
        sleep(1000);
        System.out.println("조회 nameStore="+nameStore);
        return nameStore;
    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
