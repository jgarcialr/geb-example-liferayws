import geb.Module
import geb.navigator.Navigator

class JournalTraverse extends Module {

    static content = {
        prueba(wait:true) {$("p", class: "font-weight-bold h5").children("a")}
        dynamicallyAdded(wait:true){$("p", class: "article-version-status")}
    }

    void gotoLink() {
        interact {click prueba}
    }

    Navigator dynamica(){
        Object obj = this.getContent()
        return dynamicallyAdded.text()
    }
}
