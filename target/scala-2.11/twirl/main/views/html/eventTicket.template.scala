
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

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
    """),format.raw/*2.5*/("""<!--..CONTENT..-->
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
        </div>
		</div>
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

/**/
object eventTicket extends eventTicket_Scope0.eventTicket
              /*
                  -- GENERATED --
                  DATE: Thu Mar 16 10:31:09 GMT 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: 5af2c20cd98caf530b85fc491b34fd1a0637f749
                  MATRIX: 839->1|870->24|909->26|940->31
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          