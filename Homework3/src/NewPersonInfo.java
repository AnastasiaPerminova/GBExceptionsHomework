public class NewPersonInfo {
    InfoGetting information;
    Person person;
    String[] parsed_info;

    String[] dateParse;
    public NewPersonInfo() throws ParsingError {
        this.information = new InfoGetting();
        this.person = new Person();
        fillInfo();
        createBirthDate();
        setPerson();
    }
    public void fillInfo() throws ParsingError {
        try{
          parsed_info = information.infoParsing();
        } catch (ParsingError e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public void setName(){
        person.name = parsed_info[1];
    }

    public void setSurname(){
        person.surname = parsed_info[0];
    }

    public void setMiddleName(){
        person.middle_name = parsed_info[2];
    }

    public void setPhoneNumber(){
        try {
            person.phone_number = Integer.parseInt(parsed_info[4]);
        }
        catch(NumberFormatException e){
            System.out.println("Неправильно введен номер телефона. Должны быть только цифры.");
            System.exit(1);
        }
    }

    public String[] checkBirthDate(String date) throws ParsingError {
        int count = date.length() - date.replace("/", "").length();
        if (count != 2){
            throw new ParsingError("Дата введена некорректно. Ввод должен быть в формате dd/mm/yyyy.");
        }
        else {
            String[] parsedDate = date.split("/");
            return parsedDate;
        }
    }

    public void createBirthDate() {
        try {
            dateParse = checkBirthDate(parsed_info[3]);
        } catch (ParsingError e){
        System.out.println("Дата введена некорректно. Ввод должен быть в формате dd/mm/yyyy.");
        System.exit(1);
        }
    }
    public void setBirthDate()  {
            person.birth_date = new Date();
        try{
            int day = Integer.parseInt(dateParse[0]);
            if(day < 1 || day > 31){
            throw new NumberFormatException("Неправильно введена дата.");
            }
            person.birth_date.day = day;
        } catch (NumberFormatException e){
            System.out.println("Неправильно введена дата:день.");
            System.exit(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно введена дата:день.");
            System.exit(1);}
        try {
            int month = Integer.parseInt(dateParse[1]);
            if(month < 1 || month > 12){
                throw new NumberFormatException("Неправильно введена дата.");
                }
            person.birth_date.month = month;
        } catch (NumberFormatException e){
            System.out.println("Неправильно введена дата:месяц.");
            System.exit(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно введена дата:месяц.");}
        try {
            int year = Integer.parseInt(dateParse[2]);
            if(year < 1900 || year > 2100){
                throw new NumberFormatException("Неправильно введена дата.");
            }
            person.birth_date.year = year;
        } catch (NumberFormatException e){
            System.out.println("Неправильно введена дата:год.");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неправильно введена дата:год.");
            System.exit(1);
        }
    }

    public void setGender(){
        try{
            person.gender = Gender.valueOf(parsed_info[5]);

        }catch (IllegalArgumentException e){
            System.out.println("Ошибка ввода.Пол должен быть введен m или f.");
            System.exit(1);
        }
    }

    public void setPerson() throws ParsingError {
        setSurname();
        setName();
        setMiddleName();
        setBirthDate();
        setPhoneNumber();
        setGender();}

    public Person getPerson(){

        return person;
    }

}

