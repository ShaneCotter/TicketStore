
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

            """),_display_(/*36.14*/for(t <- tickets) yield /*36.31*/ {_display_(Seq[Any](format.raw/*36.33*/("""
                """),format.raw/*37.17*/("""<div class="col-md-4 text-center">
                    <div class="panel panel-success panel-pricing">
                        <div class="panel-heading">
                            <i class="fa fa-ticket whitetext" aria-hidden="true"></i>
                            <h3 class="whitetext">"""),_display_(/*41.52*/e/*41.53*/.getTitle),format.raw/*41.62*/(""" """),format.raw/*41.63*/(""": """),_display_(/*41.66*/e/*41.67*/.getEventName),format.raw/*41.80*/("""</h3>
                            <h3 class="whitetext">"""),_display_(/*42.52*/t/*42.53*/.getTicketType),format.raw/*42.67*/(""" """),format.raw/*42.68*/("""ticket</h3>
                        </div>
                        <div class="panel-body text-center">
                            <p><strong>€ """),_display_(/*45.43*/("%.2f".format(t.getPrice))),format.raw/*45.70*/("""</strong></p>
                        </div>
                        <ul class="list-group text-center">
                            <li class="list-group-item"><i class="fa fa-info-circle "></i> """),_display_(/*48.93*/t/*48.94*/.getDescription),format.raw/*48.109*/("""</li>
                        </ul>
                        <div class="panel-footer">
                        """),_display_(/*51.26*/if(t.getQuantity > 0)/*51.47*/ {_display_(Seq[Any](format.raw/*51.49*/("""
                            """),format.raw/*52.29*/("""<a href=""""),_display_(/*52.39*/routes/*52.45*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*52.87*/("""" class="btn btn-lg btn-block btn-success">
                                Add to Cart</a>
                        """)))}/*54.27*/else/*54.32*/{_display_(Seq[Any](format.raw/*54.33*/("""
                            """),format.raw/*55.29*/("""<button class = "btn btn-lg btn-block btn-danger">
                                Out of Stock </button>
                        """)))}),format.raw/*57.26*/("""
                        """),format.raw/*58.25*/("""</div>
                    </div>
                </div><!-- /ticket -->
        """)))}),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""</div>


    <script>
            function confirmDel() """),format.raw/*66.35*/("""{"""),format.raw/*66.36*/("""
                """),format.raw/*67.17*/("""return confirm('Are you sure?');
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/("""
    """),format.raw/*69.5*/("""</script>

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
                  DATE: Tue Apr 18 13:59:50 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: dbe7bf78fe7e396d215d8500ec0fc554e0860138
                  MATRIX: 831->1|1033->93|1063->115|1093->120|1122->141|1161->143|1193->149|1297->227|1337->259|1376->261|1418->275|1493->323|1507->328|1543->343|1585->357|1633->374|1670->384|1798->485|1882->560|1922->562|1968->580|2056->641|2095->659|2132->678|2145->683|2184->684|2230->702|2361->802|2403->816|2540->926|2550->927|2580->936|2610->939|2620->940|2654->953|2708->980|2718->981|2751->993|2804->1019|2814->1020|2843->1028|2873->1031|2883->1032|2912->1040|2979->1080|2994->1086|3042->1113|3368->1412|3401->1429|3441->1431|3487->1449|3810->1745|3820->1746|3850->1755|3879->1756|3909->1759|3919->1760|3953->1773|4038->1831|4048->1832|4083->1846|4112->1847|4288->1996|4336->2023|4563->2223|4573->2224|4610->2239|4752->2354|4782->2375|4822->2377|4880->2407|4917->2417|4932->2423|4995->2465|5133->2585|5146->2590|5185->2591|5243->2621|5407->2754|5461->2780|5577->2865|5610->2871|5698->2931|5727->2932|5773->2950|5847->2996|5876->2997|5909->3003
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|66->36|66->36|66->36|67->37|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|75->45|75->45|78->48|78->48|78->48|81->51|81->51|81->51|82->52|82->52|82->52|82->52|84->54|84->54|84->54|85->55|87->57|88->58|91->61|92->62|96->66|96->66|97->67|98->68|98->68|99->69
                  -- GENERATED --
              */
          