package testGame;


public class ResourceManager {
	
	public ResourceManager() {
	}
	
	public String getResource(String name) {
		System.out.println("**");
		String path = Thread.currentThread().getContextClassLoader().getResource(name).getPath();
		String os = System.getProperty("os.name");
		if (os.contains("Windows") || os.contains("windows")) {
			path = path.replaceAll("/", "\\\\");
		}
		System.out.println(path);
		return path;
	}

}
