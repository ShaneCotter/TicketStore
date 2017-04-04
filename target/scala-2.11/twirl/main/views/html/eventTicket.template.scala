
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
"""),_display_(/*5.2*/(user: models.users.User)),format.raw/*5.27*/("""





"""),_display_(/*11.2*/main("Welcome to Play",user)/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
    """),format.raw/*12.5*/("""<!--..CONTENT..-->
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
                    <h1>  </h1>
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.addTicket()),format.raw/*31.64*/("""" class="btn btn-success btn-lg round">Add ticket</a>
                    <br>
                    <br>
                    <strong>Display</strong>

                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>

                <div id="products" class="row list-group">
                """),_display_(/*45.18*/for(t <- tickets) yield /*45.35*/ {_display_(Seq[Any](format.raw/*45.37*/("""
                    """),format.raw/*46.21*/("""<div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">

                            <h1>"""),_display_(/*49.34*/t/*49.35*/.getTicketType),format.raw/*49.49*/("""</h1>
                            <div class="caption">
                                <p class="group inner list-group-item-text">
                                    """),_display_(/*52.38*/t/*52.39*/.getPrice),format.raw/*52.48*/("""

                                """),format.raw/*54.33*/("""</p>
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">


                                        <a href=""""),_display_(/*59.51*/routes/*59.57*/.HomeController.deleteTicket(t.getTicketID)),format.raw/*59.100*/("""" class = "btn-xs btn-danger"
                                        onclick="return confirmDel();">
                                            <span class="glyphicon glyphicon-trash"></span></a>

                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
          </div>
        """)))}),format.raw/*72.10*/("""


   """),format.raw/*75.4*/("""<script>
        function confirmDel()"""),format.raw/*76.30*/("""{"""),format.raw/*76.31*/("""
            """),format.raw/*77.13*/("""return confirm('Are you sure?');
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
    """),format.raw/*79.5*/("""</script>

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
                  DATE: Tue Apr 04 11:02:53 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: b6e36751f44167365ac05e5a74070ffb37fbc33d
                  MATRIX: 788->1|952->55|980->74|1007->76|1052->101|1085->108|1122->136|1162->138|1194->143|1862->784|1877->790|1925->817|2580->1445|2613->1462|2653->1464|2702->1485|2849->1605|2859->1606|2894->1620|3091->1790|3101->1791|3131->1800|3193->1834|3396->2010|3411->2016|3476->2059|3932->2484|3965->2490|4031->2528|4060->2529|4101->2542|4169->2583|4198->2584|4230->2589
                  LINES: 27->1|32->1|34->4|35->5|35->5|41->11|41->11|41->11|42->12|61->31|61->31|61->31|75->45|75->45|75->45|76->46|79->49|79->49|79->49|82->52|82->52|82->52|84->54|89->59|89->59|89->59|102->72|105->75|106->76|106->76|107->77|108->78|108->78|109->79
                  -- GENERATED --
              */
          