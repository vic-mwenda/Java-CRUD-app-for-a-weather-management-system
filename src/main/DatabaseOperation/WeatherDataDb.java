
package main.DatabaseOperation;

import main.Classes.WeatherData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class WeatherDataDb {
    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;
    
    public WeatherDataDb()
    {
        conn = DataBaseConnection.connectTODB();
    }
      public void insertData(WeatherData data)  {
        try {
            String insertQuery = "insert into weatherdata"
                    + "('" + "temperature" + "'," + "'" + "rain_amount" + "','" + "air_pressure" + "','" + "wind_speed" + "')"
                    + " values('"
                    + data.getTemperature()
                    + "','" + data.getRainfallAmount() + "'"
                    + ",'" + data.getAirPressure() + "'"
                    + ",'" + data.getWindSpeed() + "'"
                    + ")";

            statement = conn.prepareStatement(insertQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "successfully inserted new Weather Data");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery Failed");
        }
        finally
        {
            flushStatementOnly();
        }
        
        
    }
    
    public void updateWeatherData(WeatherData data) {
        try {
            String updateQuery = "update weatherdata set temperature = '"
                    + data.getTemperature() + "',"
                    + "wind_speed = '" + data.getWindSpeed() + "',"
                    + "air_pressure = '" + data.getAirPressure() + "',"
                    + " where data_id= "
                    + data.getData_id();

            statement = conn.prepareStatement(updateQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "successfully updated new Weather data");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed");
        }
        
        finally
        {
            flushStatementOnly();
        }

    }

    public void deleteData(int data_id) throws SQLException {
        try {
            String deleteQuery = "delete from weatherdata where data_id=" + data_id;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Deleted Weather data");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query Failed");
        }
        finally
        {
            flushStatementOnly();
        }

    }

    public ResultSet getAllData() {
        try {
            String query = "select * from weatherdata";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all data from DB Operation");
        }
        

        return result;
    }
     private void flushStatementOnly()
    {
        {
                        try
                        {
                            statement.close();
                            //conn.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
     public void flushAll()
    {
        {
                        try
                        {
                            statement.close();
                            result.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }

    
    
}
