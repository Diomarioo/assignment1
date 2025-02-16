package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private Notification notification;

    @Autowired
    public CommentService(CommentRepository commentRepository, Notification notification) {
        this.commentRepository = commentRepository;
        this.notification = notification;
    }

    public void publish(Message message) {}
}
