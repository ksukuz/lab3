package task5;

public class WrongLoginException extends Exception{

    public WrongLoginException(){

    }

    public WrongLoginException(String message){
        Exception exception = new Exception(message);
    }

}