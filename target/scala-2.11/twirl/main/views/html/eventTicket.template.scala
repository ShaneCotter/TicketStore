
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

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Ticket],Event,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tickets: List[models.Ticket], e: Event, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Tickets",user)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
                <img src="http://placehold.it/400x250/000/fff" alt="">
            </div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>"""),_display_(/*15.22*/e/*15.23*/.getTitle),format.raw/*15.32*/(""" """),format.raw/*15.33*/(""", """),_display_(/*15.36*/e/*15.37*/.getEventName),format.raw/*15.50*/("""</h1>
                <p>Location here : """),_display_(/*16.37*/e/*16.38*/.getLocation),format.raw/*16.50*/("""</p>
                <p>Date/time here : """),_display_(/*17.38*/e/*17.39*/.getDate),format.raw/*17.47*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

                """),_display_(/*23.18*/for(t <- tickets) yield /*23.35*/ {_display_(Seq[Any](format.raw/*23.37*/("""
                    """),format.raw/*24.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h2>"""),_display_(/*27.34*/t/*27.35*/.getTicketType),format.raw/*27.49*/("""</h2>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                <p>Ticket price : € """),_display_(/*30.54*/t/*30.55*/.getPrice),format.raw/*30.64*/("""</p>

                                <div class="row">
                                    <div class="col-xs-12 col-md-6">

                                    """),_display_(/*35.38*/if(user.getRole.equals("admin"))/*35.70*/ {_display_(Seq[Any](format.raw/*35.72*/("""
                                        """),format.raw/*36.41*/("""<a href=""""),_display_(/*36.51*/routes/*36.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*36.100*/("""" class = "btn btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*39.38*/("""

                                    """),format.raw/*41.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*45.28*/("""
                """),format.raw/*46.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*52.42*/("""{"""),format.raw/*52.43*/("""
                        """),format.raw/*53.25*/("""return confirm('Are you sure?');
                    """),format.raw/*54.21*/("""}"""),format.raw/*54.22*/("""
            """),format.raw/*55.13*/("""</script>

                <!--END CONTENT-->
""")))}))
      }
    }
  }

  def render(tickets:List[models.Ticket],e:Event,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(tickets,e,user)

  def f:((List[models.Ticket],Event,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (tickets,e,user) => apply(tickets,e,user)

  def ref: this.type = this

}


}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket
              /*
                  -- GENERATED --
                  DATE: Fri Apr 07 13:23:12 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: b49e7c736544233b5adc9b0eea5730ed4369bf63
                  MATRIX: 794->1|969->66|997->85|1025->88|1053->108|1092->110|1123->115|1503->468|1513->469|1543->478|1572->479|1602->482|1612->483|1646->496|1715->538|1725->539|1758->551|1827->593|1837->594|1866->602|1995->704|2028->721|2068->723|2117->744|2264->864|2274->865|2309->879|2522->1065|2532->1066|2562->1075|2752->1238|2793->1270|2833->1272|2902->1313|2939->1323|2954->1329|3019->1372|3282->1604|3348->1642|3518->1781|3563->1798|3682->1889|3711->1890|3764->1915|3845->1968|3874->1969|3915->1982
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|45->15|45->15|45->15|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|53->23|53->23|53->23|54->24|57->27|57->27|57->27|60->30|60->30|60->30|65->35|65->35|65->35|66->36|66->36|66->36|66->36|69->39|71->41|75->45|76->46|82->52|82->52|83->53|84->54|84->54|85->55
                  -- GENERATED --
              */
          