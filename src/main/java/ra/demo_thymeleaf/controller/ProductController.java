package ra.demo_thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.demo_thymeleaf.dao.ProductDAO;
import ra.demo_thymeleaf.entity.Product;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(value = {"/","/home"})
    public String home(Model model){
        List<Product> list = productDAO.getProducts();
        model.addAttribute("list",list);
        return "home";
    }
}
