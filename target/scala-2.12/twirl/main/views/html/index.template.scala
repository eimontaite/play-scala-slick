
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreatePersonForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(person: Form[CreatePersonForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
"""),_display_(/*6.2*/request/*6.9*/.messages(key)),format.raw/*6.23*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Play")/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
"""),_display_(/*10.2*/form(routes.PersonController.addPerson())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
"""),_display_(/*11.2*/inputText(person("name"))),format.raw/*11.27*/("""
"""),_display_(/*12.2*/inputText(person("middleName"), '_label -> "Middle name")),format.raw/*12.59*/("""
"""),_display_(/*13.2*/inputText(person("age"))),format.raw/*13.26*/("""
"""),_display_(/*14.2*/CSRF/*14.6*/.formField),format.raw/*14.16*/("""

"""),format.raw/*16.1*/("""<div class="buttons">
    <input type="submit" value="Add Person"/>
</div>
""")))}),format.raw/*19.2*/("""
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(person:Form[CreatePersonForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(person)(request)

  def f:((Form[CreatePersonForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (person) => (request) => apply(person)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 14:44:29 EEST 2018
                  SOURCE: /home/aiste/IdeaProjects/play-scala-slick-example/app/views/index.scala.html
                  HASH: 3d3175b3ce47aad72a76717dc2ae4b04db008bc3
                  MATRIX: 767->1|913->77|957->75|984->93|1011->95|1025->102|1058->127|1104->136|1131->138|1145->145|1179->159|1210->161|1238->164|1269->187|1308->189|1336->191|1386->232|1426->234|1454->236|1500->261|1528->263|1606->320|1634->322|1679->346|1707->348|1719->352|1750->362|1779->364|1885->440|1917->442
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|38->14|38->14|38->14|40->16|43->19|44->20
                  -- GENERATED --
              */
          