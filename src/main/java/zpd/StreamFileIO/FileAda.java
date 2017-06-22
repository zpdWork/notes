package zpd.StreamFileIO;

import java.io.*;
import java.util.Date;

/**
 * Created by Ad on 2016-11-09.
 */
public class FileAda {

	/**
	 * 写文件.
	 *
	 * @throws IOException
	 */
	public static void writerFile() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("d://test.txt", true));
		writer.write("ada-test-file;啊大-测试-文件");
		writer.flush();
		writer.close();
	}

	/**
	 * 创建目录.
	 */
	public static void createDirs(File f) {
		// f.mkdir(); // 只能创建一个,并且路径也只能是一个
		f.mkdirs(); //
	}

	/**
	 * File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录.
	 * 使用递归，从指定目录开始，一个一个判断、删除.
	 */
	public static boolean delDirs(File f) {
		if (f.isDirectory()) {
			String[] fStr = f.list();
			for (String s : fStr) {
				boolean del = delDirs(new File(f, s));
				if (!del) {
					return false;
				}
			}
		}
		if (f.delete()) {
			System.out.println("delDirs目录" + f.getPath() + "删除成功");
			return true;
		} else {
			System.out.println("delDirs目录" + f.getPath() + "删除成功");
			return false;
		}
	}

	/**
	 * 校验指定目录是否存在.
	 *
	 * @param f
	 */
	public static void isDirNull(File f) {
		if (f.isDirectory()) {
			String[] s = f.list();
			if (s.length > 0) {
				System.out.println("isDirNull目录" + f.getPath() + "不为空");
			}
		} else {
			System.out.println("isDirNull目录" + f.getPath() + "不存在");
		}
	}

	/**
	 * 判断指定文件是否是隐藏文件.
	 *
	 * @param f
	 */
	public static void isHiddenFile(File f) {
		System.out.println("isHiddenFile " + (f.isHidden() ? f.getPath() : f.getPath() + "不") + "是隐藏文件");
	}

	/**
	 * 查看指定file.
	 *
	 * @param f
	 */
	public static void showFile(File f) {
		System.out.println("showFile " + f.getPath() + " " + f.getName());
		if (f.isDirectory()) {
			// String[] s = f.list();// 输出的是文件名
			// for (String s1 : s) {
			// System.out.println(s1);
			// }
			File[] f1 = f.listFiles(); // 输出的是带路径的
			for (File file : f1) {
				if (file.isDirectory()) {
					showFile(file);
				} else {
					System.out.println("showFile " + f.getPath() + "" + file);
				}
			}

		}
		System.out.println("showFile ----------------------------------");
	}

	/**
	 * 获取指定文件的最后修改时间.
	 */
	public static void getFileLastTime(File f) {
		System.out.println("getFileLastTime " + f.getPath() + " " + new Date(f.lastModified()));
	}

	/**
	 * //* 获取指定文件父级信息.
	 * 
	 * @param f
	 */
	public static void getFileParent(File f) {
		System.out.println("getFileParent " + f.getPath() + " " + f.getParentFile());
	}

	/**
	 * 获取指定文件目录大小.
	 * 
	 * @param f
	 */
	public static void getFileSize(File f) {
		// FileUtils - import org.apache.commons.io.FileUtils;
		// System.out.println("getFileSize " + FileUtils.sizeOfDirectory(new
		// File("C:/test")) + " bytes");
	}

	/**
	 * 获取当前工作目录 http://blog.csdn.net/snannan_268/article/details/5511614.
	 * 
	 */
	public static void getFileProperty() {
		System.out.println("当前工作目录：" + System.getProperty("user.dir")); // user.dir指定了当前的路径
	}

	/**
	 * 查看系统根目录.
	 */
	public static void getFileRoot() {
		for (File file : File.listRoots()) {
			System.out.println("getFileRoot " + file);
		}
	}

	/**
	 * 在指定File下，查找带有name的文件.
	 * 
	 * @param f
	 * @param flag
	 */
	public static void getFileByName(File f, final String flag) {
		FilenameFilter ff = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith(flag);
			}
		};

		String[] str = f.list(ff);
		if (null != str && str.length > 0) {
			for (String s : str) {
				System.out.println("getFileByName " + s);
			}
		} else {
			System.out.println("getFileByName 根据" + flag + "在" + f.getPath() + "中无法查找到数据");
		}
	}

	/**
	 * 根据类型查看指定目录下的内容
	 * 
	 * @param f
	 * @param type
	 *            1文件；2目录.
	 */
	public static void getFileByType(File f, final Integer type) {
		FileFilter ff = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (type == 1) {
					return pathname.isFile();
				} else if (type == 2) {
					return pathname.isDirectory();
				} else {
					return false;
				}
			}
		};

		File[] file = f.listFiles(ff);
		for (File file1 : file) {
			System.out.println("getFileByType 查看" + f.getPath() + "下包含的" + (type == 1 ? "文件：" : "目录：") + file1);
		}
	}

	public static void main(String[] args) {
		try {
			File f = new File("d://a//b//c");
			writerFile();
			createDirs(f);
			delDirs(f);
			isDirNull(f);
			isHiddenFile(f);
			File f1 = new File("d://apache-maven-3.1.1");
			showFile(f1);
			getFileLastTime(f1);
			getFileParent(f1);
			getFileSize(f1);
			getFileProperty();
			getFileRoot();
			getFileByName(f1, "B");
			 getFileByType(f1,1);
			getFileByType(f1, 2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
