public class KnifeStore {

    private final KnifeFactory factory;
    // require a KnifeFactory object to be passed
    // to this constructor:
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }
    public Knife orderKnife(String knifeType) {
        Knife knife;
        //use the create method in the factory
        knife = factory.createKnife(knifeType);
        //prepare the Knife
        knife.sharpen();
        knife.polish();
        return knife;
    }
}