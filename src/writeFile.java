import java.io.*;

public class writeFile {
    private int number = 0;
    public void writeToFile(StringBuilder output) throws IOException {
        File f = fileName();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(output));
        bw.close();
    }

    private File fileName(){
        while(true) {
            String filePath = "rule" + number + ".txt";
            if(number == 0){
                filePath = "rule.txt";
            }
            File f = new File(filePath);
            if(f.exists()){
                number++;
            }
            else{
                number = 0;
                return f;
            }
        }
    }
}
