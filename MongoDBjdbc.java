import com.mongodb.client.*;
import org.bson.Document;

public class MongoDBjdbc {
    public static void main(String[] args)throws Exception {
        try (MongoClient mongoClient =MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("products");
            MongoCollection<Document> collection = database.getCollection("product");
            FindIterable<Document> documents = collection.find();
            documents.forEach(document -> {
                System.out.println(document);});
        }catch(Exception e){
            }
        }

    }