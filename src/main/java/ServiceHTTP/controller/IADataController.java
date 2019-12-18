package ServiceHTTP.controller;

import ServiceHTTP.Service.HttpService;
import ServiceHTTP.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saveiadata")
public class IADataController {

    @Autowired
    PostService postService;

    @PostMapping(value = "/{id}/{data}")
    public void SaveIAData(@PathVariable("id") int idLocation, @PathVariable("data") String data){
        postService.addNewIaData(idLocation,data);
    }
}
