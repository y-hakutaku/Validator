package com.y_hakutaku.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class Launch extends Action{

    List<Validator> launchValidators;
    private ActionLogStringValidator xxxValidator = new ActionLogStringValidator(new RestrictionString("xxx",null,1,256,true));

    Launch(){
        launchValidators = new ArrayList<Validator>();
        launchValidators.add(xxxValidator);
    }

    void setXxx(String xxx) {
        xxxValidator.setVal(xxx);
    }

    void validate() {
        xxxValidator.validate(getContainer());
    }
}
