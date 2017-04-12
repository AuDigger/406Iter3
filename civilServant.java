/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PouriaHemmati
 */
public class civilServant extends Guest {
private static String username;
String type;
boolean isCivilServant=true;
    /**
     * Creates new form civilServant
     */
    public civilServant() {
        //They are a guest until they login, then this is changed to Civil Servant
        type="CivilServant";
    }
public boolean getIsCivilServant(){
    return isCivilServant;
}        
public static void setName(String name){
    username = name;
}
public static String getName(){
    return username;
}
  public String getType(){
    return type;
}
                   
}
