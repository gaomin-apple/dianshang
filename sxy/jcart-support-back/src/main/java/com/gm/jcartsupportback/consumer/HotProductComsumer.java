package com.gm.jcartsupportback.consumer;

import com.alibaba.fastjson.JSON;
import com.gm.jcartsupportback.mq.HotProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


public class HotProductComsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "hostproduct",groupId = "hot-product-group01")
    public void handleHotProduct(String hotProductJsonStr){
        logger.info("handle productId: {}",hotProductJsonStr);
        HotProductDTO hotProductDTO = JSON.parseObject(hotProductJsonStr, HotProductDTO.class);
        //ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);
//        if (productOperation == null){
//            productOperation = new ProductOperation();
//            productOperation.setProductId(productId);
//            productOperation.setAllCount(1);
//            productOperation.setDayCount(1);
//            productOperation.setRecentTime(new Date());
//            productOperationMapper.insertSelective(productOperation);
//        }else {
//            productOperation.setAllCount(productOperation.getAllCount()+1);
//            productOperation.setDayCount(productOperation.getDayCount()+1);
//            productOperation.setRecentTime(new Date());
//            productOperationMapper.updateByPrimaryKeySelective(productOperation);
//        }
    }

}
