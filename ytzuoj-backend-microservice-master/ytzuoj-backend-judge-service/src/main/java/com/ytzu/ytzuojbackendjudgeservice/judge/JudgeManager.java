package com.ytzu.ytzuojbackendjudgeservice.judge;

import com.ytzu.ytzuojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.ytzu.ytzuojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.ytzu.ytzuojbackendjudgeservice.judge.strategy.JudgeContext;
import com.ytzu.ytzuojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.ytzu.ytzuojbackendmodel.model.codesandbox.JudgeInfo;
import com.ytzu.ytzuojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
