
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

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id="eventInfo">
                <h1>"""),_display_(/*24.22*/e/*24.23*/.getTitle),format.raw/*24.32*/(""", """),_display_(/*24.35*/e/*24.36*/.getEventName),format.raw/*24.49*/("""</h1>
                <p>"""),_display_(/*25.21*/e/*25.22*/.getLocation),format.raw/*25.34*/("""</p>
                <p>"""),_display_(/*26.21*/e/*26.22*/.getDate),format.raw/*26.30*/(""", """),_display_(/*26.33*/e/*26.34*/.getTime),format.raw/*26.42*/("""</p>
                <p><a><a href = """"),_display_(/*27.35*/routes/*27.41*/.HomeController.addTicket()),format.raw/*27.68*/("""" type="button" class="btn btn-success btn-md" >
                    <span class="glyphicon glyphicon-plus"></span>Add Ticket
                 </a></p>
            </div>
        </div>

        <div class="row well" id="tickets">
        <h1 class="text-center">Tickets</h1>

        """),_display_(/*36.10*/for(t <- tickets) yield /*36.27*/ {_display_(Seq[Any](format.raw/*36.29*/("""
            """),format.raw/*37.13*/("""<div class="col-md-4 text-center">
                <div class="panel panel-success panel-pricing">
                    <div class="panel-heading">
                        <i class="fa fa-ticket whitetext" aria-hidden="true"></i>
                        <h3 class="whitetext">"""),_display_(/*41.48*/e/*41.49*/.getTitle),format.raw/*41.58*/(""" """),format.raw/*41.59*/(""": """),_display_(/*41.62*/e/*41.63*/.getEventName),format.raw/*41.76*/("""</h3>
                        <h3 class="whitetext">"""),_display_(/*42.48*/t/*42.49*/.getTicketType),format.raw/*42.63*/(""" """),format.raw/*42.64*/("""ticket</h3>
                    </div>
                    <div class="panel-body text-center">
                        <p><strong>€ """),_display_(/*45.39*/t/*45.40*/.getPrice),format.raw/*45.49*/("""</strong></p>
                    </div>
                    <div class="panel-footer">
                    """),_display_(/*48.22*/if(user.getRole.equals("admin"))/*48.54*/ {_display_(Seq[Any](format.raw/*48.56*/("""
                        """),format.raw/*49.25*/("""<a href=""""),_display_(/*49.35*/routes/*49.41*/.HomeController.updateTicket(t.getTicketID)),format.raw/*49.84*/("""" class="btn btn-danger">
                            <span class="glyphicon glyphicon-wrench"></span>
                        </a>
                        <a href=""""),_display_(/*52.35*/routes/*52.41*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*52.84*/("""" class = "btn btn-danger"
                        onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span></a>
                    """)))}),format.raw/*55.22*/("""
                    """),format.raw/*56.21*/("""</div>
                </div>
            </div><!-- /ticket -->
        """)))}),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""</div>


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
object admineventTicket extends admineventTicket_Scope0.admineventTicket
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 11:45:57 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: 7d2ed1e08228bf1dad3c1fe19e7dd6b05f8cfe99
                  MATRIX: 831->1|1033->93|1061->112|1089->115|1118->136|1157->138|1188->143|1290->219|1330->251|1369->253|1410->266|1484->313|1498->318|1534->333|1575->346|1622->362|1658->371|1784->470|1868->545|1908->547|1953->564|2041->625|2080->643|2116->661|2129->666|2168->667|2213->684|2343->783|2384->796|2518->903|2528->904|2558->913|2588->916|2598->917|2632->930|2685->956|2695->957|2728->969|2780->994|2790->995|2819->1003|2849->1006|2859->1007|2888->1015|2954->1054|2969->1060|3017->1087|3330->1373|3363->1390|3403->1392|3444->1405|3747->1681|3757->1682|3787->1691|3816->1692|3846->1695|3856->1696|3890->1709|3970->1762|3980->1763|4015->1777|4044->1778|4205->1912|4215->1913|4245->1922|4381->2031|4422->2063|4462->2065|4515->2090|4552->2100|4567->2106|4631->2149|4824->2315|4839->2321|4903->2364|5118->2548|5167->2569|5272->2643|5304->2648|5388->2704|5417->2705|5462->2722|5535->2767|5564->2768|5596->2773
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|66->36|66->36|66->36|67->37|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|75->45|75->45|75->45|78->48|78->48|78->48|79->49|79->49|79->49|79->49|82->52|82->52|82->52|85->55|86->56|89->59|90->60|94->64|94->64|95->65|96->66|96->66|97->67
                  -- GENERATED --
              */
          