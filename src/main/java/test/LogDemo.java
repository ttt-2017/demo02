package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fansy on 2017/11/21.
 */
public class LogDemo {
    private static final Logger log = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        String first = "a";
        Integer second = 2;
        Double third = 3.0;
        log.info("Hello world:{} , {} , {}", new Object[]{first ,second,third} );
        // info , warn ,error , debug
        log.warn("abc");

    }
}
