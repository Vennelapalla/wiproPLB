class Foundation {

    private int var1 = 10;
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;
}

public class Main {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Private - Not Accessible
        System.out.println(obj.var2);    // Default - Accessible (same package)
        System.out.println(obj.var3);    // Protected - Accessible (same package)
        System.out.println(obj.var4);    // Public - Accessible
    }
}