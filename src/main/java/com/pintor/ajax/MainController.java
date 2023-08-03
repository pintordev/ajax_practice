package com.pintor.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private int count1 = 0;
    private int count2 = 0;

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(Model model) {

        count1++;
        count2++;
        model.addAttribute("count1", count1);
        model.addAttribute("count2", count2);

        return "index";
    }

    @GetMapping("/count1")
    @ResponseBody
    public RsData<Integer> getCount1(Model model) {
        count1++;
        return new RsData<>("S-1", "current count1", count1);
    }

    @GetMapping("/count2")
    @ResponseBody
    public RsData<Integer> getCount2(Model model) {
        return new RsData<>("S-1", "current count2", count2);
    }
}
