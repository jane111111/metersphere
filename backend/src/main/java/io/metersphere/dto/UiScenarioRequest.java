package io.metersphere.dto;

import io.metersphere.controller.request.BaseQueryRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UiScenarioRequest extends BaseQueryRequest {
    private String id;
    private String excludeId;
    private String moduleId;
    private String name;
    private String userId;
    private String planId;
    private boolean recent = false;
    private boolean isSelectThisWeedData;
    private long createTime = 0;
    private String executeStatus;
    private boolean notInTestPlan;
    private String reviewId;
    private String versionId;
    private String refId;

    //操作人
    private String operator;
    //操作时间
    private Long operationTime;
    /**
     * 是否需要查询环境字段
     */
    private boolean selectEnvironment = false;
    //测试计划关联场景过滤掉步骤为0的场景
    private String stepTotal;
}
