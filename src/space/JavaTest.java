import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaTest {
    public static void main(String[] args){
        char[][] map = new char[5][5];
        try{
            File file = new File("C:\\algo\\test.txt");
            FileReader fr = new FileReader(file);
            int singleCh = 0;
            int i=0,j=0;
            while ((singleCh = fr.read()) != -1) {
                //System.out.println(singleCh);
                if(singleCh == 13) {
                    i++;
                    j=0;
                }
                map[i%5][j%5] = ((char)singleCh);
                j++;
            }
            fr.close();
        }catch(FileNotFoundException e){

        }catch(IOException e){

        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.println(map[i][j]);
            }
        }

    }
}
