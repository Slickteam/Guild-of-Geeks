package fr.slickteam.decouverte.gog.math

import spock.lang.Specification


class AdditionSpeck extends Specification {

    def "check that 5 + 2 is equal to 7"(){
        given: "two numbers '5' and '2'"
        int a = 5
        int b = 2

        when: "I want to add them"
        int c = a + b

        then: "I should have '7'"
        c == 7
    }
}