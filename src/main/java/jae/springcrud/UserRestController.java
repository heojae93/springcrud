//package jae.springcrud;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class UserRestController {
//
//    Map<Long, User> db = new HashMap<Long, User>();
//
//    public UserRestController() {
//        db.put(10l, new User("a", "별명1", "김", ""));
//        db.put(11l, new User("b", "별명2", "이", ""));
//        db.put(12l, new User("c", "별명3", "박", ""));
//        db.put(13l, new User("d", "별명4", "최", ""));
//        db.put(14l, new User("cherry1", "카드값줘체리", "체리", ""));
//
//        this.db = db;
//    }
//
//    @GetMapping("/profile/{userId}")
//    UserResponse getProfile(@PathVariable(name = "userId") Long userId) {
//        User user = db.get(userId);
//
//        return new UserResponse(user.getLoginId(), user.getNickname(), user.getName());
//
//    }
//
//}
//
//
//
