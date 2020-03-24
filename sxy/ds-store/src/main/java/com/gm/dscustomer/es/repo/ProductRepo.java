package com.gm.dscustomer.es.repo;

import com.gm.dscustomer.es.doc.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepo extends ElasticsearchRepository<ProductDoc,Integer> {
    List<ProductDoc> findByProductNameLikeOrproductAbstracLike(String productName,String productAbstract);
}
