package fiipractic.yonder;

import fiipractic.yonder.service.TestService;
import fiipractic.yonder.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;//= new TestServiceImpl();

    @GetMapping
    //@RequestMapping(value="/test/{id}")
    @RequestMapping(value="/test")
    public String getTestMessage(){
        return testService.getTestMessage();
    }

    @GetMapping

    public String getName(){
        return testService.getAll();
    }

    @PostMapping
    public void save(@RequestBody String name){
        testService.save(name);
    }

    @PutMapping(value = "/{id}")
    @RequestMapping(value = "/delete/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue){
        testService.update(id, newValue);
    }

    @DeleteMapping
    @RequestMapping(value = "/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}
