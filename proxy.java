interface Subject {
    void request();
}
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject request");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }
    public void request() {
        System.out.println("Proxy request");
        realSubject.request();
    }
}

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}