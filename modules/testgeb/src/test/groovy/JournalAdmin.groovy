import geb.Page
import geb.navigator.Navigator

class JournalPage extends Page {

    static url = "/group/guest/~/control_panel/manage?p_p_id=com_liferay_journal_web_portlet_JournalPortlet&p_p_lifecycle=0&p_p_state=maximized&p_v_l_s_g_id=20124"

    static content = {
        loginMod {module(LoginModule)}
        journalSearch {module(JournalSearch)}
        journalTraverser{module(JournalTraverse)}
        journalPublish{module(JournalPublish)}
    }
}