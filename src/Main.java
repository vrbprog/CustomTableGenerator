import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TableGenerator tableGenerator;
        List<String> header = new ArrayList<>(Arrays.asList("ID", "Name", "Login","Password"));
        List<String> row = new ArrayList<>(Arrays.asList("001", "Jon", "Jonny","lucky"));
        List<List<String>> rows = new ArrayList<>();
        rows.add(row);
        tableGenerator = new TableGenerator();
        String s = tableGenerator.generateTable(header,rows,1);
        System.out.println(s);
    }
}
