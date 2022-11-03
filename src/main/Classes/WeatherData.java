package main.Classes;

public class WeatherData {


    private String Temperature;
    private int Data_id;
    private String WindSpeed;
    private String RainfallAmount;
    private String AirPressure;

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        this.Temperature = temperature;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setData_id(int data_id) { this.Data_id = data_id;}

    public int getData_id() {
        return Data_id;
    }

    public void setWindSpeed(String windSpeed) {
        this.WindSpeed = windSpeed;
    }

    public String getRainfallAmount() {
        return RainfallAmount;
    }

    public void setRainfallAmount(String rainfallAmount) {
        this.RainfallAmount = rainfallAmount;
    }

    public String getAirPressure() {
        return AirPressure;
    }

    public void setAirPressure(String airPressure) {
        this.AirPressure = airPressure;
    }
    
}
