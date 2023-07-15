package az.chatroom.chat.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {


    private MessageType type;

    private String content;

    private String sender;


}
