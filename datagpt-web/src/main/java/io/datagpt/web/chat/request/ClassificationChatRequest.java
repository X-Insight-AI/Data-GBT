package io.datagpt.web.chat.request;

import io.datagpt.core.ChatType;

import java.util.List;

/**
 * [分类对话请求]
 * <p>
 * 用于更加精确的对话请求
 * <p>
 *
 *
 * @author xienng
 * @version 1.0
 * @date 2024年06月30日 16:08
 */
public class ClassificationChatRequest {
    private ChatType type;
    private List<Long> knowledgeBaseIds;
    private List<String> messages;
    private  String  fileSessionId;

}
