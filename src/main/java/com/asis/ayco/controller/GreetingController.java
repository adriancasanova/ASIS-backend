
package com.asis.ayco.controller;
/*import com.asis.ayco.model.GreetingWebSocket;
import com.asis.ayco.model.webSocket;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class GreetingController {
  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public GreetingWebSocket greeting(webSocket message) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new GreetingWebSocket("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
  }
}

*/




import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class GreetingController extends TextWebSocketHandler {

    private final List<WebSocketSession> webSocketSessions = new ArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        webSocketSessions.add(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        for(WebSocketSession webSocketSession : webSocketSessions){
            webSocketSession.sendMessage(message);
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        webSocketSessions.remove(session);
    }
}








  

