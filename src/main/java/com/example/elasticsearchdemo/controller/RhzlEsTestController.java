package com.example.elasticsearchdemo.controller;

import com.fingard.gardpay.bizops.dto.batch.BatchDetailPageViewStatisticsDTO;
import com.fingard.gardpay.bizops.dto.batch.BatchDetailParam;
import com.fingard.gardpay.bizops.dto.batch.BatchDetailStatisticsShowDTO;
import com.fingard.gardpay.bizops.dto.batch.BizopsBatchDetailDTO;
import com.fingard.gardpay.common.bean.PageView;
import com.fingard.gardpay.common.bean.ResultContext;
import com.fingard.gardpay.common.crossdb.DataSourceOffsetDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * RHZL界面查询 ES测试接口
 *
 * @author tianzh
 * @date 2021/08/04
 */
@RestController
@RequestMapping("/bizops/batchQuery")
public class RhzlEsTestController {

    @ApiOperation(value = "批次明细分页查询")
    @PostMapping("/listBatchDetail.do")
    ResultContext<BatchDetailPageViewStatisticsDTO> listBatchDetail(@RequestBody BatchDetailParam batchDetailParam, HttpServletRequest request) {

        List<DataSourceOffsetDTO> offsetList;

        BatchDetailStatisticsShowDTO batchDetailStatisticsShowDTO;

        PageView<BizopsBatchDetailDTO> pageView;


        // TODO
        return ResultContext.success("");
    }
}
