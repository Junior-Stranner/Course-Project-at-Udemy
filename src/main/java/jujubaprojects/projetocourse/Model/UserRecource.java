package jujubaprojects.projetocourse.Model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserRecource {
    
    @GetMapping
    public ResponseEntity<User>findAll(){
        User u = new User(1L,"Junior","JuniorStranner@gmail.com","975424","jujuba123");
        return ResponseEntity.ok().body(u);

    }
}
