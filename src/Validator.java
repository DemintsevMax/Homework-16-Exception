import exсeption.WrongLoginException;
import exсeption.WrongPasswordException;

public class Validator {


    public Validator(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка логина
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Login должен быть меньше 20 символов и содержать только латинские буквы, цифры и знак подчеркивания.");
        }

        // Проверка пароля
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Password должен быть меньше 20 символов и содержать только латинские буквы, цифры и знак подчеркивания.");
        }

        // Проверка совпадения паролей
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и confirmPassword должны совпадать.");
        }
    }}