public class Singleton {
    private static Singleton instancia;
 
    private Singleton() {}

    private synchronized static void createInstance() {
        if (instancia == null) { 
            instancia = new Singleton();
        }
    }
 
    public static Singleton getInstance() {
        createInstance();

        return instancia;
    }
} 