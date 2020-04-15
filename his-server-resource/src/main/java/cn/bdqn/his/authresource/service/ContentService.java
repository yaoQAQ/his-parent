package cn.bdqn.his.authresource.service;


import cn.bdqn.his.authresource.domain.TbContent;
import cn.bdqn.his.authresource.mapper.TbContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {


    @Autowired
    private TbContentMapper contentMapper;

    public List<TbContent> queryAllContent(Long categoryId) {
        return contentMapper.queryByCategoryid(categoryId);
    }
}
