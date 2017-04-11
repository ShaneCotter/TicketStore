
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
                    <p>Ticket price : € """),_display_(/*42.42*/t/*42.43*/.getPrice),format.raw/*42.52*/("""</p>

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
                  DATE: Tue Apr 11 23:43:50 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: 7197e5add9c74728cc59690017b5bbda65c70690
                  MATRIX: 831->1|1033->93|1063->115|1093->120|1122->141|1161->143|1193->149|1340->269|1381->301|1421->303|1463->317|1538->365|1552->370|1588->385|1630->399|1678->416|1715->426|1843->527|1927->602|1967->604|2013->622|2101->683|2140->701|2177->720|2190->725|2229->726|2275->744|2406->844|2448->858|2585->968|2595->969|2625->978|2655->981|2665->982|2699->995|2753->1022|2763->1023|2796->1035|2849->1061|2859->1062|2888->1070|2918->1073|2928->1074|2957->1082|3084->1182|3117->1199|3157->1201|3199->1215|3333->1322|3343->1323|3378->1337|3566->1498|3576->1499|3606->1508|3775->1650|3816->1682|3856->1684|3918->1718|3955->1728|3970->1734|4034->1777|4276->1988|4334->2018|4486->2139|4523->2149|4623->2221|4652->2222|4698->2240|4772->2286|4801->2287|4834->2293
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|54->24|57->27|57->27|57->27|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|65->35|65->35|65->35|66->36|69->39|69->39|69->39|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|77->47|80->50|81->51|86->56|87->57|92->62|92->62|93->63|94->64|94->64|95->65
                  -- GENERATED --
              */
          