package ls18.tsk2;

public class Test {
    public static void main(String[] args) {
        try {
            err("djnv","jhfnhdfjnvjkdffghnfgmvkdf", "hbxnvhjfbvhjnvj");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean err(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (login.length()>20){
            throw new WrongLoginException("Всё очень плохо с логином");
        }
        if(password.length()>20 || !password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль шось такэ");
        }
        return true;
    }
}
