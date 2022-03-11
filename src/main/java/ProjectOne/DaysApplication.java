package ProjectOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaysApplication {

    public static void main(String[] args){
        //Taking this from Ted's code. Seems all this does is have the program call itself, strangely enough.
        //But I guess that makes the program active so that Postman can access it.
        SpringApplication.run(DaysApplication.class);
    }
}

// 3/5 progress report. I have gotten things codded together in such as way that it doesn't immedietly
// return any errors, and am begining to understand how it works. However, when I attempt to run and start it,
// I recieved an error for it being unable to create the beans it needs to. If I had to guess, it's because of
// two names not matching when they need to.

// Reading through the exhausting error log, one of the issues appears to be from a variable having "name" in lower-case
// when it should have "Name" with first letter capitalized.
