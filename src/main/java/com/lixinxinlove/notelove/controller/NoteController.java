package com.lixinxinlove.notelove.controller;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";


    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/save", method = {RequestMethod.POST}, consumes = {"application/json", CONTENT_TYPE_FORMED})
    public CommonReturnType save(@RequestParam(name = "notes") String notes, @RequestParam(name = "userId") Integer userId) {
        //TODO 修改信息

        Gson gson = new Gson();
        List<NoteDO> noteDOList = gson.fromJson(notes, new TypeToken<List<NoteDO>>() {}.getType());

        System.out.println("保存数据");
        int i = noteService.saveNoteList(noteDOList, userId);
        if (i > 0) {
            return CommonReturnType.create(1);
        } else {
            return CommonReturnType.error(0);
        }
    }

}
