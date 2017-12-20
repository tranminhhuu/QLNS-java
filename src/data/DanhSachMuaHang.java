/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class DanhSachMuaHang extends AbstractTableModel{

    private String[] header= {"Mã Sách", "Tên Sách", "Giá tiền", "Số lượng"};
    private List<DanhSachMuaHangList> data = new LinkedList<>();
    
    public DanhSachMuaHang(String[] header, List<DanhSachMuaHangList> data)
    {
        this.header = header;
        this.data = data;
    }
    @Override
    public int getRowCount() {
       if(data!=null)
       {
           return data.size();
       }
       return 0;
    }

    @Override
    public int getColumnCount() {
        if(header!=null)
        {
            return header.length;
        }
        return 0;
    }
 
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex < getColumnCount()){
            return header[columnIndex];
        }
        return "";
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if( rowIndex > getRowCount() | columnIndex > getColumnCount())
        {
            return "";
        }
        DanhSachMuaHangList row = data.get(rowIndex);
        switch(columnIndex){
            case 0:
            {
                return row.getMaSach();
            }
            case 1:
            {
                return row.getTenSach();
            }
            case 2:
            {
                return row.getThanhTien();
            }
            case 3:
            {
                return row.getSoLuong();
            }
            default:
            {
                return "";
            }
        }
    }
        
}
