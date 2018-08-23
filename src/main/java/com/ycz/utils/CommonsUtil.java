package com.ycz.utils;

import com.ycz.constant.WebConst;
import com.ycz.model.Vo.UserVo;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class CommonsUtil {

    /**
     * 从session获取user
     * @param request
     * @return
     */
    public static UserVo getLoginUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(null == session){
            return null;
        }
        return (UserVo) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
    }


}
