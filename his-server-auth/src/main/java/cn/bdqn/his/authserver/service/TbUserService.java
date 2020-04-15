package cn.bdqn.his.authserver.service;

import cn.bdqn.his.authserver.domain.TbUser;
import cn.bdqn.his.authserver.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserService {

    @Autowired
    private TbUserMapper userMapper;

    public TbUser getUserByUsername(String username){
        return userMapper.getByUsername(username);
    }
}
