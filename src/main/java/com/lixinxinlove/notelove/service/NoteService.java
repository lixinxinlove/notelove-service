package com.lixinxinlove.notelove.service;


import com.lixinxinlove.notelove.dataobject.NoteDO;

import java.util.List;

public interface NoteService {

    int saveNote(NoteDO noteDO);

    int saveNoteList(List<NoteDO> noteDOList,Integer userId);

    NoteDO getNote(Integer id);

    List<NoteDO> getNoteList(Integer userId);

    int deleteNote(Integer id);

    int updateNote(NoteDO noteDO);


    int updateNoteList(List<NoteDO> noteDOList,Integer userId);

}
