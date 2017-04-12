
package views.html.admin

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

"""),_display_(/*6.2*/main("Tickets", user)/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <br>
        <br>
        <br>
        """),_display_(/*12.10*/if(flash.containsKey("success"))/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
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

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id="eventInfo">
                <h1>"""),_display_(/*27.22*/e/*27.23*/.getTitle),format.raw/*27.32*/(""", """),_display_(/*27.35*/e/*27.36*/.getEventName),format.raw/*27.49*/("""</h1>
                <p>"""),_display_(/*28.21*/e/*28.22*/.getLocation),format.raw/*28.34*/("""</p>
                <p>"""),_display_(/*29.21*/e/*29.22*/.getDate),format.raw/*29.30*/(""", """),_display_(/*29.33*/e/*29.34*/.getTime),format.raw/*29.42*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

        """),_display_(/*35.10*/for(t <- tickets) yield /*35.27*/ {_display_(Seq[Any](format.raw/*35.29*/("""
            """),format.raw/*36.13*/("""<div class="item  col-xs-4 col-lg-4">
                <div class="thumbnail">

                    <h2>"""),_display_(/*39.26*/t/*39.27*/.getTicketType),format.raw/*39.41*/("""</h2>
                    <div class="caption">
                        <p class="group inner list-group-item-text">
                    <p>€"""),_display_(/*42.26*/t/*42.27*/.getPrice),format.raw/*42.36*/("""</p>

                        <div class="row">
                            <div class="col-xs-12 col-md-6">
                            """),_display_(/*46.30*/if(user.getRole.equals("admin"))/*46.62*/ {_display_(Seq[Any](format.raw/*46.64*/("""
                                """),format.raw/*47.33*/("""<a href=""""),_display_(/*47.43*/routes/*47.49*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*47.92*/("""" class = "btn btn-danger"
                                onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span></a>
                            """)))}),format.raw/*50.30*/("""
                            """),format.raw/*51.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*56.10*/("""
        """),format.raw/*57.9*/("""</div>
    </div>


    <script>
            function confirmDel() """),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
                """),format.raw/*63.17*/("""return confirm('Are you sure?');
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
    """),format.raw/*65.5*/("""</script>

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
                  DATE: Wed Apr 12 13:31:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: b9d66df04493f0d095130ab55941f5c098a53d88
                  MATRIX: 831->1|1033->93|1061->112|1089->115|1118->136|1157->138|1188->143|1330->258|1371->290|1411->292|1452->305|1526->352|1540->357|1576->372|1617->385|1664->401|1700->410|1826->509|1910->584|1950->586|1995->603|2083->664|2122->682|2158->700|2171->705|2210->706|2255->723|2385->822|2426->835|2560->942|2570->943|2600->952|2630->955|2640->956|2674->969|2727->995|2737->996|2770->1008|2822->1033|2832->1034|2861->1042|2891->1045|2901->1046|2930->1054|3051->1148|3084->1165|3124->1167|3165->1180|3296->1284|3306->1285|3341->1299|3510->1441|3520->1442|3550->1451|3715->1589|3756->1621|3796->1623|3857->1656|3894->1666|3909->1672|3973->1715|4212->1923|4269->1952|4416->2068|4452->2077|4547->2144|4576->2145|4621->2162|4694->2207|4723->2208|4755->2213
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|54->24|57->27|57->27|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|65->35|65->35|65->35|66->36|69->39|69->39|69->39|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|77->47|80->50|81->51|86->56|87->57|92->62|92->62|93->63|94->64|94->64|95->65
                  -- GENERATED --
              */
          