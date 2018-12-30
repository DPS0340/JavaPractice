public class helloworld {
    private String context;
    public helloworld(String arg) {
        init(arg);
    }
    public void hello() {
        System.out.println("Hello world!");
    }
    public void caller() {
        this.call();
    }
    private void call() {
        System.out.println("Hello My secret " + this.context + "!");
    }
    private void init(String arg) {
        System.out.println("Hello Init!");
        this.context = arg;
    }
}