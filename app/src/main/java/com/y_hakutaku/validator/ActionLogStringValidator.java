package com.y_hakutaku.validator;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class ActionLogStringValidator implements Validator{

    private String val = null;
    private RestrictionString restriction;

    ActionLogStringValidator(RestrictionString restriction) {
        this.restriction = restriction;
    }

    void setVal(String val) {
        this.val = val;
    }

    @Override
    public void validate(Container container) {
        if (null == val) {
            if(restriction.getMandatory()) {
                container.getError().add("mandatory error");
                container.getActionLog().put(restriction.getKey(),null);
            }
        }

    }
}
