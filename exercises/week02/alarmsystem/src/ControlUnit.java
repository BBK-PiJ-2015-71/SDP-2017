import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
  List<Sensor> sensors ;

  public ControlUnit(){
    sensors = new ArrayList<Sensor>();
    sensors.add(new FireSensor("Lobby"));
    sensors.add(new SmokeSensor("Auditorium"));
  }


  public void pollSensors() {
    List<Sensor> sensors1 = sensors;
    for (Sensor sensor : sensors1) {
      if (sensor.isTriggered()) {
        System.out.println("A " + sensor.getSensorType() + " sensor was triggered at " + sensor.getLocation());
        System.out.println("Notifications sent: " + sensor.sendNotification());
      } else {
        System.out.println("Polled " + sensor.getSensorType() + " at " + sensor.getLocation() + " successfully");
      }
    }
  }
}
