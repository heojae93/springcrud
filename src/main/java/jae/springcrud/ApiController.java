//package jae.springcrud;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.ui.Model;
//
//@RestController
//public class ApiController {
//
//    @Value("${api.key}")
//    private String apiKey;
//
//    private final String apiUrl = "https://realsite.shop/api/v2";
//
//    private final RestTemplate restTemplate;
//
//    public ApiController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    @GetMapping("/services")
//    public String getServices(Model model) {
//        String url = apiUrl + "?key=" + apiKey + "&action=services";
//        String response = restTemplate.getForObject(url, String.class);
//
//        // 파싱 후 모델에 데이터 전달
//        model.addAttribute("services", response);
//        return "services";  // services.html을 렌더링
//    }
//
//    @GetMapping("/balance")
//    public String getBalance(Model model) {
//        String url = apiUrl + "?key=" + apiKey + "&action=balance";
//        String response = restTemplate.getForObject(url, String.class);
//
//        // 파싱 후 모델에 데이터 전달
//        model.addAttribute("balance", response);
//        return "balance";  // balance.html을 렌더링
//    }
//}
