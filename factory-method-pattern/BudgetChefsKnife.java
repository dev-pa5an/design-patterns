public class BudgetChefsKnife extends Knife{
    @Override
    public void sharpen() {
        System.out.println("Sharpening a budget chef's knife...");
    }

    @Override
    public void polish() {  // Corrected typo
        System.out.println("Polishing a budget chef's knife...");
    }

    @Override
    public void packageKnife() {
        System.out.println("Packaging a budget chef's knife...");
    }
}