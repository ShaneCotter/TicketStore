
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
                  DATE: Tue Apr 11 12:42:33 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admineventTicket.scala.html
                  HASH: e6ad6021fc09ab984695d25adf4bbd824ce3467d
                  MATRIX: 825->1|1027->93|1057->115|1087->120|1115->140|1154->142|1186->148|1333->268|1374->300|1413->301|1455->315|1530->363|1544->368|1580->383|1622->397|1670->414|1707->424|1835->525|1919->600|1959->602|2005->620|2093->681|2132->699|2169->718|2182->723|2221->724|2267->742|2398->842|2440->856|2579->968|2589->969|2619->978|2648->979|2678->982|2688->983|2722->996|2792->1039|2802->1040|2835->1052|2905->1095|2915->1096|2944->1104|3079->1212|3112->1229|3152->1231|3202->1253|3352->1376|3362->1377|3397->1391|3613->1580|3623->1581|3653->1590|3846->1756|3887->1788|3927->1790|3997->1832|4034->1842|4049->1848|4114->1891|4380->2126|4446->2164|4620->2307|4666->2325|4791->2422|4820->2423|4874->2449|4956->2503|4985->2504|5027->2518
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|54->24|57->27|57->27|57->27|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|65->35|65->35|65->35|66->36|69->39|69->39|69->39|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|77->47|80->50|81->51|85->55|86->56|92->62|92->62|93->63|94->64|94->64|95->65
                  -- GENERATED --
              */
          