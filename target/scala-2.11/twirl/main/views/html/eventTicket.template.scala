
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

"""),_display_(/*6.2*/main("Tickets",user)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        """),_display_(/*9.10*/if(flash.containsKey("success"))/*9.42*/{_display_(Seq[Any](format.raw/*9.43*/("""
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
                <p>Location here : """),_display_(/*25.37*/e/*25.38*/.getLocation),format.raw/*25.50*/("""</p>
                <p>Date/time here : """),_display_(/*26.38*/e/*26.39*/.getDate),format.raw/*26.47*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

                """),_display_(/*32.18*/for(t <- tickets) yield /*32.35*/ {_display_(Seq[Any](format.raw/*32.37*/("""
                    """),format.raw/*33.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h2>"""),_display_(/*36.34*/t/*36.35*/.getTicketType),format.raw/*36.49*/("""</h2>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                <p>Ticket price : € """),_display_(/*39.54*/t/*39.55*/.getPrice),format.raw/*39.64*/("""</p>

                                <div class="row">
                                    <div class="col-xs-12 col-md-6">
                                        """),_display_(/*43.42*/if(t.getQuantity > 0)/*43.63*/ {_display_(Seq[Any](format.raw/*43.65*/("""
                                            """),format.raw/*44.45*/("""<a href=""""),_display_(/*44.55*/routes/*44.61*/.ShoppingCtrl.addToBasket(t.getTicketID())),format.raw/*44.103*/("""" class = "btn btn-success">
                                                Add to Basket</a>
                                        """)))}/*46.43*/else/*46.47*/{_display_(Seq[Any](format.raw/*46.48*/("""
                                            """),format.raw/*47.45*/("""<button class = "btn btn-danger">
                                                Out of Stock </button>
                                        """)))}),format.raw/*49.42*/("""
                                    """),format.raw/*50.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*54.28*/("""
                """),format.raw/*55.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*61.42*/("""{"""),format.raw/*61.43*/("""
                        """),format.raw/*62.25*/("""return confirm('Are you sure?');
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""
            """),format.raw/*64.13*/("""</script>

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
                  DATE: Tue Apr 11 15:02:59 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: b30e3800d4fece0729435cd9d631e417a3c4f9a9
                  MATRIX: 815->1|1017->93|1047->115|1077->120|1105->140|1144->142|1176->148|1280->226|1320->258|1358->259|1400->273|1475->321|1489->326|1525->341|1567->355|1615->372|1652->382|1780->483|1864->558|1904->560|1950->578|2038->639|2077->657|2114->676|2127->681|2166->682|2212->700|2343->800|2385->814|2524->926|2534->927|2564->936|2593->937|2623->940|2633->941|2667->954|2737->997|2747->998|2780->1010|2850->1053|2860->1054|2889->1062|3024->1170|3057->1187|3097->1189|3147->1211|3297->1334|3307->1335|3342->1349|3558->1538|3568->1539|3598->1548|3795->1718|3825->1739|3865->1741|3939->1787|3976->1797|3991->1803|4055->1845|4212->1984|4225->1988|4264->1989|4338->2035|4517->2183|4583->2221|4757->2364|4803->2382|4928->2479|4957->2480|5011->2506|5093->2560|5122->2561|5164->2575
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|62->32|62->32|62->32|63->33|66->36|66->36|66->36|69->39|69->39|69->39|73->43|73->43|73->43|74->44|74->44|74->44|74->44|76->46|76->46|76->46|77->47|79->49|80->50|84->54|85->55|91->61|91->61|92->62|93->63|93->63|94->64
                  -- GENERATED --
              */
          