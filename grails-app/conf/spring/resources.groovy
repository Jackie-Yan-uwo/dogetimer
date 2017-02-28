// Place your Spring DSL code here
import static grails.web.UrlConverter.BEAN_NAME as UrlConverterBean

beans = {
    "${UrlConverterBean}"(utils.LowerCaseUrlConverter)
}
