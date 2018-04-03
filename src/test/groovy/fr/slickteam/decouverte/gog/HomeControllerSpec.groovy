package fr.slickteam.decouverte.gog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import spock.lang.Specification;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HomeControllerSpec extends Specification {

    @Autowired
    private TestRestTemplate restTemplate;

    def "return 'hello world' when get hello"(){
        
    }

    @Test
    public void return_helloworld_wher_get_hello() {
        String body = this.restTemplate.getForObject("/hello", String.class);
        assertThat(body).isEqualTo("Hello World");
    }
}
