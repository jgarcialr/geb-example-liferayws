import geb.Module

class LoginModule extends Module {
    static content = {
        loginButton(to: JournalPage) { $("button.btn.btn-primary") }
        username { $("input", name: "_com_liferay_login_web_portlet_LoginPortlet_login") }
        password { $("input", name: "_com_liferay_login_web_portlet_LoginPortlet_password") }
    }

    void login(){
        username.value("test@liferay.com")
        password.value("test")
        loginButton.click()
    }
}