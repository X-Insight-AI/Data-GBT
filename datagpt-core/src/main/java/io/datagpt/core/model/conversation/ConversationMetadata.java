package io.datagpt.core.model.conversation;

/**
 * [简要描述类用途]
 * <p>
 * [详细描述类用途、功能等，可选]
 * <p>
 * {
 * "id": "bfd1a839-5ef4-464b-b4a8-3bba928e0d91",
 * "title": "Java运行ONNX模型",
 * "create_time": "2024-06-28T06:41:52.290572Z",
 * "update_time": "2024-06-28T06:43:00.010771Z",
 * "mapping": null,
 * "current_node": null,
 * "conversation_template_id": null,
 * "gizmo_id": null,
 * "is_archived": false,
 * "workspace_id": null,
 * "async_status": null
 * },
 *
 * @author xienng
 * @version 1.0
 * @date 2024年06月30日 16:32
 */
public class ConversationMetadata {
    protected String title;
    protected String conversationId;
    protected String conversationTemplateId;
    protected Long createTime;
    protected Long updateTime;
}
