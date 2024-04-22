package ExException;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        
        ClasseQualquer c = new ClasseQualquer();
        try {
            c.meuMetodo(2,0);
        } catch (ArithmeticException | MinhaException e) {
            System.out.println(e.getMessage());
        }
    }
}
