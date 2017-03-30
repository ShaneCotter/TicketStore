
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

class eventTicket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""





"""),_display_(/*9.2*/main("Welcome to Play",user)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
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

          <div class="row well" id="tickets">
            <div class="col-lg-8 col-md-8 col-sm-6 col-xs-12">
                <div class="row">
                    <h1>  </h1>
                    <a href=""""),_display_(/*68.31*/routes/*68.37*/.HomeController.addTicket()),format.raw/*68.64*/("""" class="btn btn-success btn-lg round">Add ticket</a>
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
                        <!-- Start of for loop - Fo reach e in events add a row -->

                        <a href=""""),_display_(/*84.35*/routes/*84.41*/.HomeController.eventTicket()),format.raw/*84.70*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">    
                                        <p class="group inner list-group-item-text">

                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                           


                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    <!-- End of for loop -->

            </div>
            </div>
        </div>

   <script>
        function confirmDel()"""),format.raw/*115.30*/("""{"""),format.raw/*115.31*/("""
            """),format.raw/*116.13*/("""return confirm('Are you sure?');
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""
    """),format.raw/*118.5*/("""</script>

        <!--END CONTENT-->
       """)))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object eventTicket extends eventTicket_Scope0.eventTicket_Scope1.eventTicket
              /*
                  -- GENERATED --
                  DATE: Thu Mar 30 12:35:31 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/eventTicket.scala.html
                  HASH: 8d096bf19bf5f7273499ca7b560f7a4de4b0ac6f
                  MATRIX: 818->19|938->44|970->51|1006->79|1045->81|1077->86|3478->2460|3493->2466|3541->2493|4294->3219|4309->3225|4359->3254|5551->4417|5581->4418|5623->4431|5692->4472|5722->4473|5755->4478
                  LINES: 30->3|35->3|41->9|41->9|41->9|42->10|100->68|100->68|100->68|116->84|116->84|116->84|147->115|147->115|148->116|149->117|149->117|150->118
                  -- GENERATED --
              */
          