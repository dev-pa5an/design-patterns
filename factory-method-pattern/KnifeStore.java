public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {
        Knife knife = createKnife(knifeType); // Create the knife using the subclass's implementation
        if (knife != null) { // Check if knife creation was successful
            knife.sharpen();
            knife.polish();
            knife.packageKnife(); // Use the corrected method name
            return knife;
        } else {
            throw new IllegalArgumentException("Invalid knife type: " + knifeType);
        }
    }

    abstract Knife createKnife(String type);
}