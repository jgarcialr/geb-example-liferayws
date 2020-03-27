import geb.Page

class JournalVersionPage extends Page{
    static content={
        dynamicallyAdded(wait:true){$("p", class: "article-version-status")}
    }
}