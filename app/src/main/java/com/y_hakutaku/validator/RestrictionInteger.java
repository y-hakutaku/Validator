package com.y_hakutaku.validator;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class RestrictionInteger extends Restriction {

    RestrictionInteger(String key, String regex, Integer min_length, Integer max_length, boolean mandatory) {
        super(key, regex, null, null, min_length, max_length, null, null, mandatory);
    }
}
