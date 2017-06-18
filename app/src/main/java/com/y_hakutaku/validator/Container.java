package com.y_hakutaku.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class Container {
    Map<String, Object> actionLog;
    List<String> error;

    Container(){
        actionLog = new HashMap<>();
        error = new ArrayList<>();
    }

    public List<String> getError() {
        return error;
    }

    public Map<String, Object> getActionLog() {
        return actionLog;
    }
}
