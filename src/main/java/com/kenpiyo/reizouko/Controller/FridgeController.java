package com.kenpiyo.reizouko.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kenpiyo.reizouko.Service.FridgeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FridgeController {
    
    private final FridgeService fridgeService;

    @GetMapping("/contents")
    public String fridgeContents(Model model){
        model.addAttribute("contentsList", fridgeService.findContentsAll());
        return "contentsList";
    }
}
