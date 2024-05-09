class SubsystemA {
    public void operationA() {
        System.out.println("Subsystem A operation");
    }
}

class SubsystemB {
    public void operationB() {
        System.out.println("Subsystem B operation");
    }
}

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
}

    public void operation() {
        System.out.println("Facade operation"); 
        subsystemA.operationA(); 
        subsystemB.operationB();
    }
}

public class Main {
    public static void main(String[] args) {
    Facade facade = new Facade();
    facade.operation();
    }
}