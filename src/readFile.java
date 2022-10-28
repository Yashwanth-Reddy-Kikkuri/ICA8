import java.io.*;

public class readFile {
    public StringBuilder readFromFile() throws IOException {
        File file = new File("urinal.dat");
        FileReader fr = new FileReader(file);

        if(fr == null){
            System.out.println("No input file");
            return null;
        }

        BufferedReader bufferedReader = new BufferedReader(fr);
        String str;
        StringBuilder output = new StringBuilder("");
        while((str = bufferedReader.readLine()) != null){
            if(str.equals("-1")){
                break;
            }
            countRemaining cr = new countRemaining();
            int v = cr.countRemaining(str);
            output.append(v);
            output.append("\n");
        }
        return output;
    }
}
