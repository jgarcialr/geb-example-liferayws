import geb.Page
import geb.navigator.Navigator

class LoginPage extends Page {

    static url = "/c/portal/login"

    static content = {
        loginButton(to: JournalPage) { $("button.btn.btn-primary") }
        username { $("input", name: "_com_liferay_login_web_portlet_LoginPortlet_login") }
        password { $("input", name: "_com_liferay_login_web_portlet_LoginPortlet_password") }
    }
}
