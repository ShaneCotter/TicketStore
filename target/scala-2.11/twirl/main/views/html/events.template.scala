
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object events_Scope0 {
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome to Play")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
	
	
"""),format.raw/*4.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="eventContent">
<div class="row">
  <div class="col-sm-3">
    <div class="sidebar-nav">
      <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <span class="visible-xs navbar-brand">Sidebar menu</span>
        </div>
        <div class="navbar-collapse collapse sidebar-navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#"><h3>EVENT CATEGORIES</h3></a></li>
            <li><a href="#"><h4>Music</h4></a></li>
			<li><a href="#"><h4>Sports</h4></a></li>
			<li><a href="#"><h4>Comedy</h4></a></li>
			<li><a href="#"><h4>Theatre</h4></a></li>
			<li><a href="#"><h4>Racing</h4></a></li>
			<li class="active"><a href="#"><h3>BY COUNTRY</h3></a></li>
			<li><a href="#"><h4>Ireland</h4></a></li>
			<li><a href="#"><h4>UK</h4></a></li>
			
			<li class="active"><a href="#"><h3>BY MONTH</h3></a></li>
            
                <li><a href="#"><h4>January</h4></a></li>
                <li><a href="#"><h4>February</h4></a></li>
                <li><a href="#"><h4>March</h4></a></li>
                <li><a href="#"><h4>April</h4></a></li>
                <li><a href="#"><h4>May</h4></a></li>
                <li><a href="#"><h4>June</h4></a></li>
                <li><a href="#"><h4>July</h4></a></li>
				<li><a href="#"><h4>August</h4></a></li>
				<li><a href="#"><h4>September</h4></a></li>
				<li><a href="#"><h4>October</h4></a></li>
				<li><a href="#"><h4>November</h4></a></li>
				<li><a href="#"><h4>December</h4></a></li>
              </ul>
			  <br>
			  <br>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
  </div>
  
  
  <!--Main content--->
  <div class="col-sm-9">
    <div class="row">
	<h1> Events </h1>
	 <a href="addEvent.scala.html" class="btn btn-success btn-lg round">Add event</a>
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
	
	<a href="eventTicket.scala.html"
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
			
                <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Event title</h4>
                    <p class="group inner list-group-item-text">
                        Event name : $
						Location: $
						Date: $
						Description: $</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                Starting from €95.00</p>
                        </div>
						
						
                        <div class="col-xs-12 col-md-6">
                        
                        </div>
                    </div>
                </div>
            </div>
        </div>
		</a>
		
		
                        <div class="col-xs-12 col-md-6">
                        
                        </div>
                    </div>
                </div>
            </div>
        </div>

<!--END CONTENT-->

<!--Script for displaying products in grid/list-->
<script>
$(document).ready(function() """),format.raw/*117.30*/("""{"""),format.raw/*117.31*/("""
    """),format.raw/*118.5*/("""$('#list').click(function(event)"""),format.raw/*118.37*/("""{"""),format.raw/*118.38*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*118.110*/("""}"""),format.raw/*118.111*/(""");
    $('#grid').click(function(event)"""),format.raw/*119.37*/("""{"""),format.raw/*119.38*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*119.162*/("""}"""),format.raw/*119.163*/(""");
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/(""");</script>

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
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Wed Mar 15 11:47:18 GMT 2017
                  SOURCE: /home/wdd/Desktop/TicketStore/app/views/events.scala.html
                  HASH: ff53857bc2450a62490012631e74671f2a3c0f64
                  MATRIX: 829->1|860->24|899->26|930->31|4912->3984|4942->3985|4975->3990|5036->4022|5066->4023|5168->4095|5199->4096|5267->4135|5297->4136|5451->4260|5482->4261|5513->4264|5542->4265
                  LINES: 32->1|32->1|32->1|35->4|148->117|148->117|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|150->119|151->120|151->120
                  -- GENERATED --
              */
          