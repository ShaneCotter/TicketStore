
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

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>""")))}),format.raw/*44.28*/("""
                """),format.raw/*45.17*/("""</div>
            </div>



            <script>
                    function confirmDel()"""),format.raw/*51.42*/("""{"""),format.raw/*51.43*/("""
                        """),format.raw/*52.25*/("""return confirm('Are you sure?');
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/("""
            """),format.raw/*54.13*/("""</script>

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
                  DATE: Sun Apr 09 23:00:09 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: 77087775576411d2fd1f2f3c5215a1d0d3a6730c
                  MATRIX: 794->1|969->66|999->88|1029->93|1057->113|1096->115|1128->121|1232->199|1272->231|1310->232|1352->246|1427->294|1441->299|1477->314|1519->328|1567->345|1604->355|1915->639|1925->640|1955->649|1984->650|2014->653|2024->654|2058->667|2128->710|2138->711|2171->723|2241->766|2251->767|2280->775|2415->883|2448->900|2488->902|2538->924|2688->1047|2698->1048|2733->1062|2949->1251|2959->1252|2989->1261|3330->1571|3376->1589|3501->1686|3530->1687|3584->1713|3666->1767|3695->1768|3737->1782
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|50->20|50->20|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|58->28|58->28|58->28|59->29|62->32|62->32|62->32|65->35|65->35|65->35|74->44|75->45|81->51|81->51|82->52|83->53|83->53|84->54
                  -- GENERATED --
              */
          