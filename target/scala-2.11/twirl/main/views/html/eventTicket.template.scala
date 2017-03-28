
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

     object eventTicket_Scope1 {
import helper._

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/{addTicketForm: Form[models.Ticket]}),format.raw/*3.38*/("""





"""),_display_(/*9.2*/main("Welcome to Play")/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
    """),format.raw/*10.5*/("""<!--..CONTENT..-->
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
		  
		  <div class="row well" id="seating">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <img src="assets/img/seatingplan.png" class="img-responsive" alt="seatingplan">
            </div>
            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" id = "seatingform">
            <h2 class = "text-center greentext">Choose your Tickets</h2>
                <div class="form-group">
                    <label for="seat">Seating Block</label>
                    <select class="form-control" id = "seatingselect">
                        <option>A €50.00</option>
                        <option>B</option>
                        <option>C</option>
                        <option>D</option>
                        <option>E</option>
                        <option>F</option>
                        <option>G</option>
                        <option>H</option>
                        <option>I</option>
                        <option>J</option>
                        <option>K</option>
                        <option>L</option>
                        <option>M</option>
                        <option>N</option>
                        <option>O</option>
                        <option>P</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="quantity">Quantity</label>
                    <input type="number" name="quantiy" value="0" min="1" max="99" step="1">
                </div>

                 <div class="form-group">
                   
                    <input type="submit" class = "form-control btn-success" value = "Add To Cart">
                </div>
            </div>
        </div>
            <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*65.22*/for(t <- tickets) yield /*65.39*/ {_display_(Seq[Any](format.raw/*65.41*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.HomeController.eventTicket()),format.raw/*66.70*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">    
                                        <p class="group inner list-group-item-text">
                                            """),_display_(/*73.46*/t/*73.47*/.getTicketType),format.raw/*73.61*/("""
                                            """),_display_(/*74.46*/t/*74.47*/.getPrice),format.raw/*74.56*/("""
                                           
                                        """),format.raw/*76.41*/("""</p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                           

                                                <a href=""""),_display_(/*81.59*/routes/*81.65*/.HomeController.deleteTicket(e.getTicketID)),format.raw/*81.108*/("""" class = "btn-xs btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    """)))}),format.raw/*93.22*/(""" """),format.raw/*93.23*/("""<!-- End of for loop -->

        </div>

        
   <script>
        function confirmDel()"""),format.raw/*99.30*/("""{"""),format.raw/*99.31*/("""
            """),format.raw/*100.13*/("""return confirm('Are you sure?');
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""
    """),format.raw/*102.5*/("""</script>

        <!--END CONTENT-->
       """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket_Scope1.eventTicket
              /*
                  -- GENERATED --
                  DATE: Tue Mar 28 21:01:59 BST 2017
                  SOURCE: C:/Users/Jay/Desktop/TicketStore/app/views/eventTicket.scala.html
                  HASH: 5ac646efceb8224536c498da08eeccf79739ac55
                  MATRIX: 889->21|945->57|983->70|1014->93|1053->95|1086->101|3496->2484|3529->2501|3569->2503|3623->2529|3660->2539|3675->2545|3725->2574|4200->3022|4210->3023|4245->3037|4319->3084|4329->3085|4359->3094|4474->3181|4749->3429|4764->3435|4829->3478|5402->4020|5431->4021|5557->4119|5586->4120|5629->4134|5699->4176|5729->4177|5763->4183
                  LINES: 35->3|35->3|41->9|41->9|41->9|42->10|97->65|97->65|97->65|98->66|98->66|98->66|98->66|105->73|105->73|105->73|106->74|106->74|106->74|108->76|113->81|113->81|113->81|125->93|125->93|131->99|131->99|132->100|133->101|133->101|134->102
                  -- GENERATED --
              */
          