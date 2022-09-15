package Assignment4;

public class GarCollection{
String str;

public GarCollection(String str) {
	this.str = str;
}

@Override
protected void finalize() throws Throwable {
	super.finalize();
	System.out.println(this.str + " collected");
}

public static void main(String[] args) {

	String str = "Vedanti Basically  Amravati!";
	String newSub = "From";
	int index = 17;
	System.out.println("Initial String = " + str);
	System.out.println("Index where new string will be inserted = " + index);
	StringBuffer resString = new StringBuffer(str);
	resString.insert(index + 1, newSub);
	System.out.println("Resultant String = " + resString.toString());
	
	GarCollection gc = new GarCollection("Amravati");
	System.out.println("String=" + gc.str.toString());
	gc = null;
	System.gc();
}}
