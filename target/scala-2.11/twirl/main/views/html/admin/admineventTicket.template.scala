
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
            """),format.raw/*10.13*/("""<div class="alert alert-success text-center">
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
                            <p><strong>€"""),_display_(/*45.42*/("%.2f".format(t.getPrice))),format.raw/*45.69*/("""</strong></p>
                        </div>
                        <ul class="list-group text-center">
                            <li class="list-group-item"><i class="fa fa-info-circle "></i> """),_display_(/*48.93*/t/*48.94*/.getDescription),format.raw/*48.109*/("""</li>
                        </ul>

                            """),_display_(/*51.30*/if(user.getRole.equals("admin"))/*51.62*/ {_display_(Seq[Any](format.raw/*51.64*/("""
                                """),format.raw/*52.33*/("""<a href=""""),_display_(/*52.43*/routes/*52.49*/.HomeController.updateTicket(t.getTicketID)),format.raw/*52.92*/("""" class="btn btn-danger">
                                    <span class="glyphicon glyphicon-wrench"></span>
                                </a>
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*55.92*/("""" class = "btn btn-danger"
                                onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            """)))}),format.raw/*59.30*/("""


                        """),format.raw/*62.25*/("""<div class="panel-footer">
                        """),_display_(/*63.26*/if(t.getQuantity > 0)/*63.47*/ {_display_(Seq[Any](format.raw/*63.49*/("""
                            """),format.raw/*64.29*/("""<a href=""""),_display_(/*64.39*/routes/*64.45*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*64.87*/("""" class="btn btn-lg btn-block btn-success">
                                Add to Cart</a>
                        """)))}/*66.27*/else/*66.32*/{_display_(Seq[Any](format.raw/*66.33*/("""
                            """),format.raw/*67.29*/("""<button class = "btn btn-lg btn-block btn-danger">
                                Out of Stock </button>
                        """)))}),format.raw/*69.26*/("""
                        """),format.raw/*70.25*/("""</div>
                    </div>
                </div><!-- /ticket -->
        """)))}),format.raw/*73.10*/("""
    """),format.raw/*74.5*/("""</div>


    <script>
            function confirmDel() """),format.raw/*78.35*/("""{"""),format.raw/*78.36*/("""
                """),format.raw/*79.17*/("""return confirm('Are you sure you want to delete this ticket?');
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""
    """),format.raw/*81.5*/("""</script>

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
                  DATE: Fri Apr 21 12:03:38 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: 35f05e527e82d1a17ed6895d0d4f7cef0d14d7eb
                  MATRIX: 831->1|1033->93|1061->112|1089->115|1118->136|1157->138|1188->143|1290->219|1330->251|1369->253|1410->266|1496->325|1510->330|1546->345|1587->358|1634->374|1670->383|1796->482|1880->557|1920->559|1965->576|2053->637|2092->655|2128->673|2141->678|2180->679|2225->696|2355->795|2396->808|2530->915|2540->916|2570->925|2600->928|2610->929|2644->942|2697->968|2707->969|2740->981|2792->1006|2802->1007|2831->1015|2861->1018|2871->1019|2900->1027|2966->1066|2981->1072|3029->1099|3346->1389|3379->1406|3419->1408|3464->1425|3783->1717|3793->1718|3823->1727|3852->1728|3882->1731|3892->1732|3926->1745|4010->1802|4020->1803|4055->1817|4084->1818|4256->1963|4304->1990|4528->2187|4538->2188|4575->2203|4668->2269|4709->2301|4749->2303|4810->2336|4847->2346|4862->2352|4926->2395|5143->2585|5158->2591|5222->2634|5494->2875|5549->2902|5628->2954|5658->2975|5698->2977|5755->3006|5792->3016|5807->3022|5870->3064|6006->3182|6019->3187|6058->3188|6115->3217|6277->3348|6330->3373|6443->3455|6475->3460|6559->3516|6588->3517|6633->3534|6737->3610|6766->3611|6798->3616
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|66->36|66->36|66->36|67->37|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|75->45|75->45|78->48|78->48|78->48|81->51|81->51|81->51|82->52|82->52|82->52|82->52|85->55|85->55|85->55|89->59|92->62|93->63|93->63|93->63|94->64|94->64|94->64|94->64|96->66|96->66|96->66|97->67|99->69|100->70|103->73|104->74|108->78|108->78|109->79|110->80|110->80|111->81
                  -- GENERATED --
              */
          