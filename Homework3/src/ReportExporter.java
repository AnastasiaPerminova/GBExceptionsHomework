import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class ReportExporter {
    public void saveReportToFile(String path, String
            data) {
        String modifiedOutputData = data;
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path, true))))
        {
            writer.println(modifiedOutputData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}