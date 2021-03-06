package se.lexicon.shipping_cost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.shipping_cost.entity.Box;
import se.lexicon.shipping_cost.repository.BoxRepository;

import javax.validation.Valid;

@Controller
public class ShippingController {
    BoxRepository boxRepository;

    @Autowired
    public void setBoxRepository(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

    @GetMapping("/AddBoxForm")
    public String addBoxForm(Model model) {
        Box box = new Box();
        model.addAttribute("box", box);
        return "AddBoxForm";
    }

    @PostMapping("/register")
    public String regButton(@Valid @ModelAttribute("box") Box box, BindingResult bindingResult) {
        System.out.println(box.toString());
        if (bindingResult.hasErrors())
            return "AddBoxForm";
        return "redirect:/";
    }
}
