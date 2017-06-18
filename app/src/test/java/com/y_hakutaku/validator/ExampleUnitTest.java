package com.y_hakutaku.validator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void launch_validate_test(){
        Launch launch = new Launch();
        launch.setXxx(null);
        launch.validate();
        Container container = launch.getContainer();
        Assert.assertEquals(container.getActionLog().get("xxx"),null);
        Assert.assertEquals(container.getError().size(),1);
        Assert.assertEquals(container.getError().get(0),"mandatory error");
    }
}