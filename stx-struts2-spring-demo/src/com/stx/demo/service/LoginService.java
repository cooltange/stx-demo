package com.stx.demo.service;

import com.stx.demo.vo.StudentVo;

public interface LoginService {

	StudentVo validateAuth(String username, String password);

}
