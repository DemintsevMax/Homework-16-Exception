import exсeption.WrongLoginException;
import exсeption.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            new Validator("Сиська", "а", "D_1hWiKjjP_9");
            System.out.println("Все параметры валидны.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
