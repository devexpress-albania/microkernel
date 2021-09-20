package pluginone.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("plugin-1")
public class PluginOneController {

    @GetMapping("info")
    public ResponseEntity<?> pluginVersion(){
        return ResponseEntity.ok("Plugin 1 : V.0.0.1");
    }
}
