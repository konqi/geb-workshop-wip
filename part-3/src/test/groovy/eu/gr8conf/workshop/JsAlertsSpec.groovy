package eu.gr8conf.workshop

import geb.spock.GebReportingSpec
import spock.lang.Unroll

class JsAlertsSpec extends GebReportingSpec {



    void "verify javascript alert can be handled - displaying 'You successfuly clicked an alert'"() {
        setup:
            go "http://the-internet.herokuapp.com/javascript_alerts"
        when:
            withAlert { $("ul li button", 0).click() }
        then:
            $('p#result').text() == 'You successfuly clicked an alert'
    }

//    @Unroll
//    void "verify javascript confirm can be handled - accepting and rejecting displaying 'You Clicked'"() {
//        setup:
//        go "http://the-internet.herokuapp.com/javascript_alerts"
//
//        expect: 'Needs implementation'
//        false
//    }



}