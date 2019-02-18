package com.lixinxinlove.notelove.controller;


import com.lixinxinlove.notelove.dataobject.NoteDO;
import com.lixinxinlove.notelove.response.CommonReturnType;
import com.lixinxinlove.notelove.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("note")
@RestController
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")   //跨域请求
public class NoteController {


    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    public CommonReturnType login(@RequestBody List<NoteDO> noteDOList) {
        //TODO 修改信息
        int i = noteService.saveNoteList(noteDOList);
        if (i > 0) {
            return CommonReturnType.create("");
        } else {
            return CommonReturnType.error("");
        }
    }

}
