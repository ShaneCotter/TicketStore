
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object eventTicket_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Ticket],Event,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tickets: List[models.Ticket], e: Event, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Tickets", user)/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        """),_display_(/*9.10*/if(flash.containsKey("success"))/*9.42*/ {_display_(Seq[Any](format.raw/*9.44*/("""
            """),format.raw/*10.13*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
            """),format.raw/*12.13*/("""</div>
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""<div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
            """),_display_(/*16.14*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*16.89*/ {_display_(Seq[Any](format.raw/*16.91*/("""
                """),format.raw/*17.17*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*17.78*/(e.getId + ".jpg")),format.raw/*17.96*/(""""/>
            """)))}/*18.15*/else/*18.20*/{_display_(Seq[Any](format.raw/*18.21*/("""
                """),format.raw/*19.17*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                """)))}),format.raw/*20.18*/("""
            """),format.raw/*21.13*/("""</div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>"""),_display_(/*24.22*/e/*24.23*/.getTitle),format.raw/*24.32*/(""" """),format.raw/*24.33*/(""", """),_display_(/*24.36*/e/*24.37*/.getEventName),format.raw/*24.50*/("""</h1>
                <p>Location here : """),_display_(/*25.37*/e/*25.38*/.getLocation),format.raw/*25.50*/("""</p>
                <p>Date/time here : """),_display_(/*26.38*/e/*26.39*/.getDate),format.raw/*26.47*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

        """),_display_(/*32.10*/for(t <- tickets) yield /*32.27*/ {_display_(Seq[Any](format.raw/*32.29*/("""
            """),format.raw/*33.13*/("""<div class="item  col-xs-4 col-lg-4">
                <div class="thumbnail">

                    <h2>"""),_display_(/*36.26*/t/*36.27*/.getTicketType),format.raw/*36.41*/("""</h2>
                    <div class="caption">
                        <p class="group inner list-group-item-text">
                    <p>Ticket price : € """),_display_(/*39.42*/t/*39.43*/.getPrice),format.raw/*39.52*/("""</p>

                        <div class="row">
                            <div class="col-xs-12 col-md-6">
                            """),_display_(/*43.30*/if(t.getQuantity > 0)/*43.51*/ {_display_(Seq[Any](format.raw/*43.53*/("""
                                """),format.raw/*44.33*/("""<a href=""""),_display_(/*44.43*/routes/*44.49*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*44.91*/("""" class = "btn btn-success">
                                    Add to Basket</a>
                            """)))}/*46.31*/else/*46.36*/{_display_(Seq[Any](format.raw/*46.37*/("""
                                """),format.raw/*47.33*/("""<button class = "btn btn-danger">
                                    Out of Stock </button>
                            """)))}),format.raw/*49.30*/("""
                            """),format.raw/*50.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*55.10*/("""
        """),format.raw/*56.9*/("""</div>
    </div>


    <script>
            function confirmDel() """),format.raw/*61.35*/("""{"""),format.raw/*61.36*/("""
                """),format.raw/*62.17*/("""return confirm('Are you sure?');
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
    """),format.raw/*64.5*/("""</script>

        <!--END CONTENT-->
""")))}))
      }
    }
  }

  def render(tickets:List[models.Ticket],e:Event,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(tickets,e,user,env)

  def f:((List[models.Ticket],Event,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (tickets,e,user,env) => apply(tickets,e,user,env)

  def ref: this.type = this

}


}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 23:43:49 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: 906d37a8ee5f8137baf5d0f7259707821f642b76
                  MATRIX: 815->1|1017->93|1047->115|1077->120|1106->141|1145->143|1177->149|1281->227|1321->259|1360->261|1402->275|1477->323|1491->328|1527->343|1569->357|1617->374|1654->384|1782->485|1866->560|1906->562|1952->580|2040->641|2079->659|2116->678|2129->683|2168->684|2214->702|2345->802|2387->816|2526->928|2536->929|2566->938|2595->939|2625->942|2635->943|2669->956|2739->999|2749->1000|2782->1012|2852->1055|2862->1056|2891->1064|3018->1164|3051->1181|3091->1183|3133->1197|3267->1304|3277->1305|3312->1319|3500->1480|3510->1481|3540->1490|3709->1632|3739->1653|3779->1655|3841->1689|3878->1699|3893->1705|3956->1747|4089->1862|4102->1867|4141->1868|4203->1902|4358->2026|4416->2056|4568->2177|4605->2187|4705->2259|4734->2260|4780->2278|4854->2324|4883->2325|4916->2331
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|62->32|62->32|62->32|63->33|66->36|66->36|66->36|69->39|69->39|69->39|73->43|73->43|73->43|74->44|74->44|74->44|74->44|76->46|76->46|76->46|77->47|79->49|80->50|85->55|86->56|91->61|91->61|92->62|93->63|93->63|94->64
                  -- GENERATED --
              */
          