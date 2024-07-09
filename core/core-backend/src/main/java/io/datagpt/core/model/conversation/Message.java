package io.datagpt.core.model.conversation;

import io.datagpt.core.model.attachment.Attachment;

import java.util.List;

/**
 * [简要描述类用途]
 * <p>
 * [详细描述类用途、功能等，可选]
 * <p>
 * [额外的细节描述，比如类的组成、原理等，可选]
 *
 * @author xienng
 * @version 1.0
 * @date 2024年06月30日 16:49
 */
public class Message {
    private String id;
    private String requestId;
    private Author author;
    private Content content;
    private List<Attachment> attachments;
    private List<String> children;
    private String parent;
}
