import geb.spock.GebSpec

class LiferayOrgSpec extends GebSpec {

    def "can get to the LoginPage"() {
        when:

        to JournalPage

        and:

        loginMod.login()

        and:

        journalSearch.search("test")
        journalTraverser.gotoLink()

        and:
        waitFor{$("#_com_liferay_journal_web_portlet_JournalPortlet_publishButton").displayed}
        and:
        waitFor{$("#_com_liferay_journal_web_portlet_JournalPortlet_publishButton").displayed}
        journalPublish.publish()
        and:

        waitFor{$("p", class: "font-weight-bold h5").displayed}
        then:
        assert page.title.contains("Web Content - Liferay DXP")
    }
}