package demo.simplegroovyapp.domain;

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@CompileStatic
@Canonical
class Motor {

    int rpm
    int speed

}

