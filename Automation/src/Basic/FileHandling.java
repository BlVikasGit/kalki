package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) throws IOException {

		//String path="C:\\Users\\QSP\\Desktop\\FileHandling\\A.txt";
	FileInputStream fis = new FileInputStream("C:\\Users\\QSP\\Desktop\\FileHandling\\B.txt");
	byte[] b = new byte[fis.available()];
	
    for (int i = 0; i < b.length; i++) {
		System.out.print((char)(fis.read()));
	}
	//System.out.println(fis.read());
	fis.close();
	
}
}
