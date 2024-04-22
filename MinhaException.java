package ExExcepion;

public class MinhaException extends Exception {
    public MinhaException(String msg){
        super(msg);
    }
    @Override
    public String getMessage(){
        return "Mensagem: " + super.getMessage();
    }
}
