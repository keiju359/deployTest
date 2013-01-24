import java.util.Arrays;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.ServerAddress;


public class DeployTest {
	public static void main() {
		try {
			Mongo mongoClient = new Mongo(Arrays.asList(new ServerAddress("10.1.71.1", 27017),
		            new ServerAddress("10.1.71.2", 27017),
		            new ServerAddress("10.1.71.3", 27017)));

			DB db = mongoClient.getDB( "sessions" );

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
