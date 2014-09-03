package pict.dbconnect;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;

/**
 * @author vedangjoshi
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        /**
         * Create client
         */
        MongoClient db = new MongoClient(new ServerAddress("localhost", 27017));

        /**
         * Create DB type object to retrieve Database
         */
        DB database = db.getDB("m101");
        

        /**
         * Create a collection type object and accept the retrieved collection
         * into it
         */
        DBCollection collection = database.getCollection("patients");                
        DBObject doc = collection.findOne();
        
        BasicDBObject doc1 = new BasicDBObject();
        doc1.put("details.name","ibfnblifdhbl");
        
        
        
        /**
         * Find the number of Documents in the collection 
         */
        long Num_of_docs = collection.count();

        System.out.println(doc);
        System.out.println(Num_of_docs);
//        System.out.println(doc1);
    }
}
