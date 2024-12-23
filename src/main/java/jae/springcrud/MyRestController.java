//package jae.springcrud;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class MyRestController {
//
//    @PostMapping("/products")
//    String create() {
//        return " 상품생성입니다. ";
//    }
//
//    @GetMapping("/products")
//    String read() {
//        return " 상품조회입니다. ";
//    }
//
//    @PutMapping("/products/{productId}")
//    String update(@PathVariable(name = "productId") Long id) {
//
//        return " 상품 수정 ID: " + id;
//    }
//
//    @DeleteMapping("/products/125")
//    String delete() {
//        return " 상품삭제입니다. ";
//    }
//
//}
//
//
