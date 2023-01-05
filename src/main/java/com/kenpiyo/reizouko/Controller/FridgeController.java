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

    // 冷蔵庫に登録されている食材一覧を表示
    @GetMapping("/contents")
    public String fridgeContents(Model model){
        model.addAttribute("contentsList", fridgeService.findContentsAll());
        return "contentsList";
    }

    // 冷蔵庫に食材を登録する画面を表示
    @GetMapping("/resister")
    public String showResisterForm(){
        return "syokuzaiResister";
    }
}
