package utils

import com.sun.javafx.css.converters.URLConverter
import grails.web.UrlConverter

class LowerCaseUrlConverter implements UrlConverter {

    @Override
    String toUrlElement(String propertyOrClassName) {
        if (propertyOrClassName) {
            // If there is some class name or method name in url then convert it to lowercase.
            propertyOrClassName.toLowerCase()
        } else {
            // Else return default name.
            propertyOrClassName
        }
    }

}
