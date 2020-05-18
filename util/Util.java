package util;
import java.util.*;

public class Util{
  static HashMap<String,String> trans = null;
  static{
  trans = new HashMap();
  trans.put("Hello World!","Salut Monde!");  
  }
  public static String translateToFrench(String text){
    return trans.get(text);
  }
}
