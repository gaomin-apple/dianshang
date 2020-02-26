package com.gm.dsadmin.controller;

import com.gm.dsadmin.dto.in.ReturnSearchInDTO;
import com.gm.dsadmin.dto.in.ReturnUpdateActionInDTO;
import com.gm.dsadmin.dto.out.PageOutDTO;
import com.gm.dsadmin.dto.out.ReturnListOutDTO;
import com.gm.dsadmin.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")                     
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
