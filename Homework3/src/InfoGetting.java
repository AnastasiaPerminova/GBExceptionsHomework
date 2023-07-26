public class InfoGetting {
    View view = new View();
    String info = view.getInfo();

    public InfoGetting() {
    };

    public String[] infoParsing() throws ParsingError{
        int count = info.length() - info.replace(" ", "").length();
        if (count != 5){
            throw new ParsingError("");
        }
        else {
            String[] infoParse = info.split(" ");
            return infoParse;
        }
    }
}
