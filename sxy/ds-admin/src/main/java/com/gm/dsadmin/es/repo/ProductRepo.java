package com.gm.dsadmin.es.repo;

import com.gm.dsadmin.es.doc.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<ProductDoc,Integer> {
}
