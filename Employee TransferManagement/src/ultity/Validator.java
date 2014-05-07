/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ultity;

import java.text.DecimalFormat;

/**
 *
 * @author ToanLM
 */
public class Validator {
    public String ValidateString(String s){
        while (s.indexOf("  ") != -1) {
            s = s.replaceAll("  ", " ");
        }
        return s.trim();
    }
    
    public Float ValidateFloat(String s){
        while (s.indexOf(" ") != -1) {
            s = s.replaceAll(" ", "");
        }
        return Float.parseFloat(s);
    }
    
    
    public int ValidateInt(String i){
        while (i.indexOf(" ") != -1) {
            i = i.replaceAll(" ", "");
        }
        return Integer.parseInt(i);
    }
    
    public String Money(float number){
        DecimalFormat df = new DecimalFormat("###,###,###,###,###.##");
        return df.format(number);
    }
    
    public boolean Email(String email){
        String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(emailreg);
    }
    
    public boolean Phone(String phone){
        String phonereg = "^[0-9]+(\\d{6})$";
        return phone.matches(phonereg);
    }
    
    public boolean Password(char[] password){
        return password.length > 5;
    }
}
