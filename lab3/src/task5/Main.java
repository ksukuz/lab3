package task5;

/*
Создайте статический метод, который принимает на вход три параметра:
login, password и confirmPassword. Login должен содержать только латинские
буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20
символов. Если login не соответствует этим требованиям, необходимо выбросить
WrongLoginException. Password должен содержать только латинские буквы,
цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
Также password и confirmPassword должны быть равны. Если password не
соответствует этим требованиям, необходимо выбросить
WrongPasswordException. WrongPasswordException и WrongLoginException –
пользовательские классы исключения с двумя конструкторами – один по
умолчанию, второй принимает сообщение исключения и передает его в
конструктор класса Exception. Обработка исключений проводится внутри метода.
Необходимо использовать несколько блоков catch. Метод возвращает true, если
значения верны или false в другом случае.
 */

public class Main {
    public static void main(String[] args) {
        boolean authorization1 = authorization("____", "ksAu123_", "ksAu123_");
        boolean authorization2 = authorization("ksenia","fff456","fff456");

        System.out.println(authorization1);
        System.out.println(authorization2);

    }

    public static boolean authorization(String login, String password, String confirmPassword){
        try {
            if(!login.matches("[a-zA-Z0-9_]*") || login.length()>=20){
                throw new WrongLoginException(login);

            }
            if(!password.matches("[a-zA-Z0-9_]*") || !password.equals(confirmPassword) || password.length()>=20){
                throw new WrongPasswordException(password);
            }
        }catch (WrongLoginException ex){
            System.out.println("Wrong login");
            return false;
        }
        catch (WrongPasswordException ex){
            System.out.println("Wrong password");
            return false;
        }return true;
    }
}
