public class ExampleSingleton {
    
    private static ExampleSingleton uniqueInstance = null;

    private ExampleSingleton(){

    }

    public static ExampleSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance =  new ExampleSingleton();
        }
        return uniqueInstance;
    }
}
