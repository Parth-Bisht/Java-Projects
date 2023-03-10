public class Car {

    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Car(){ //constructor name same as class
        doors = "opened";
        engine = "off";
        driver = "absent";
        speed = 0;
    }

    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setSpeed(int speed){ //setter method
        this.speed = speed;
    }
    public int getSpeed(){ //getter method
        return speed;
    }

    public String getDoors() { //getter method
        return doors;
    }

    public void setDoors(String doors) { //setter method
        this.doors = doors;
    }

    public String getEngine() { //getter method
        return engine;
    }

    public void setEngine(String engine) { //setter method
        this.engine = engine;
    }

    public String getDriver() { //getter method
        return driver;
    }

    public void setDriver(String driver) { //setter method
        this.driver = driver;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "running";
        }else{
            return "not running";
        }
    }

}
