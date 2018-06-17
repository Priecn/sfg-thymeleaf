package learn.springframework.controller;

import learn.springframework.command.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @GetMapping("/checkout")
    public String getCheckoutForm(Model model){
        model.addAttribute("command", new CheckoutCommand());
        return "checkoutform";
    }

    @PostMapping("/docheckout")
    public String doCheckout(@Valid @ModelAttribute("command") CheckoutCommand command, BindingResult result){

        if(result.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
