
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

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Ticket],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tickets: List[models.Ticket],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Tickets",user)/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<!--..CONTENT..-->
    <div class="container" id = "seatingplans">
        <div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
                <img src="http://placehold.it/400x250/000/fff" alt="">
            </div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>Event name</h1>
                <p>Location here : </p>
                <p>Date/time here : </p>
                <p>Description here : </p>
            </div>
        </div>

        <div class="row well" id="tickets">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <div class="row">

                </div>
                <br>
                </div>

                <div id="products" class="row list-group">
                """),_display_(/*31.18*/for(t <- tickets) yield /*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
                    """),format.raw/*32.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h1>"""),_display_(/*35.34*/t/*35.35*/.getTicketType),format.raw/*35.49*/("""</h1>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                """),_display_(/*38.34*/t/*38.35*/.getPrice),format.raw/*38.44*/("""

                                """),format.raw/*40.33*/("""</p>
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">

                                    """),_display_(/*44.38*/if(user.getRole.equals("admin"))/*44.70*/ {_display_(Seq[Any](format.raw/*44.72*/("""
                                        """),format.raw/*45.41*/("""<a href=""""),_display_(/*45.51*/routes/*45.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*45.100*/("""" class = "btn-xs btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*48.38*/("""

                                    """),format.raw/*50.37*/("""</div>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            """)))}),format.raw/*59.14*/("""


            """),format.raw/*62.13*/("""<script>
                    function confirmDel()"""),format.raw/*63.42*/("""{"""),format.raw/*63.43*/("""
                        """),format.raw/*64.25*/("""return confirm('Are you sure?');
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/("""
            """),format.raw/*66.13*/("""</script>

                <!--END CONTENT-->
""")))}))
      }
    }
  }

  def render(tickets:List[models.Ticket],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(tickets,user)

  def f:((List[models.Ticket],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (tickets,user) => apply(tickets,user)

  def ref: this.type = this

}


}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket
              /*
                  -- GENERATED --
                  DATE: Thu Apr 06 14:59:54 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: 97858d50d7472cc4cc679272d98c56bce703a886
                  MATRIX: 788->1|952->55|980->74|1008->77|1036->97|1075->99|1106->104|1946->917|1979->934|2019->936|2068->957|2215->1077|2225->1078|2260->1092|2453->1258|2463->1259|2493->1268|2555->1302|2744->1464|2785->1496|2825->1498|2894->1539|2931->1549|2946->1555|3011->1598|3277->1833|3343->1871|3570->2067|3613->2082|3691->2132|3720->2133|3773->2158|3854->2211|3883->2212|3924->2225
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|61->31|61->31|61->31|62->32|65->35|65->35|65->35|68->38|68->38|68->38|70->40|74->44|74->44|74->44|75->45|75->45|75->45|75->45|78->48|80->50|89->59|92->62|93->63|93->63|94->64|95->65|95->65|96->66
                  -- GENERATED --
              */
          