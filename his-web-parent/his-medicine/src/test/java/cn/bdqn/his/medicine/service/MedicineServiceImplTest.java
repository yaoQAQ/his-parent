package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Medicine;
import com.alibaba.druid.filter.config.ConfigTools;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MedicineServiceImplTest {
    @Resource MedicineService medicineService;

    @Test
    public void findAll() {
        PageHelper.startPage(1,2);
        List<Medicine> list = medicineService.findAll();
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });
    }
    @Test
    public void findAllBy() {
        PageHelper.startPage(2,2);
        List<Medicine> list = medicineService.findAll(1,"化");
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });

    }
    @Test
    public void test1() throws Exception{
        ConfigTools configTools=new ConfigTools();
        String passwrod="1234";
        String[] arr =configTools.genKeyPair(512);
        System.out.println("privatekey:"+arr[0]);
        System.out.println("publickey:"+arr[1]);
        System.out.println("password:"+configTools.encrypt(arr[0],passwrod));
    }
}