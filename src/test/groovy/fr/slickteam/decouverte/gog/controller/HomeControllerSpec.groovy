package fr.slickteam.decouverte.gog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerSpec extends Specification {

    @Autowired
    private TestRestTemplate restTemplate

    def "return 'hello world' when get hello"(){

        given: "the application 'guild-of-geeks' is launched"

        when: "I requested the 'hello' API"
        String body = this.restTemplate.getForObject("/hello", String.class)

        then: "I should retrieve the content 'Hello World'"
        body == "Hello World"
    }
}
