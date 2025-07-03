package Day5Project3;

public class Country {
 private String countryName;
 private String capital;
 
 
 //getter-setter
 public String getCountryName() {
	return countryName;
 }
 public void setCountryName(String countryName) {
	this.countryName = countryName;
 }
 public String getCapital() {
	return capital;
 }
 public void setCapital(String capital) {
	this.capital = capital;
 }
 
 
 //to-String
 @Override
 public String toString() {
	return "Country [countryName=" + countryName + ", capital=" + capital + "]";
 }
 
 
 
}
