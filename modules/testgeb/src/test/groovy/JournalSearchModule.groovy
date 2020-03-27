import geb.Module

class JournalSearch extends Module {

    static content = {
        searchButton() { $("[aria-label=search]",0) }
        searchInput{ $("input", name: "_com_liferay_journal_web_portlet_JournalPortlet_keywords") }
    }

    void search(keyword){
        searchInput.value(keyword)
        searchButton.click()
    }

}