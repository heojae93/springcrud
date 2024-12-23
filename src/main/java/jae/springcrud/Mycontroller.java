//package jae.springcrud;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
//
//@RestController
//public class Mycontroller {
//
//    @GetMapping("/time")
//    LocalDateTime getTime() {
//        return LocalDateTime.now();
//    }
//
//    @GetMapping("/lotto-number")
//    int getLottoNumber() {
//        Random random = new Random();
//        return random.nextInt(45) + 1;
//    }
//
//    @GetMapping("/lotto-numbers")
//    public Set<Integer> getLottoNumbers() {
//        Random random = new Random();
//        Set<Integer> lottoNumbers = new HashSet<>();
//
//        while (lottoNumbers.size() < 6) {
//            lottoNumbers.add(random.nextInt(45) + 1);
//        }
//
//        return lottoNumbers;
//
//    }
//
//    @GetMapping("/square")
//    public int calculateSquare(@RequestParam int numberToSquare) {
//        return numberToSquare * numberToSquare;
//    }
//
//    @GetMapping("/fahrenheit")
//    public double convertToFahrenheit(@RequestParam double celsiusDegree) {
//        // 섭씨를 화씨로 변환
//        return (celsiusDegree * 9 / 5) + 32;
//
//    }
//
//    @GetMapping("/fahrenheit/{celsiusDegree}")
//    public double convertTooFahrenheit(@PathVariable double celsiusDegree) {
//
//        return (celsiusDegree * 9 / 5) + 32;
//    }
//
//    @GetMapping("/square/{numberToSquare}")
//    public int square(@PathVariable int numberToSquare) {
//
//        return numberToSquare * numberToSquare;
//    }
//
//    @PostMapping("/square")
//    public int squareNumber(@RequestBody NumberRequest request) {
//        int numberToSquare = request.getNumberToSquare();
//        return numberToSquare * numberToSquare; // 제곱 계산
//    }
//
//    // 요청에 필요한 body를 담기 위한 클래스
//    public static class NumberRequest {
//        private final int numberToSquare;  // 제곱할 숫자
//
//
//        public NumberRequest(@JsonProperty("numberToSquare") int numberToSquare) {
//            this.numberToSquare = numberToSquare;
//        }
//
//
//        public int getNumberToSquare() {
//            return numberToSquare;
//        }
//    }
//
//    @PostMapping("/movies")
//    void createMovie(@Valid @RequestBody CreateMovieRequest request){
//
//        System.out.println("-------------");
//        System.out.println("createMovie 호춤 됨");
//        System.out.println("-------------");
//
//
//    }
//
//
//
//
//
//}
//
//
//
//
