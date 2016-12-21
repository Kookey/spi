import com.lemo.HelloInterface;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
      ServiceLoader<HelloInterface> load = ServiceLoader.load(HelloInterface.class);
      for (HelloInterface i :load) {
        i.sayHello();
      }
    }
}
