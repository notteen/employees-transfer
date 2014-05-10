/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.DataAccess;
import entity.Request;

/**
 *
 * @author Sun of Vn
 */
public class RequestBO {
    
      public boolean addRequest(Request e){
        DataAccess da=new DataAccess();
        boolean stt=da.insertRequest(e);
        return stt;
    }
}
