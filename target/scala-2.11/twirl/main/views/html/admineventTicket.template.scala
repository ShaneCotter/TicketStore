
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
                                    """),_display_(/*43.38*/if(user.getRole.equals("admin"))/*43.70*/ {_display_(Seq[Any](format.raw/*43.72*/("""
                                        """),format.raw/*44.41*/("""<a href=""""),_display_(/*44.51*/routes/*44.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*44.100*/("""" class = "btn btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*47.38*/("""
                                    """),format.raw/*48.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*52.28*/("""
                """),format.raw/*53.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*59.42*/("""{"""),format.raw/*59.43*/("""
                        """),format.raw/*60.25*/("""return confirm('Are you sure?');
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""
            """),format.raw/*62.13*/("""</script>

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
                  DATE: Mon Apr 10 13:40:43 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admineventTicket.scala.html
                  HASH: 4c0f0c24f66e246793ddf77ccec135021faba2d6
                  MATRIX: 825->1|1027->93|1057->115|1087->120|1115->140|1154->142|1186->148|1290->226|1330->258|1368->259|1410->273|1485->321|1499->326|1535->341|1577->355|1625->372|1662->382|1790->483|1874->558|1914->560|1960->578|2048->639|2087->657|2124->676|2137->681|2176->682|2222->700|2353->800|2395->814|2534->926|2544->927|2574->936|2603->937|2633->940|2643->941|2677->954|2747->997|2757->998|2790->1010|2860->1053|2870->1054|2899->1062|3034->1170|3067->1187|3107->1189|3157->1211|3307->1334|3317->1335|3352->1349|3568->1538|3578->1539|3608->1548|3801->1714|3842->1746|3882->1748|3952->1790|3989->1800|4004->1806|4069->1849|4335->2084|4401->2122|4575->2265|4621->2283|4746->2380|4775->2381|4829->2407|4911->2461|4940->2462|4982->2476
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|62->32|62->32|62->32|63->33|66->36|66->36|66->36|69->39|69->39|69->39|73->43|73->43|73->43|74->44|74->44|74->44|74->44|77->47|78->48|82->52|83->53|89->59|89->59|90->60|91->61|91->61|92->62
                  -- GENERATED --
              */
          