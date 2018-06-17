package learn.springframework.controller;

import learn.springframework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products", productService.listProducts());
        return "index";
    }
}
