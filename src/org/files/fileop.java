package org.files;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class fileop {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Greens tech\\sample.txt");
		FileUtils.write(f,"List of interface");
		FileUtils.write(f, " ****Set is also interface ",true);
		
		
		
		/*boolean d = f.createNewFile();
		System.out.println(d);
		String[] l= f.list();
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
			
		File[] l1 = f.listFiles();
			for(int j=0;j<l1.length;j++) {
				System.out.println(l1[i]);
			}}		
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		File f1=new File("E:\\Greens tech\\core java\\tt");
		boolean mkdirs = f1.mkdirs();
		System.out.println(mkdirs);*/
		}}
