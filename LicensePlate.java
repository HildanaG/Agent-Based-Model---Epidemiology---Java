package exam;

public class LicensePlate {
	private String licenseText;
	private String licenseState;
  public LicensePlate(String text, String state) {
	  this.licenseText=text;
	  this.licenseState=state;
  }
  public void setText(String a) {
	  licenseText=a;
  }
  public String getText()  {
	  return licenseText;
  }
  public void setState(String b) {
	  licenseState=b;
  }
  public String getState() {
	  return licenseState;
  }
  public boolean equals(LicensePlate other) {
	  boolean doesEqual;
	  if ((this.licenseText.equals(other.licenseText)) && (this.licenseState.equals(other.licenseState))) {
		  doesEqual=true;
	  } else {
		  doesEqual=false;
	  }
	  return doesEqual;
  }
  public String toString() {
	  return "LicensePlate: " + this.licenseText+this.licenseState;
  }
  public static boolean sameStates(LicensePlate x, LicensePlate y, LicensePlate z) {
	  if ((x.getState().equals(y.getState())) && (y.getState().equals(z.getState()) && (x.getState().equals(z.getState())))) {
		  return true;
	  } else {
		  return false;
	  }
  }
}
