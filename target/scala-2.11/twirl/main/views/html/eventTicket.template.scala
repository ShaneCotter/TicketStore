
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

        """),_display_(/*32.10*/for(t <- tickets) yield /*32.27*/ {_display_(Seq[Any](format.raw/*32.29*/("""
            """),format.raw/*33.13*/("""<div class="item  col-xs-4 col-lg-4">
                <div class="thumbnail">

                    <h2>"""),_display_(/*36.26*/t/*36.27*/.getTicketType),format.raw/*36.41*/("""</h2>
                    <div class="caption">
                        <p class="group inner list-group-item-text">
                    <p>€"""),_display_(/*39.26*/t/*39.27*/.getPrice),format.raw/*39.36*/("""</p>

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
                  DATE: Wed Apr 12 11:39:56 IST 2017
                  SOURCE: /home/wdd/webapps/projectBackup/app/views/eventTicket.scala.html
                  HASH: f55b3916591c1c755929c4e7bbb0f90b77fa3e2e
                  MATRIX: 815->1|1017->93|1045->112|1073->115|1102->136|1141->138|1172->143|1274->219|1314->251|1353->253|1394->266|1468->313|1482->318|1518->333|1559->346|1606->362|1642->371|1768->470|1852->545|1892->547|1937->564|2025->625|2064->643|2100->661|2113->666|2152->667|2197->684|2327->783|2368->796|2504->905|2514->906|2544->915|2573->916|2603->919|2613->920|2647->933|2700->959|2710->960|2743->972|2795->997|2805->998|2834->1006|2864->1009|2874->1010|2903->1018|3024->1112|3057->1129|3097->1131|3138->1144|3269->1248|3279->1249|3314->1263|3483->1405|3493->1406|3523->1415|3688->1553|3718->1574|3758->1576|3819->1609|3856->1619|3871->1625|3934->1667|4065->1780|4078->1785|4117->1786|4178->1819|4331->1941|4388->1970|4535->2086|4571->2095|4666->2162|4695->2163|4740->2180|4813->2225|4842->2226|4874->2231
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|62->32|62->32|62->32|63->33|66->36|66->36|66->36|69->39|69->39|69->39|73->43|73->43|73->43|74->44|74->44|74->44|74->44|76->46|76->46|76->46|77->47|79->49|80->50|85->55|86->56|91->61|91->61|92->62|93->63|93->63|94->64
                  -- GENERATED --
              */
          