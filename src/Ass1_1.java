import java.io.*;
import java.util.ArrayList;

public class Ass1_1 {
    public static void q1()throws IOException{
        ArrayList <String> rank1 = new ArrayList <String> ();
        ArrayList <String> rank2 = new ArrayList <String> ();
        ArrayList <String> rank3 = new ArrayList <String> ();
        ArrayList <String> rank4 = new ArrayList <String> ();

        FileReader fr = new FileReader("teams.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            String [] tokens = line.split(" ");

            switch (tokens [1]){
                case "1" :
                    rank1.add(tokens[0]);
                    break;

                case "2" :
                    rank2.add(tokens[0]);
                    break;

                case "3" :
                    rank3.add(tokens[0]);
                    break;

                case "4" :
                    rank4.add(tokens[0]);
                    break;
            }
            line = br.readLine();

        }
        br.close();
        fr.close();

        FileWriter fw = new FileWriter("rank.txt");
        PrintWriter pw = new PrintWriter(fw);

        String emptyString = ""+rank1;
        emptyString ="1 "+ emptyString.substring(1,emptyString.length()-1).replace(",","");
        pw.println(emptyString);

        emptyString = ""+ rank2;
        emptyString ="2 "+ emptyString.substring(1,emptyString.length()-1).replace(",","");
        pw.println(emptyString);

        emptyString = ""+ rank3;
        emptyString ="3 "+ emptyString.substring(1,emptyString.length()-1).replace(",","");
        pw.println(emptyString);

        emptyString = ""+ rank4;
        emptyString ="4 "+ emptyString.substring(1,emptyString.length()-1).replace(",","");
        pw.println(emptyString);

        pw.close();
        fw.close();
    }

    public static void main(String [] args){
        try {
            q1();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
