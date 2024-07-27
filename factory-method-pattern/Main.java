public class Main{
    public static void main(String[] args) {
        KnifeStore knifeStore = new KnifeStore(new KnifeFactory());
        Knife knife = knifeStore.orderKnife("chefs");
    }
}