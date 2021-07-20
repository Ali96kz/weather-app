import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("visibility")
    private int visibility;

    @JsonCreator
    public WeatherData(@JsonProperty("wind") Wind wind,
                       @JsonProperty("coord") Coord coord,
                       @JsonProperty("visibility") int visibility) {
        this.coord = coord;
        this.wind = wind;
        this.visibility = visibility;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
}
