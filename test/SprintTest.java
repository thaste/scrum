import models.Sprint;
import org.junit.Test;

import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

import static org.fest.assertions.Assertions.assertThat;



public class SprintTest {

    @Test
    public void create() {
        running(fakeApplication(), new Runnable() {
        
            public void run() {
                Sprint sprint = new Sprint();
                sprint.name = "Sprint 1";
                sprint.save();
                assertThat(sprint.id).isNotNull();
            }
        });
    }

}