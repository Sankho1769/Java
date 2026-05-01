public class String_Main {
    private String value;

    public String_Main(String s) {
        this.value = s;
    }

    public String toString() {
        return this.value;
    }

    public static void main(String[] args) {
        String_Main name = new String_Main("Sankho");
        name = new String_Main(name.value + "Cristine");
        System.out.println("Hello " + name);

        String_Main s1 = new String_Main("Sankho");
        String_Main s2 = new String_Main("Cristine");

        System.out.println(s1 == s2);

    }
}
