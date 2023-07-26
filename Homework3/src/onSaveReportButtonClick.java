import java.io.IOException;

public class onSaveReportButtonClick {
    public String generateOutputReportPath(Person person){
        String path = person.surname + ".txt";
        return path;
    };
    public void onSaveReportButtonClick(Person person) {
        String path = generateOutputReportPath(person);
        String outputData = String.valueOf(person);
        ReportExporter reportExporter = new
                ReportExporter();

        reportExporter.saveReportToFile(path,outputData);
    }
}