/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sun of Vn
 */
public class TableModel extends AbstractTableModel{
     private  Vector colHeaders;        //-- Chứa thông tin là tên của các Field dùng làm ColumnHeader 
          private  Vector tbData;   
          public TableModel(ResultSet rsData) throws SQLException {
        ResultSetMetaData rsMeta = rsData.getMetaData();     //-- Đọc MetaData của ResultSet
        int count = rsMeta.getColumnCount();                         //-- Xác định số Field trong ResultSet

        tbData = new Vector();
        colHeaders = new Vector(count);
                  //--- Lặp tương ứng với số phần tử của columnHeaders để lấy tên của từng cột trong bảng        
        for (int i = 1; i <= count; i++) {
            colHeaders.addElement(rsMeta.getColumnName(i));
        }           //--- Lặp từ Record đầu tiên đến cuối ResultSet để lấy dữ liệu và Add vào Table        
        while (rsData.next()) {            
            //--- Khai báo 1 Object Vector có tên là rowData để chứa dữ liệu đọc từ Table            
            Vector dataRow = new Vector(count);                        
            //-- Lặp dựa theo số cột của bảng để lấy thông tin của từng đối tượng bỏ vào trong dataRow            
            for (int i = 1; i <= count; i++) {
                dataRow.addElement(rsData.getObject(i));
            }
            tbData.addElement(dataRow);
        }
    }

    @Override
    public int getRowCount() {
        return tbData.size();
    }

    @Override
    public int getColumnCount() {
         return colHeaders.size();
    }
    @Override
  public String getColumnName(int column) {
        return (String) (colHeaders.elementAt(column));
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vector rowData = (Vector) (tbData.elementAt(rowIndex));
        return rowData.elementAt(columnIndex);
    }
    public void removeRows(int[] rows){
        Arrays.sort(rows);
        for(int i=rows.length-1;i>=0;i--)
        tbData.remove(i);
    }
}
