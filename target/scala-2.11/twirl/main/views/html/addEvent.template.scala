
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addEvent_Scope0 {
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

class addEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
<h1>Add Event Page</h1>


<div class="row">
<div class="col-lg-12 well" id="addEvent">
<!-- Start of add event up form-->
		<form class="form-horizontal">

	<!--Name field--><div class="form-group">
					<label class="control-label col-sm-2" for="name">Name:</label>
					<div class="col-sm-5">
					<input type="name" class="form-control" id="name" placeholder="Enter Name">
					</div>
				    </div>

	<!--Date field--><div class="form-group">
					<label class="control-label col-sm-2" for="date">Date:</label>
					<div class="col-sm-5">
					<input type="date" class="form-control" id="date" placeholder="Enter date">
					</div>
				    </div>

	<!--Time field--><div class="form-group">
					<label class="control-label col-sm-2" for="time">Time:</label>
					<div class="col-sm-5">
						<input type="action" class="form-control" id="time"></input>
					</div>
				</div>

<!--Location field--><div class="form-group">
					<label class="control-label col-sm-2" for="location">Location:</label>
					<div class="col-sm-5">
					<select class="form-control" id="location">
						<option>Ireland</option>
						<option>U.K.</option>
					</select>
					</div>
				    </div>

<!--Category field--><div class="form-group">
						<label class="control-label col-sm-2" for="category">Category:</label>
						<div class="col-sm-5">
						<select class="form-control" id="category">
							<option>Music</option>
							<option>Sports</option>
							<option>Theatre</option>
							<option>Comedy</option>
							<option>Racing</option>
						</select>
						</div>
					</div>

<!--Price field 	<div class="form-group">
						<label class="control-label col-sm-2" for="price">Price:</label>
						<div class="col-sm-5">
						<input type="price" class="form-control" id="price" placeholder="Enter Price">
						</div>
					</div>-->


<!--Stock field 	<div class="form-group">
						<label class="control-label col-sm-2" for="stock">Stock:</label>
						<div class="col-sm-5">
						<input type="stock" class="form-control" id="stock" placeholder="Enter Stock">
						</div>
					</div>-->

<!--Description field--><div class="form-group">
							<label class="control-label col-sm-2" for="description">Description:</label>
							<div class="col-sm-5">
							<textarea class="form-control" rows="4" id="description"></textarea>
							</div>
						</div>

<!--Ticket Type		<div class="form-group">
							<label class="control-label col-sm-2" for="name">Ticket Type 1:</label>
							<div class="col-sm-5">
							<select class="form-control" id="type">
							<option>Choose Type</option>
							<option>Seating</option>
							<option>Standing</option>
							<option>VIP</option>
							</select>
							<input type="name" class="form-control" id="type" placeholder="Enter Price">
							<input type="name" class="form-control" id="type" placeholder="Enter Stock">
							</div>
				    	</div>

				    	<div class="form-group">
							<label class="control-label col-sm-2" for="name">Ticket Type 2:</label>
							<div class="col-sm-5">
							<select class="form-control" id="type">
							<option>Choose Type</option>
							<option>Seating</option>
							<option>Standing</option>
							<option>VIP</option>
							</select>
							<input type="name" class="form-control" id="type" placeholder="Enter Price">
							<input type="name" class="form-control" id="type" placeholder="Enter Stock">
							</div>
				    	</div>

				    	<div class="form-group">
							<label class="control-label col-sm-2" for="name">Ticket Type 3:</label>
							<div class="col-sm-5">
							<select class="form-control" id="type">
							<option>Choose Type</option>
							<option>Seating</option>
							<option>Standing</option>
							<option>VIP</option>
							</select>
							<input type="name" class="form-control" id="type" placeholder="Enter Price">
							<input type="name" class="form-control" id="type" placeholder="Enter Stock">
							</div>
				    	</div> --
				
<!--Button for submit--><button type="submit" class="btn btn-success">Submit</button>
					
				</div>
			</form>
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
object addEvent extends addEvent_Scope0.addEvent
              /*
                  -- GENERATED --
                  DATE: Thu Mar 23 18:27:15 GMT 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addEvent.scala.html
                  HASH: 884acf9cdb957da5fbb72cede5c314f292ed6a1e
                  MATRIX: 833->1|864->24|903->26|931->28
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          