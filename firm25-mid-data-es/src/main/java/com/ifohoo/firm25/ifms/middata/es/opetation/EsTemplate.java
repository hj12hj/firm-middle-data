package com.ifohoo.firm25.ifms.middata.es.opetation;

import org.elasticsearch.action.admin.indices.settings.put.UpdateSettingsRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @description: es原生操作类 处理框架无法处理的问题
 * @author: hj
 * @date: 2023/2/14
 * @time: 10:22 AM
 */
@Component
public class EsTemplate {

    Logger logger = org.slf4j.LoggerFactory.getLogger(EsTemplate.class);

    @Autowired
    RestHighLevelClient restHighLevelClient;

    /**
     * 设置最大结果集 分页查询时候使用
     *
     * @param maxResultWindow
     * @throws IOException
     */
    public void setMaxResultWindow(String indexName, int maxResultWindow) throws IOException {
        Settings settings = Settings.builder()
                .put("index.max_result_window", maxResultWindow)
                .build();
        UpdateSettingsRequest request = new UpdateSettingsRequest(indexName);
        request.settings(settings);
        AcknowledgedResponse acknowledgedResponse = restHighLevelClient.indices().putSettings(request, RequestOptions.DEFAULT);
        logger.info("设置最大结果集：" + acknowledgedResponse.isAcknowledged());
    }


}
