
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
                            <p><strong>€"""),_display_(/*42.42*/("%.2f".format(t.getPrice))),format.raw/*42.69*/("""</strong></p>
                        </div>
                        <ul class="list-group text-center">
                            <li class="list-group-item"><i class="fa fa-info-circle "></i> """),_display_(/*45.93*/t/*45.94*/.getDescription),format.raw/*45.109*/("""</li>
                        </ul>
                        <div class="panel-footer">
                        """),_display_(/*48.26*/if(t.getQuantity > 0)/*48.47*/ {_display_(Seq[Any](format.raw/*48.49*/("""
                            """),format.raw/*49.29*/("""<a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*49.87*/("""" class="btn btn-lg btn-block btn-success">
                                Add to Cart</a>
                        """)))}/*51.27*/else/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/("""
                            """),format.raw/*52.29*/("""<button class = "btn btn-lg btn-block btn-danger">
                                Out of Stock </button>
                        """)))}),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""</div>
                    </div>
                </div><!-- /ticket -->
            """)))}),format.raw/*58.14*/("""
        """),format.raw/*59.9*/("""</div>
    </div>


    <script>
            function confirmDel() """),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
                """),format.raw/*65.17*/("""return confirm('Are you sure?');
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/("""
    """),format.raw/*67.5*/("""</script>

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
                  DATE: Wed Apr 19 12:18:45 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: 5ef376d0d94b0b0ed4f14798b2965a88c00bb92a
                  MATRIX: 815->1|1017->93|1045->112|1073->115|1102->136|1141->138|1172->143|1274->219|1314->251|1353->253|1394->266|1468->313|1482->318|1518->333|1559->346|1606->362|1642->371|1768->470|1852->545|1892->547|1937->564|2025->625|2064->643|2100->661|2113->666|2152->667|2197->684|2327->783|2368->796|2504->905|2514->906|2544->915|2573->916|2603->919|2613->920|2647->933|2700->959|2710->960|2743->972|2795->997|2805->998|2834->1006|2864->1009|2874->1010|2903->1018|3029->1117|3062->1134|3102->1136|3147->1153|3466->1445|3476->1446|3506->1455|3535->1456|3565->1459|3575->1460|3609->1473|3693->1530|3703->1531|3738->1545|3767->1546|3939->1691|3987->1718|4211->1915|4221->1916|4258->1931|4397->2043|4427->2064|4467->2066|4524->2095|4561->2105|4576->2111|4639->2153|4775->2271|4788->2276|4827->2277|4884->2306|5046->2437|5099->2462|5216->2548|5252->2557|5347->2624|5376->2625|5421->2642|5494->2687|5523->2688|5555->2693
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|63->33|63->33|63->33|64->34|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|72->42|72->42|75->45|75->45|75->45|78->48|78->48|78->48|79->49|79->49|79->49|79->49|81->51|81->51|81->51|82->52|84->54|85->55|88->58|89->59|94->64|94->64|95->65|96->66|96->66|97->67
                  -- GENERATED --
              */
          