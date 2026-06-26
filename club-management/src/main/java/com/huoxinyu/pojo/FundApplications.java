package com.huoxinyu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 经费申请记录表
 * @TableName fund_applications
 */
@TableName(value ="fund_applications")
@Data
public class FundApplications {
    /**
     * 申请ID
     */
    @TableId(type = IdType.AUTO)
    private Integer appId;

    /**
     * 关联活动ID
     */
    private Integer activityId;

    /**
     * 申请人学号
     */
    private String applicantId;

    /**
     * 申请金额
     */
    private BigDecimal amount;

    /**
     * 申请理由
     */
    private String reason;

    /**
     * 审核状态
     */
    private Object status;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核人学号(通常是指导老师或主席团)
     */
    private String auditorId;
}