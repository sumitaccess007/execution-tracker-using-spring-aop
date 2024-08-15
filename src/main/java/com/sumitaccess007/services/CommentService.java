package com.sumitaccess007.services;

import com.sumitaccess007.model.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommentService {
    public void publishComment(Comment comment){
        log.info("Publishing Comment : " + comment.getText() + " written by : " + comment.getAuthor());
    }
}
