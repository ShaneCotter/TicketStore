
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

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*48.28*/("""
                """),format.raw/*49.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*55.42*/("""{"""),format.raw/*55.43*/("""
                        """),format.raw/*56.25*/("""return confirm('Are you sure?');
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/("""
            """),format.raw/*58.13*/("""</script>

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
                  DATE: Mon Apr 10 12:22:46 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: 587932d7e7efb7dac3e8bf93757051cc9b9cc91c
                  MATRIX: 815->1|1017->93|1045->112|1073->115|1101->135|1140->137|1171->142|1273->218|1313->250|1351->251|1392->264|1466->311|1480->316|1516->331|1557->344|1604->360|1640->369|1766->468|1850->543|1890->545|1935->562|2023->623|2062->641|2098->659|2111->664|2150->665|2195->682|2325->781|2366->794|2502->903|2512->904|2542->913|2571->914|2601->917|2611->918|2645->931|2714->973|2724->974|2757->986|2826->1028|2836->1029|2865->1037|2994->1139|3027->1156|3067->1158|3116->1179|3263->1299|3273->1300|3308->1314|3521->1500|3531->1501|3561->1510|3893->1811|3938->1828|4057->1919|4086->1920|4139->1945|4220->1998|4249->1999|4290->2012
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|62->32|62->32|62->32|63->33|66->36|66->36|66->36|69->39|69->39|69->39|78->48|79->49|85->55|85->55|86->56|87->57|87->57|88->58
                  -- GENERATED --
              */
          