package com.example.monkey_server.service.impl;

import com.example.monkey_server.bean.request.SleepData;
import com.example.monkey_server.bean.response.UserSleepBean;
import com.example.monkey_server.dao.SleepDao;
import com.example.monkey_server.entity.Sleep;
import com.example.monkey_server.entity.User;
import com.example.monkey_server.response.ResponseWrapper;
import com.example.monkey_server.response.TokenWrapper;
import com.example.monkey_server.service.BaseServiceImpl;
import com.example.monkey_server.service.SleepService;
import com.example.monkey_server.util.Constant;
import com.example.monkey_server.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/4/2 12:35
 */

@Service("SleepService")
public class SleepServiceImpl extends BaseServiceImpl implements SleepService {

    @Autowired
    SleepDao sleepDao;

    @Override
    public ResponseWrapper getUserSleepData(String token) {
        TokenWrapper tokenWrapper = checkToken(token);
        if (tokenWrapper != null) {
            if (tokenWrapper.getCode() == Constant.TokenStatus.TOKEN_LOGIN) {
                UserSleepBean userSleepBean =sleepDao.getSleepList(tokenWrapper.getId());
                if (userSleepBean==null||userSleepBean.getSleepBeans()==null||userSleepBean.getSleepBeans().size()==0){
                    return ResponseUtil.getDataSuccessWithoutData();
                }else {
                    return ResponseUtil.getDataSuccess(userSleepBean);
                }

            } else {
                return tokenError(tokenWrapper);
            }
        }
        return ResponseUtil.UnKnowError();
    }

    @Override
    public ResponseWrapper analysisSleepData(String token, SleepData sleepData) {
        if (sleepData==null){
            return null;
        }

        TokenWrapper tokenWrapper = checkToken(token);
        if (tokenWrapper != null) {
            if (tokenWrapper.getCode() == Constant.TokenStatus.TOKEN_LOGIN) {
                try {
                    Sleep sleep=new Sleep();
                    User user=new User();
                    user.setId(tokenWrapper.getId());
                    sleep.setUser(user);
                    sleep.setStart_time(sleepData.getStart_time());
                    sleep.setEnd_time(sleepData.getEnd_time());
                    sleep.setDetail("97452421263424343579");
                    sleep.setGrade(calculateGrade(null));
                    int code=sleepDao.insertSleepData(sleep);
                    if (code>0){
                        return ResponseUtil.getDataSuccess(null);
                    }else {
                        return ResponseUtil.getDataFalse("数据插入失败");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return ResponseUtil.UnKnowError();
                }
            } else {
                return tokenError(tokenWrapper);
            }
        }
        return ResponseUtil.UnKnowError();
    }

    private int calculateGrade(String detail){
        return 60+(int)(Math.random()*40 );
    }
}
