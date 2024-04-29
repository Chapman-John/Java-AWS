// package com.ChapmanJohn;
// package com;
// package com.ChapmanJohn.webapp.WebappApplication;

package com.ChapmanJohn.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greet() {
        return "Hello, World!";
    }

}
