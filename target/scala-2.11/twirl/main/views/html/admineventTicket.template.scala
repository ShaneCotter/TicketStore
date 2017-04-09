
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

class admineventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Ticket],Event,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
        """),_display_(/*9.10*/if(flash.containsKey("success"))/*9.42*/{_display_(Seq[Any](format.raw/*9.43*/("""
            """),format.raw/*10.13*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
            """),format.raw/*12.13*/("""</div>
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""<div class="row well">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
                <img src="http://placehold.it/400x250/000/fff" alt="">
            </div>

            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12" id = "eventInfo">
                <h1>"""),_display_(/*20.22*/e/*20.23*/.getTitle),format.raw/*20.32*/(""" """),format.raw/*20.33*/(""", """),_display_(/*20.36*/e/*20.37*/.getEventName),format.raw/*20.50*/("""</h1>
                <p>Location here : """),_display_(/*21.37*/e/*21.38*/.getLocation),format.raw/*21.50*/("""</p>
                <p>Date/time here : """),_display_(/*22.38*/e/*22.39*/.getDate),format.raw/*22.47*/("""</p>
            </div>
        </div>

        <div class="row well" id="tickets">

                """),_display_(/*28.18*/for(t <- tickets) yield /*28.35*/ {_display_(Seq[Any](format.raw/*28.37*/("""
                    """),format.raw/*29.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h2>"""),_display_(/*32.34*/t/*32.35*/.getTicketType),format.raw/*32.49*/("""</h2>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                <p>Ticket price : € """),_display_(/*35.54*/t/*35.55*/.getPrice),format.raw/*35.64*/("""</p>

                                <div class="row">
                                    <div class="col-xs-12 col-md-6">
                                    """),_display_(/*39.38*/if(user.getRole.equals("admin"))/*39.70*/ {_display_(Seq[Any](format.raw/*39.72*/("""
                                        """),format.raw/*40.41*/("""<a href=""""),_display_(/*40.51*/routes/*40.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*40.100*/("""" class = "btn btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>
                                    """)))}),format.raw/*43.38*/("""
                                    """),format.raw/*44.37*/("""</div>
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

  def render(tickets:List[models.Ticket],e:Event,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(tickets,e,user)

  def f:((List[models.Ticket],Event,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (tickets,e,user) => apply(tickets,e,user)

  def ref: this.type = this

}


}

/**/
object admineventTicket extends admineventTicket_Scope0.admineventTicket
              /*
                  -- GENERATED --
                  DATE: Sun Apr 09 23:00:09 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/admineventTicket.scala.html
                  HASH: a9ca79dca363b1971faedf2e9e4606336aef756c
                  MATRIX: 804->1|979->66|1009->88|1039->93|1067->113|1106->115|1138->121|1242->199|1282->231|1320->232|1362->246|1437->294|1451->299|1487->314|1529->328|1577->345|1614->355|1925->639|1935->640|1965->649|1994->650|2024->653|2034->654|2068->667|2138->710|2148->711|2181->723|2251->766|2261->767|2290->775|2425->883|2458->900|2498->902|2548->924|2698->1047|2708->1048|2743->1062|2959->1251|2969->1252|2999->1261|3192->1427|3233->1459|3273->1461|3343->1503|3380->1513|3395->1519|3460->1562|3726->1797|3792->1835|3966->1978|4012->1996|4137->2093|4166->2094|4220->2120|4302->2174|4331->2175|4373->2189
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|50->20|50->20|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|58->28|58->28|58->28|59->29|62->32|62->32|62->32|65->35|65->35|65->35|69->39|69->39|69->39|70->40|70->40|70->40|70->40|73->43|74->44|78->48|79->49|85->55|85->55|86->56|87->57|87->57|88->58
                  -- GENERATED --
              */
          