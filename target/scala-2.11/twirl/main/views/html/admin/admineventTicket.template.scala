
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
                  DATE: Thu Apr 20 14:13:34 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admin/admineventTicket.scala.html
                  HASH: 4244333bd1185fd44f3c0cd7dac984b8027e1f19
                  MATRIX: 831->1|1033->93|1063->115|1093->120|1122->141|1161->143|1193->149|1297->227|1337->259|1376->261|1418->275|1505->335|1519->340|1555->355|1597->369|1645->386|1682->396|1810->497|1894->572|1934->574|1980->592|2068->653|2107->671|2144->690|2157->695|2196->696|2242->714|2373->814|2415->828|2552->938|2562->939|2592->948|2622->951|2632->952|2666->965|2720->992|2730->993|2763->1005|2816->1031|2826->1032|2855->1040|2885->1043|2895->1044|2924->1052|2991->1092|3006->1098|3054->1125|3380->1424|3413->1441|3453->1443|3499->1461|3822->1757|3832->1758|3862->1767|3891->1768|3921->1771|3931->1772|3965->1785|4050->1843|4060->1844|4095->1858|4124->1859|4299->2007|4347->2034|4574->2234|4584->2235|4621->2250|4717->2319|4758->2351|4798->2353|4860->2387|4897->2397|4912->2403|4976->2446|5196->2639|5211->2645|5275->2688|5551->2933|5609->2963|5689->3016|5719->3037|5759->3039|5817->3069|5854->3079|5869->3085|5932->3127|6070->3247|6083->3252|6122->3253|6180->3283|6344->3416|6398->3442|6514->3527|6547->3533|6635->3593|6664->3594|6710->3612|6815->3689|6844->3690|6877->3696
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|66->36|66->36|66->36|67->37|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|75->45|75->45|78->48|78->48|78->48|81->51|81->51|81->51|82->52|82->52|82->52|82->52|85->55|85->55|85->55|89->59|92->62|93->63|93->63|93->63|94->64|94->64|94->64|94->64|96->66|96->66|96->66|97->67|99->69|100->70|103->73|104->74|108->78|108->78|109->79|110->80|110->80|111->81
                  -- GENERATED --
              */
          