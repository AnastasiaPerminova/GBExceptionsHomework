public class ParsingError extends Exception{
    public ParsingError(String message) {
        super("Введены не все данные, введены лишние данные или введен лишний пробел.");
    }
}
