
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admineventTicket_Scope0 {
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

class admineventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Ticket],Event,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tickets: List[models.Ticket], e: Event, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Tickets",user)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <br>
        <br>
        <br>
        """),_display_(/*12.10*/if(flash.containsKey("success"))/*12.42*/{_display_(Seq[Any](format.raw/*12.43*/("""
            """),format.raw/*13.13*/("""<div class="alert alert-success">
            """),_display_(/*14.14*/flash/*14.19*/.get("success")),format.raw/*14.34*/("""
            """),format.raw/*15.13*/("""</div>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
            """),_display_(/*19.14*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*19.89*/ {_display_(Seq[Any](format.raw/*19.91*/("""
                """),format.raw/*20.17*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*20.78*/(e.getId + ".jpg")),format.raw/*20.96*/(""""/>
            """)))}/*21.15*/else/*21.20*/{_display_(Seq[Any](format.raw/*21.21*/("""
                """),format.raw/*22.17*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                """)))}),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""</div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>"""),_display_(/*27.22*/e/*27.23*/.getTitle),format.raw/*27.32*/(""" """),format.raw/*27.33*/(""", """),_display_(/*27.36*/e/*27.37*/.getEventName),format.raw/*27.50*/("""</h1>
                <p>Location here : """),_display_(/*28.37*/e/*28.38*/.getLocation),format.raw/*28.50*/("""</p>
                <p>Date/time here : """),_display_(/*29.38*/e/*29.39*/.getDate),format.raw/*29.47*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

                """),_display_(/*35.18*/for(t <- tickets) yield /*35.35*/ {_display_(Seq[Any](format.raw/*35.37*/("""
                    """),format.raw/*36.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h2>"""),_display_(/*39.34*/t/*39.35*/.getTicketType),format.raw/*39.49*/("""</h2>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                <p>Ticket price : € """),_display_(/*42.54*/t/*42.55*/.getPrice),format.raw/*42.64*/("""</p>

                                <div class="row">
                                    <div class="col-xs-12 col-md-6">
                                    """),_display_(/*46.38*/if(user.getRole.equals("admin"))/*46.70*/ {_display_(Seq[Any](format.raw/*46.72*/("""
                                        """),format.raw/*47.41*/("""<a href=""""),_display_(/*47.51*/routes/*47.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*47.100*/("""" class = "btn btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*50.38*/("""
                                    """),format.raw/*51.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*55.28*/("""
                """),format.raw/*56.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*62.42*/("""{"""),format.raw/*62.43*/("""
                        """),format.raw/*63.25*/("""return confirm('Are you sure?');
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
            """),format.raw/*65.13*/("""</script>

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
object admineventTicket extends admineventTicket_Scope0.admineventTicket
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 13:34:25 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admineventTicket.scala.html
                  HASH: 2ecfba039f228fba5838ea4737fd449ca0d3cd5f
                  MATRIX: 825->1|1027->93|1055->112|1083->115|1111->135|1150->137|1181->142|1323->257|1364->289|1403->290|1444->303|1518->350|1532->355|1568->370|1609->383|1656->399|1692->408|1818->507|1902->582|1942->584|1987->601|2075->662|2114->680|2150->698|2163->703|2202->704|2247->721|2377->820|2418->833|2554->942|2564->943|2594->952|2623->953|2653->956|2663->957|2697->970|2766->1012|2776->1013|2809->1025|2878->1067|2888->1068|2917->1076|3046->1178|3079->1195|3119->1197|3168->1218|3315->1338|3325->1339|3360->1353|3573->1539|3583->1540|3613->1549|3802->1711|3843->1743|3883->1745|3952->1786|3989->1796|4004->1802|4069->1845|4332->2077|4397->2114|4567->2253|4612->2270|4731->2361|4760->2362|4813->2387|4894->2440|4923->2441|4964->2454
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|54->24|57->27|57->27|57->27|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|65->35|65->35|65->35|66->36|69->39|69->39|69->39|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|77->47|80->50|81->51|85->55|86->56|92->62|92->62|93->63|94->64|94->64|95->65
                  -- GENERATED --
              */
          