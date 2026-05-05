package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class BillDetails extends JFrame{

    BillDetails(String meter) {
        
        setSize(700, 650);
        setLocation(400, 150);
        
        getContentPane().setBackground(Color.WHITE);
        
        JTable table = new JTable();
        
        try {
            Conn c = new Conn();
            String query = "select * from bill where meter_no = '"+meter+"'";
            ResultSet rs = c.s.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            Vector<String> columnNames = new Vector<>();
            for(int i=1; i<=columnCount; i++){
                columnNames.add(metaData.getColumnName(i));
            }
            Vector<Vector<Object>> data = new Vector<>();
            while(rs.next()){
                Vector<Object> row = new Vector<>();
                for(int i=1; i<=columnCount; i++){
                    row.add(rs.getObject(i));
                }
                data.add(row);
            }
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0, 0, 700, 650);
        add(sp);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new BillDetails("");
    }
}
