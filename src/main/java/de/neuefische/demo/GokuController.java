package de.neuefische.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blast")
public class GokuController {
    
@GetMapping("/{name}")
public String blast(@PathVariable String name) {

return name + "," + "TOGETHER!!" + " KAAAAMEEEE " + "HAAAMEEEE" + "HAAAAAAA!!!!"; 

}

}


