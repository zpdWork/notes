package zpd.io.StreamFileIO;

import java.io.File;

/**
 * File类.
 * <p/>
 * Created by Ad on 2016-07-07.
 */
public class FileDemo {

    public static void main(String[] args) {

        String dirName = "D:/work/ideaWork/zpd/runoob-node";
        File f = new File(dirName);
        if (f.isDirectory()) {
            System.out.println(dirName + "：是目录");
            String[] s = f.list();
            if (null != s && s.length > 0) {
                for (int i = 0; i < s.length; i++) {
                    File fs = new File(dirName + "/" + s[i]);
                    if (fs.isDirectory()) {
                        System.out.println(fs.getName() + "：是目录");
                    } else {
                        System.out.println(fs.getName() + "：不是目录");
                    }
                }
            }
        } else {
            System.out.println(dirName + "：不是目录");
        }

    }

}
