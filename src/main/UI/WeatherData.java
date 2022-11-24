import main.DatabaseOperation.WeatherDataDb;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class WeatherData extends javax.swing.JFrame {

    main.Classes.WeatherData data = new main.Classes.WeatherData();
    WeatherDataDb db = new WeatherDataDb();
    ResultSet result = null;
    private JPanel panel1;

    public WeatherData() {
        
            initComponents();
            this.getContentPane().setBackground(new Color(241,241,242));
            setTitle("All Weather Data");
            populateWithWeatherData();
         
    }
    
    private void populateWithWeatherData()
    {
        result = db.getAllData();
        table_weather_data.setModel(DbUtils.resultSetToTableModel(result));
        
        
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_weather_data = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_temperature = new javax.swing.JTextField();
        tf_rainamount = new javax.swing.JTextField();
        tf_pressure = new javax.swing.JTextField();
        tf_windspeed = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_addData = new javax.swing.JButton();
        btn_editData = new javax.swing.JButton();
        btn_deleteData = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table_weather_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));

        table_weather_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_weather_dataMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(table_weather_data);

        jPanel3.setBackground(new java.awt.Color(230, 231, 232));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weather Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Californian FB", 0, 18), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel3.setText("Temperature");

        jLabel1.setText("Rain");

        jLabel2.setText("Pressure");

        jLabel4.setText("Wind Speed");

        tf_id.setEditable(false);

        jLabel5.setText("ID");

        btn_addData.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_addData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DefaultButton.png"))); // NOI18N
        btn_addData.setBorder(null);
        btn_addData.setBorderPainted(false);
        btn_addData.setFocusPainted(false);
        btn_addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addDataActionPerformed(evt);
            }
        });

        btn_editData.setForeground(new java.awt.Color(255, 255, 255));
        btn_editData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        btn_editData.setToolTipText("");
        btn_editData.setBorder(null);
        btn_editData.setBorderPainted(false);
        btn_editData.setEnabled(false);
        btn_editData.setFocusPainted(false);
        btn_editData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editDataActionPerformed(evt);
            }
        });

        btn_deleteData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        btn_deleteData.setEnabled(false);
        btn_deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_editData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_rainamount)
                                    .addComponent(tf_pressure)
                                    .addComponent(tf_windspeed, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(tf_temperature))))
                        .addComponent(btn_addData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_windspeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_rainamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_pressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tf_temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_addData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn_reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reset.png"))); // NOI18N
        btn_reset.setToolTipText("Reset everything");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btn_reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btn_addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        ObjectCreation();
        db.insertData(data);
        populateWithWeatherData();
        emptyField();
      
    }

    private void ObjectCreation()
    {
        data = new main.Classes.WeatherData();
        
        data.setWindSpeed(tf_windspeed.getText());
        data.setRainfallAmount(tf_rainamount.getText());
        data.setAirPressure(tf_pressure.getText());
        data.setTemperature(tf_temperature.getText());
        try{
            data.setData_id(Integer.parseInt(tf_id.getText()));
        }
        catch(Exception ex)
        {
            data.setData_id(0);
        }
        
    }
    
    private void table_weather_dataMouseClicked(java.awt.event.MouseEvent evt) {
       
        data = new main.Classes.WeatherData();
        int row = table_weather_data.getSelectedRow();
        displayToTextField(row);
        btn_editData.setEnabled(true);
        btn_deleteData.setEnabled(true);
        btn_addData.setEnabled(false);
        
    }

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {
       
        emptyField();
        
    }

 
    
    private void btn_editDataActionPerformed(java.awt.event.ActionEvent evt) {
        ObjectCreation();
        db.updateWeatherData(data);
        populateWithWeatherData();
        emptyField();
    }

    private void btn_deleteDataActionPerformed(java.awt.event.ActionEvent evt) {
        int row  = table_weather_data.getSelectedRow();
        int selectedUserId = (int) table_weather_data.getModel().getValueAt(row, 0);
        try {
            db.deleteData(selectedUserId);
            
        } catch (SQLException ex) {
            Logger.getLogger(WeatherData.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateWithWeatherData();
        emptyField();
        
    }

    private void tf_phoneKeyTyped(java.awt.event.KeyEvent evt) {
         char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ))
        {
            evt.consume();
        }
    }

    
    private void emptyField()
    {
         btn_addData.setEnabled(true);
        btn_editData.setEnabled(false);
        btn_deleteData.setEnabled(false);
        
        data = new main.Classes.WeatherData();
        
        tf_rainamount.setText("");
        tf_id.setText("");
        tf_windspeed.setText("");
        tf_pressure.setText("");
        tf_temperature.setText("");
        table_weather_data.clearSelection();
    }
    
    private void displayToTextField(int row)
{
    tf_id.setText(table_weather_data.getModel().getValueAt(row, 0)+"");
    tf_windspeed.setText((String) table_weather_data.getModel().getValueAt(row, 1));
    tf_rainamount.setText((String) table_weather_data.getModel().getValueAt(row, 2));
    tf_pressure.setText((String) table_weather_data.getModel().getValueAt(row, 3));
    tf_temperature.setText((String) table_weather_data.getModel().getValueAt(row, 4));
}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherData().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn_addData;
    private javax.swing.JButton btn_deleteData;
    private javax.swing.JButton btn_editData;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_weather_data;
    private javax.swing.JTextField tf_rainamount;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_windspeed;
    private javax.swing.JTextField tf_pressure;
    private javax.swing.JTextField tf_temperature;
}
