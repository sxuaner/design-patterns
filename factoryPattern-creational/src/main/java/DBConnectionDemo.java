import java.util.NoSuchElementException;
import java.util.Scanner;

/* Q: Java classpath.
	what's this
	The classpath tells Java where to look in the filesystem for files defining these classes.

	The virtual machine searches for and loads classes in this order:

	bootstrap classes: the classes that are fundamental to the Java Platform (comprising the public classes of the Java Class Library, and the private classes that are necessary for this library to be functional).

	extension classes: packages that are in the extension directory of the JRE or JDK, jre/lib/ext/

	user-defined packages and libraries


*/

public class DBConnectionDemo {
	public static void main(String[] args) {
		//DB name can also nominated at runtime.
		Scanner sc = new Scanner(System.in);
		try{
			// Program cannot get input from console.
			// Failed to evaluate. Reason: Cannot evaluate because the thread is resumed.
			System.out.println("Please enter DB name:");
			String db = sc.nextLine();
			System.out.println("DB name stored in program:");
			DBFactory dbf = new DBFactory(db);
			dbf.connectToDB();
			dbf.CloseDB();
		}catch(NoSuchElementException e){
			e.getStackTrace();
		}
		finally{

			sc.close();
		}
	}
}
