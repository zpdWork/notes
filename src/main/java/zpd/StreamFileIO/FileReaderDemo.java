package zpd.StreamFileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ad on 2016-07-07.
 */
public class FileReaderDemo {

    public static void main(String[] args) {

        try {
            File f = new File("D:/work/test.txt");

            FileWriter fw = new FileWriter(f);
            fw.append("11ada1");
            fw.append("ada2");
            fw.append("ada3");
            //fw.write("ada1");
            //fw.write("ada2");
            //fw.write("ada3");
            fw.close();

            FileReader fr = new FileReader(f);
            //char [] a = new char[50];
            //fr.read(a); // 读取数组中的内容
            //for(char c : a) {
            //    System.out.print(Character.toString(c)); // 一个一个打印字符
            //}

            StringBuilder sb = new StringBuilder();
            while (fr.ready()) {
                sb.append((char) fr.read());
            }
            System.out.println(sb);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
