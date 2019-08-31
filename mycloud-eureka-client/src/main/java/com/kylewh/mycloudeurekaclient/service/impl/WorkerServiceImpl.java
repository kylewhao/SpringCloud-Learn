package com.kylewh.mycloudeurekaclient.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kylewh.mycloudapi.entity.Worker;
import com.kylewh.mycloudeurekaclient.constant.DataSourceConstant;
import com.kylewh.mycloudeurekaclient.mapper.WorkerMapper;
import com.kylewh.mycloudeurekaclient.service.WorkerService;
import org.springframework.stereotype.Service;

/**
 * @author kylewhao
 */
@Service
@DS(DataSourceConstant.DS_MASTER)
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements WorkerService {

}
