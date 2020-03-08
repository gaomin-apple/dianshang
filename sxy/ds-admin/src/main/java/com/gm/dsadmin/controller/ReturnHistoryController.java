package com.gm.dsadmin.controller;

import com.gm.dsadmin.dto.in.ReturnHistoryCreateInDTO;
import com.gm.dsadmin.dto.out.ReturnHistoryListOutDTO;
import com.gm.dsadmin.po.ReturnHistory;
import com.gm.dsadmin.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {

    @Autowired
   private ReturnHistoryService returnHistoryService;

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
    List<ReturnHistory> returnHistories = returnHistoryService.getListByReturnId(returnId);
    List<ReturnHistoryListOutDTO> returnHistoryListOutDTOS = returnHistories.stream().map(returnHistory -> {
        ReturnHistoryListOutDTO returnHistoryListOutDTO = new ReturnHistoryListOutDTO();
        returnHistoryListOutDTO.setReturnHistoryId(returnHistory.getReturnHistoryId());
        returnHistoryListOutDTO.setTimestamp(returnHistory.getTime().getTime());
        returnHistoryListOutDTO.setReturnStatus(returnHistory.getReturnStatus());
        returnHistoryListOutDTO.setComment(returnHistory.getComment());
        returnHistoryListOutDTO.setCustomerNotified(returnHistory.getCustomerNotified());
        return returnHistoryListOutDTO;
    }).collect(Collectors.toList());

        return null;
    }

    @PostMapping("/create")
    public Long create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        ReturnHistory returnHistory = new ReturnHistory();
        returnHistory.setReturnId(returnHistoryCreateInDTO.getReturnId());
        returnHistory.setTime(new Date());
        returnHistory.setReturnStatus(returnHistoryCreateInDTO.getReturnStatus());
        returnHistory.setComment(returnHistoryCreateInDTO.getComment());
        Boolean customerNotifeid = returnHistoryCreateInDTO.getCustomerNotifeid();
        returnHistory.setCustomerNotified(customerNotifeid);
        Long returnHistoryId = returnHistoryService.create(returnHistory);

        if(customerNotifeid != null && customerNotifeid){

        }
        return returnHistoryId;
    }

}
