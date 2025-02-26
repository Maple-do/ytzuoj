package com.ytzu.ytzuojbackendjudgeservice.judge.codesandbox;

import com.ytzu.ytzuojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.ytzu.ytzuojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
