package testGame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ResourceManager {
	
	public ResourceManager() {
	}
	
	public FileInputStream getResource(String name) {
		String path = Thread.currentThread().getContextClassLoader().getResource(name).getPath();
		String os = System.getProperty("os.name");
		if (os.contains("Windows") || os.contains("windows")) {
			path = path.replaceAll("/", "\\\\");
			path = path.substring(1, path.length());
		}
		FileInputStream fp = null;
		try {
			fp = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
		return fp;
	}

}
