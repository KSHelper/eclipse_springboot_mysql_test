package mysqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
 
    @Autowired
    private ProductService service;
     
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        Iterable<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
         
        return "index";
    }
}