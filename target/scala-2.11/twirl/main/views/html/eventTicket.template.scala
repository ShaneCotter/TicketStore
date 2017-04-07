
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

                                </p>
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">

                                    """),_display_(/*36.38*/if(user.getRole.equals("admin"))/*36.70*/ {_display_(Seq[Any](format.raw/*36.72*/("""
                                        """),format.raw/*37.41*/("""<a href=""""),_display_(/*37.51*/routes/*37.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*37.100*/("""" class = "btn btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*40.38*/("""

                                    """),format.raw/*42.37*/("""</div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*46.28*/("""
                """),format.raw/*47.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*53.42*/("""{"""),format.raw/*53.43*/("""
                        """),format.raw/*54.25*/("""return confirm('Are you sure?');
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/("""
            """),format.raw/*56.13*/("""</script>

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
                  DATE: Fri Apr 07 12:01:33 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: e2727c4698c21c81a376f471b3cc5961a1aa6b81
                  MATRIX: 794->1|969->66|999->88|1029->93|1057->113|1096->115|1128->121|1516->482|1526->483|1556->492|1585->493|1615->496|1625->497|1659->510|1729->553|1739->554|1772->566|1842->609|1852->610|1881->618|2016->726|2049->743|2089->745|2139->767|2289->890|2299->891|2334->905|2550->1094|2560->1095|2590->1104|2823->1310|2864->1342|2904->1344|2974->1386|3011->1396|3026->1402|3091->1445|3357->1680|3425->1720|3599->1863|3645->1881|3770->1978|3799->1979|3853->2005|3935->2059|3964->2060|4006->2074
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|45->15|45->15|45->15|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|53->23|53->23|53->23|54->24|57->27|57->27|57->27|60->30|60->30|60->30|66->36|66->36|66->36|67->37|67->37|67->37|67->37|70->40|72->42|76->46|77->47|83->53|83->53|84->54|85->55|85->55|86->56
                  -- GENERATED --
              */
          