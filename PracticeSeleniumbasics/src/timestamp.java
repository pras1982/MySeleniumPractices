import java.text.SimpleDateFormat;
import java.util.Date;

public class timestamp {

	public static void main(String[] args) {
		String TimeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		System.out.println(TimeStamp);
		String repName = "Test-Report-"+ TimeStamp+".html";
		String location = System.getProperty("user.dir");
		System.out.println(repName);
		System.out.println(location);

	}

}
