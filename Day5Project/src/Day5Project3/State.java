package Day5Project3;
// child of country
public class State  extends Country{
 private String stateName;
 private String lang;
 
 
 //getter-setter
 public String getStateName() {
	return stateName;
}



 public void setStateName(String stateName) {
	this.stateName = stateName;
 }



 public String getLang() {
	return lang;
 }



 public void setLang(String lang) {
	this.lang = lang;
 }



 //to-String
 @Override
 public String toString() {
	return "State [stateName=" + stateName + ", lang=" + lang + ", getCountryName()=" + getCountryName()
			+ ", getCapital()=" + getCapital() + "]";
 }
 
 
 
}
