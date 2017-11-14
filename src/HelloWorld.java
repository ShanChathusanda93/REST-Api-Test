import net.sf.json.JSONObject;
import netscape.javascript.JSObject;

import javax.jws.soap.SOAPBinding;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Path("/hw")
    @Produces(MediaType.TEXT_PLAIN)
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World!!!!======";
    }

    @GET
    @Path("/gn")
    @Produces(MediaType.TEXT_PLAIN)
    public String getGoodNightMsg(){
        return "Good Night";
    }


    public List<User> getAllUsers(){
        List<User> userList=new ArrayList<>();
        User user1=new User(1,"Mahesh","Teacher");
        User user2=new User(2,"Shan","Intern");
        userList.add(user1);
        userList.add(user2);
        /*JSONObject jsonObject=new JSONObject();
        jsonObject.put("users",userList);*/
//        return jsonObject.toString();
        return userList;
//        return "This is get users";
    }

    @GET
    @Path("/getUsers")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserName(){
        HelloWorld helloWorld=new HelloWorld();
        return helloWorld.getAllUsers().get(1).getName();
    }
}