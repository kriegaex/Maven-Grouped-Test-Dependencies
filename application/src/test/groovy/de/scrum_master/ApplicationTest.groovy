package de.scrum_master

import de.scrum_master.Application
import spock.lang.Specification

class ApplicationTest extends Specification {
    def "GetGreeting"() {
        expect:
        Application.getGreeting() == "Hello world!"
    }
}
