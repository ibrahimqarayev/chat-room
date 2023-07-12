package az.chatroom.chat.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    private String content;

    private String sender;

    private MessageType messageType;

}
