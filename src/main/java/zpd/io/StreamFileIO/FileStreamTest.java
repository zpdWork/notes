package zpd.io.StreamFileIO;

import java.io.*;

/**
 * Created by Ad on 2016-07-07.
 */
public class FileStreamTest {

    /**
     * 出现乱码.
     */
    public static void test1() {
        try {
            byte[] b = {1, 11, 111, 21, 8};
            File f = new File("D:/work/test.txt");
            OutputStream fileOut = new FileOutputStream(f);
            for (int i = 0; i < b.length; i++) {
                fileOut.write(b[i]);
            }
            fileOut.close();


            InputStream fileIn = new FileInputStream(f);
            for (int i = 0; i < fileIn.available(); i++) {
                System.out.println((char) fileIn.read());
            }
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void test2() {
        try {
            File f = new File("D:/work/test.txt");
            FileOutputStream fileOut = new FileOutputStream(f);
            OutputStreamWriter out = new OutputStreamWriter(fileOut, "utf-8");

            //out.append("啊大2");
            //out.write("啊大3");

            out.close();
            fileOut.close();


            FileInputStream fileIn = new FileInputStream(f);
            InputStreamReader in = new InputStreamReader(fileIn, "utf-8");
            StringBuilder sb = new StringBuilder();
            while (in.ready()) {
                sb.append((char) in.read());
            }
            System.out.println(sb);
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //test1();
        test2();

    }

}
