package com.lixinxinlove.notelove;

import com.lixinxinlove.notelove.dao.NoteDOMapper;
import com.lixinxinlove.notelove.dataobject.NoteDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteloveApplicationTests {

    @Autowired
    NoteDOMapper noteDOMapper;


    @Test
    public void contextLoads() {
    }


    @Test
    public void NoteList() {

        NoteDO noteDO = noteDOMapper.selectByKey(1550739039);

        System.out.println(noteDO.toString());

    }

}
