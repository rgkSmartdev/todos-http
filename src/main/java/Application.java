import todo.TodoClient;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello Todos");
        TodoClient todoClient = new TodoClient();
        System.out.println(todoClient.findAll());
    }
}
