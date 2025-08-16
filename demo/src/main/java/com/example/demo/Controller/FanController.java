
package com.example.demo.Controller;
import com.example.demo.services.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
    private FanService fanService;
    @Autowired
    public FanController(FanService fanService) {
        this.fanService = fanService;
    }
    @GetMapping("/fan/On/{fanNumber}")
    public ResponseEntity<String> On(@PathVariable Integer fanNumber) {
        fanService.On(fanNumber);
        System.out.println("Fan is On");
        String message="Fan is on...!";
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
    @GetMapping("/fan/Off/{fanNumber}")
    public void Off(@PathVariable Integer fanNumber) {
        fanService.Off(fanNumber);
        System.out.println("Fan is off");
    }
    @GetMapping("/fan/increase/{fanNumber}")
    public void increase(@PathVariable Integer fanNumber) {
        fanService.increase(fanNumber);
        System.out.println("Speed increased");
    }
    @GetMapping("/fan/decrease/{fanNumber}")
    public void decrease(@PathVariable Integer fanNumber) {
        fanService.decrease(fanNumber);
        System.out.println("Speed decreased:"+fanNumber);
    }

//    @GetMapping("/fan/On/{fanNumber}")
//    public void report() {
//        fanService.report();
//    }
}
