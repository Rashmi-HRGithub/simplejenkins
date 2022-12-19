package practiceprograms;

import java.io.FileInputStream;

import org.apache.poi.hpsf.Property;

public class propertyfile {

	public static void main(String[] args) 
	
	{
	    FileInputStream fis=new FileInputStream("");
	    Property pObj=new Property();
	    pObj.load(fis);
        String BROWSER=pObj.getProperty("browser");
        String URL=pObj.getProperty("url");
        String USERNAME=pObj.getPropety("password");
        
        WebDriver driver=new ChromeDriver();
        
        
        
	}

}
