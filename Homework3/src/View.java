import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public String getInfo(){
    System.out.println("Вводите через пробел. Фамилия Имя Отчество дата_рождения(dd/mm/yyyy) номер телефона(цифры) пол(m,f)");
    return in.nextLine();}
}
