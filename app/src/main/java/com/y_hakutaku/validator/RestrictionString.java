package com.y_hakutaku.validator;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class RestrictionString extends Restriction {

    RestrictionString(String key, String regex, Integer min, Integer max, boolean mandatory) {
        super(key, regex,  min,  max, null, null, null, null, mandatory);
    }


}
