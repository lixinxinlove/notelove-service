package com.lixinxinlove.notelove.service.impl;

import com.lixinxinlove.notelove.dao.NoteDOMapper;
import com.lixinxinlove.notelove.dataobject.NoteDO;
import com.lixinxinlove.notelove.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {


    @Autowired
    private NoteDOMapper noteDOMapper;

    @Override
    public int saveNote(NoteDO noteDO) {
        return 0;
    }

    @Override
    public int saveNoteList(List<NoteDO> noteDOList, Integer userId) {

        for (NoteDO noteDO : noteDOList) {
            noteDO.setStatus(1);
            noteDO.setUserId(userId);
            noteDOMapper.insertSelective(noteDO);
        }
        return 1;
    }

    @Override
    public NoteDO getNote(Integer id) {
        return null;
    }

    @Override
    public List<NoteDO> getNoteList(Integer userId) {
        return null;
    }

    @Override
    public int deleteNote(Integer id) {
        return 0;
    }

    @Override
    public int updateNote(NoteDO noteDO) {
        return 0;
    }
}
