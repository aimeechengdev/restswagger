
package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
 
@RestController
@RequestMapping("/api")
public class NewController {
 
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 

    @RequestMapping(method = RequestMethod.GET, path="/new")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    
    
    @RequestMapping(method = RequestMethod.POST, path="/new")
    public Greeting postgreeting(@RequestBody Greeting userDTO) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, "postname"));
    }
}
