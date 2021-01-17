package com.sicnu.controller;

import com.sicnu.mapper.MessageMapper;
import com.sicnu.pojo.Message;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/MessageMapper")
public class MessageController {
    @Resource
    private MessageMapper messageMapper;
    /**
     * 发送信息
     * @param message
     * @return
     */
    @PostMapping("/sendMessage")
    public int sendMessage(@RequestParam("message")Message message){
        return messageMapper.sendMessage(message);
    }

    /**
     * 查找消息
     * @param messageID
     * @return
     */
    @PostMapping("/findOneById")
    public Message findOneById(@RequestParam("messageID")String messageID){
        return messageMapper.findOneById(messageID);
    }

    /**
     * 显示已读信息
     * @param
     * @return
     */
    @PostMapping("/showMessageRead")
    public List<Message> showMessageRead(@RequestParam("stuId")String stuId){
        return messageMapper.showMessageRead(stuId);
    }
    /**
     * 显示未读信息
     */
    @GetMapping("/showMessageUnRead")
    public List<Message> showMessageUnRead(){
        return messageMapper.showMessageUnRead();
    }
    /**
     * 删除信息
     * @param messageID
     */
    @PostMapping("/deleteMessage")
    public int deleteMessage(@RequestParam("messageID")String messageID){
        return messageMapper.deleteMessage(messageID);
    }

    /**
     * 保存信息
     * @param
     */
    @PostMapping("/getIdByName")
    public String getIdByName(@RequestParam("name") String name){
        return messageMapper.getIdByName(name);
    }

    /**
     * 回复消息
     */
    @PostMapping("/setMessage")
    public int setMessage(@RequestParam("messageId")String messageId, @Param("title") String  title, @Param("content") String content){
        return messageMapper.setMessage(messageId,title,content);
    }
    @PostMapping("/findMessageBySendId")
    public Message findMessageBySendId(@RequestParam("stuNumber")String stuNumber){
        return messageMapper.findMessageBySendId(stuNumber);
    }
    @PostMapping("/findMessageByRecvId")
    public Message findMessageByRecvId(@RequestParam("stuNumber")String stuNumber){
        return messageMapper.findMessageByRecvId(stuNumber);
    }
}
