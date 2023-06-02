package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.yaml.snakeyaml.introspector.Property;

public class prop1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream ("./data/common data.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);

	}

}
