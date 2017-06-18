package com.y_hakutaku.validator;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public abstract class Action {

    private Container container = new Container();

    Container getContainer() {
        return container;
    };

    abstract void validate();
}
