package task5;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }

    public WrongPasswordException(String message){

        Exception exception = new Exception(message);
    }
}

