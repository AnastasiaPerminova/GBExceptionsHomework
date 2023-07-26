public class Date {
    int day;
    int month;
    int year;

    public Date() {
         }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", day,month,year);
    }
}
