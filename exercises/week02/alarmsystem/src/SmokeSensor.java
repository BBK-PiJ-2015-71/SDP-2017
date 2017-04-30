public class SmokeSensor implements Sensor {

  private int call_sequence=0;
  private int battery_percentage=100;
  private String location;

  public SmokeSensor(String location1){
    this.location = location1;
  }
  @Override
  public boolean isTriggered() {
    call_sequence=call_sequence+1;
    if (call_sequence%10==0 && battery_percentage>0){
      battery_percentage = battery_percentage-20;
      return true;
    } else return false;
  }

  @Override
  public String getLocation() {
    return this.location;
  }

  @Override
  public String getSensorType() {
    return "Smoke sensor";
  }

  @Override
  public double getBatteryPercentage() {
    return battery_percentage;
  }
}
