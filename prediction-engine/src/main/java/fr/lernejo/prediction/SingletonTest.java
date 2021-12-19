package fr.lernejo.prediction;
class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() { }

    public static Singleton getInstance() {
        return singleton;
    }
    
    protected static void show() {
        System.out.println("Server travel agency");
        System.out.println("information in real-time");
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.show();
    }
}
