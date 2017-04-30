public interface Sensor extends SecuritySensor {
  boolean isTriggered();

  String getLocation();

  String getSensorType();

 double getBatteryPercentage();
}
