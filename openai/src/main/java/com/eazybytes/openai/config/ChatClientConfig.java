package com.eazybytes.openai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {
        return chatClientBuilder
                .defaultSystem("""
                            This is System Message and only answer to HR policies , apart from HR policies do not answer other
                            questions.
                        """)
                .defaultUser("What is Your Name?")
                .build();
    }
}
