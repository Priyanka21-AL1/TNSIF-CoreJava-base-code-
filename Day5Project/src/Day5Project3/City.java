package Day5Project3;

public class City  extends State{
          private String cityNmae;
          private float area;
          
          //getter-setter
		  public String getCityNmae() {
			  return cityNmae;
		  }
		  public void setCityNmae(String cityNmae) {
			  this.cityNmae = cityNmae;
		  }
		  public float getArea() {
			  return area;
		  }
		  public void setArea(float area) {
			  this.area = area;
		  }
		  
		  //to-String
		  @Override
		  public String toString() {
			return "City [cityNmae=" + cityNmae + ", area=" + area + ", getStateName()=" + getStateName()
					+ ", getLang()=" + getLang() + ", getCountryName()=" + getCountryName() + ", getCapital()="
					+ getCapital() + "]";
		  }
		  
		  
          
          
}
