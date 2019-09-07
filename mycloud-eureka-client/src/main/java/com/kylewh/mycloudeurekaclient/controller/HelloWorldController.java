package com.kylewh.mycloudeurekaclient.controller;

import com.kylewh.mycloudapi.entity.Worker;
import com.kylewh.mycloudeurekaclient.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylewhao
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/hi")
    public String hi(){
        return "Hello World";
    }


    @GetMapping("/queryById")
    public Worker queryById(Integer id){
        return workerService.getById(id);
    }

}
