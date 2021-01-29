package com.java2novice.files;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
 
public class ClassLoaderFileLoading {
 
    private static Properties appProp = null;
    
    // dies ist ein Kommentar des Teachers
	
    static {
        try{
            InputStream is =
                ClassLoaderFileLoading.class.getResourceAsStream("/FileName.properties");
            appProp = new Properties();
            appProp.load(is);
        } catch(IOException ex){ //Raoul Zalotay
            ex.printStackTrace();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}