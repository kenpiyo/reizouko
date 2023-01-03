package com.kenpiyo.reizouko.Service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenpiyo.reizouko.Repository.SyokuzaiRepository;
import com.kenpiyo.reizouko.entity.Syokuzai;

//import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FridgeService {
    private final SyokuzaiRepository syokuzaiRepository;

    public List<Syokuzai> findContentsAll(){
        return syokuzaiRepository.findContentsAll();
    }

}