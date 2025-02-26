package com.ytzu.ytzuojcodesandbox;


import com.ytzu.ytzuojcodesandbox.model.ExecuteCodeRequest;
import com.ytzu.ytzuojcodesandbox.model.ExecuteCodeResponse;

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
