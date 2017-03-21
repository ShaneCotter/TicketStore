
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addTicket_Scope0 {
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

class addTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Add Ticket")/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""

    """),format.raw/*3.5*/("""<div class="container-fluid" id="content">
        <div class="row">
            <div class="col-lg-12 well" id="addEvent">
                    <!-- Start of add event up form-->
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="name">Ticket Type 1:</label>
                        <div class="col-sm-5">
                            <select class="form-control" id="type">
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
                                <option>Seating</option>
                                <option>Standing</option>
                                <option>VIP</option>
                            </select>
                            <input type="name" class="form-control" id="type" placeholder="Enter Price">
                            <input type="name" class="form-control" id="type" placeholder="Enter Stock">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success">Submit</button>
                </form>
            </div>
        </div>
    </div>
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object addTicket extends addTicket_Scope0.addTicket
              /*
                  -- GENERATED --
                  DATE: Tue Mar 21 21:29:34 GMT 2017
                  SOURCE: /home/matthewcleary/Desktop/TicketStore/app/views/addTicket.scala.html
                  HASH: 9099eceffb954274c8fb9e167762ce689792bfe8
                  MATRIX: 835->1|861->19|900->21|932->27|3532->2597
                  LINES: 32->1|32->1|32->1|34->3|82->51
                  -- GENERATED --
              */
          