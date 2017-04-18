
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
                <p>"""),_display_(/*25.21*/e/*25.22*/.getLocation),format.raw/*25.34*/("""</p>
                <p>"""),_display_(/*26.21*/e/*26.22*/.getDate),format.raw/*26.30*/(""", """),_display_(/*26.33*/e/*26.34*/.getTime),format.raw/*26.42*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">


            """),_display_(/*33.14*/for(t <- tickets) yield /*33.31*/ {_display_(Seq[Any](format.raw/*33.33*/("""
                """),format.raw/*34.17*/("""<div class="col-md-4 text-center">
                    <div class="panel panel-success panel-pricing">
                        <div class="panel-heading">
                            <i class="fa fa-ticket whitetext" aria-hidden="true"></i>
                            <h3 class="whitetext">"""),_display_(/*38.52*/e/*38.53*/.getTitle),format.raw/*38.62*/(""" """),format.raw/*38.63*/(""": """),_display_(/*38.66*/e/*38.67*/.getEventName),format.raw/*38.80*/("""</h3>
                            <h3 class="whitetext">"""),_display_(/*39.52*/t/*39.53*/.getTicketType),format.raw/*39.67*/(""" """),format.raw/*39.68*/("""ticket</h3>
                        </div>
                        <div class="panel-body text-center">
                            <p><strong>€ """),_display_(/*42.43*/t/*42.44*/.getPrice),format.raw/*42.53*/("""</strong></p>
                        </div>
                        <div class="panel-footer">
                        """),_display_(/*45.26*/if(t.getQuantity > 0)/*45.47*/ {_display_(Seq[Any](format.raw/*45.49*/("""
                            """),format.raw/*46.29*/("""<a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*46.87*/("""" class="btn btn-lg btn-block btn-success">
                                Add to Cart</a>
                        """)))}/*48.27*/else/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""
                            """),format.raw/*49.29*/("""<button class = "btn btn-lg btn-block btn-danger">
                                Out of Stock </button>
                        """)))}),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""</div>
                    </div>
                </div><!-- /ticket -->
            """)))}),format.raw/*55.14*/("""
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
                  DATE: Tue Apr 18 11:33:35 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: 36efc2f94736aabc443de4f7f94f74bb84bc55b4
                  MATRIX: 815->1|1017->93|1047->115|1077->120|1106->141|1145->143|1177->149|1281->227|1321->259|1360->261|1402->275|1477->323|1491->328|1527->343|1569->357|1617->374|1654->384|1782->485|1866->560|1906->562|1952->580|2040->641|2079->659|2116->678|2129->683|2168->684|2214->702|2345->802|2387->816|2526->928|2536->929|2566->938|2595->939|2625->942|2635->943|2669->956|2723->983|2733->984|2766->996|2819->1022|2829->1023|2858->1031|2888->1034|2898->1035|2927->1043|3060->1149|3093->1166|3133->1168|3179->1186|3502->1482|3512->1483|3542->1492|3571->1493|3601->1496|3611->1497|3645->1510|3730->1568|3740->1569|3775->1583|3804->1584|3980->1733|3990->1734|4020->1743|4171->1867|4201->1888|4241->1890|4299->1920|4336->1930|4351->1936|4414->1978|4552->2098|4565->2103|4604->2104|4662->2134|4826->2267|4880->2293|5000->2382|5037->2392|5137->2464|5166->2465|5212->2483|5286->2529|5315->2530|5348->2536
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|63->33|63->33|63->33|64->34|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|72->42|72->42|72->42|75->45|75->45|75->45|76->46|76->46|76->46|76->46|78->48|78->48|78->48|79->49|81->51|82->52|85->55|86->56|91->61|91->61|92->62|93->63|93->63|94->64
                  -- GENERATED --
              */
          