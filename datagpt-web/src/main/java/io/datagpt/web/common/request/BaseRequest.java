package io.datagpt.web.common.request;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * [简要描述类用途]
 * <p>
 * [详细描述类用途、功能等，可选]
 * <p>
 * [额外的细节描述，比如类的组成、原理等，可选]
 *
 * @author xienng
 * @version 1.0
 * @date 2024年06月30日 15:51
 */
public class BaseRequest {

    @Schema(description = "唯一请求id")
    private String requestId;

    @Schema(description = "请求签名类型", hidden = true)
    private String signType;

    @Schema(description = "请求时间戳", hidden = true)
    private Long timeStamp;

    @Schema(description = "请求签名", hidden = true)
    private String signature;

}
