public class Main{
    public static void main(String[] args){
        KnifeStore knifeStore = new BudgetKnifeStore();
        Knife knife = knifeStore.orderKnife("steak");

    }
    
}