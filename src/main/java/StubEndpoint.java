import static spark.Spark.*;
import spark.*;

public class StubEndpoint {

    public static void main(String[] args) {

        get(new Route("/message") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });

    }

}