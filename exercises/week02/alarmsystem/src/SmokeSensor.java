public class SmokeSensor implements Sensor {

  private int call_sequence;
  private double battery_percentage;
  private String location;
  private Announcement announce;
  private boolean triggered;

  public SmokeSensor(String location1){
    this.location = location1;
    announce = new HazardAnnouncement();
    triggered=false;
    call_sequence=0;
    battery_percentage=1.00;
  }
  @Override
  public boolean isTriggered() {
    call_sequence=call_sequence+1;
    if (call_sequence%10==0 && battery_percentage>0){
      battery_percentage = battery_percentage-0.2;
      triggered=true;
      return triggered;
    } else {
      triggered=false;
      return triggered;
    }
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

  @Override
  public String sendNotification(){
    return announce.notification();
  }
}
