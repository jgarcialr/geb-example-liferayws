import geb.Module

class JournalPublish extends Module {

    static content = {
        publishButton(wait:true) { $("#_com_liferay_journal_web_portlet_JournalPortlet_publishButton",0) }
    }

    void publish(){
        interact {click publishButton}
    }

}