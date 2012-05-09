import org.junit.Test;
import play.mvc.Result;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

/**
 *
 * @author stefaanluckermans
 */
public class ScrumTest {


    @Test
    public void testScrumRoute() {
        Result result = routeAndCall(fakeRequest(GET, "/scrum"));
        assertThat(result).isNotNull();
    }

}