package com.kenpiyo.reizouko.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kenpiyo.reizouko.Service.FridgeService;
import com.kenpiyo.reizouko.entity.ResisterForm;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/reizouko")
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
    public String showResisterForm(@ModelAttribute ResisterForm form){
        return "syokuzaiResister";
    }

    // 食材登録したものを登録する処理
    @PostMapping("/contents")
    public String resister(@Validated ResisterForm form, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return showResisterForm(form);
        }
        fridgeService.resister(form.getSyokuzaiName(), form.getAmount(), form.getExpDate());
        return "redirect:/reizouko/contents";
    }
}
