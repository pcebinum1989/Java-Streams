public class Volcano {
    public int Year;
    public String TSU;
    public String EQ;
    public String Name;
    public String Location;
    public double Latitude;
    public double Longitude;
    public int Elevation;
    public String Type;
    public int VEI;
    public String Agent;
    public int DEATHS;

    public Volcano(){}

    public Volcano(int year, String TSU, String EQ, String name, String location, double latitude, double longitude, int elevation, String type, int VEI, String agent, int DEATHS) {
        Year = year;
        this.TSU = TSU;
        this.EQ = EQ;
        Name = name;
        Location = location;
        Latitude = latitude;
        Longitude = longitude;
        Elevation = elevation;
        Type = type;
        this.VEI = VEI;
        Agent = agent;
        this.DEATHS = DEATHS;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getTSU() {
        return TSU;
    }

    public void setTSU(String TSU) {
        this.TSU = TSU;
    }

    public String getEQ() {
        return EQ;
    }

    public void setEQ(String EQ) {
        this.EQ = EQ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public int getElevation() {
        return Elevation;
    }

    public void setElevation(int elevation) {
        Elevation = elevation;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getVEI() {
        return VEI;
    }

    public void setVEI(int VEI) {
        this.VEI = VEI;
    }

    public String getAgent() {
        return Agent;
    }

    public void setAgent(String agent) {
        Agent = agent;
    }

    public int getDEATHS() {
        return DEATHS;
    }

    public void setDEATHS(int DEATHS) {
        this.DEATHS = DEATHS;
    }
}
