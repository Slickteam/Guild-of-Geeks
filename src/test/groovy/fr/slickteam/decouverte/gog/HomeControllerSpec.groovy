package fr.slickteam.decouverte.gog

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerSpec extends Specification {

    @Autowired
    private TestRestTemplate restTemplate

    def "return 'hello world' when get hello"(){

        given:
        when:
        String body = this.restTemplate.getForObject("/hello", String.class)
        then:
        body == "Hello World"
    }
}
