package ExExcepion;

public class ClasseQualquer {
    public void meuMetodo(int a, int b) throws MinhaException{
        if (b==0){
            throw new MinhaException("Erro de divisão por zero");
        }
    }
}
