
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Events")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
	
	
"""),format.raw/*6.1*/("""<!--..CONTENT..-->
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
        <!-- Start of for loop - Fo reach e in events add a row -->
	"""),_display_(/*77.3*/for(e <- events) yield /*77.19*/ {_display_(Seq[Any](format.raw/*77.21*/("""
	"""),format.raw/*78.2*/("""<a href=""""),_display_(/*78.12*/routes/*78.18*/.HomeController.eventTicket()),format.raw/*78.47*/("""">
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
			
                <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        """),_display_(/*85.26*/e/*85.27*/.getTitle),format.raw/*85.36*/("""</h4>
                    <p class="group inner list-group-item-text">
                        """),_display_(/*87.26*/e/*87.27*/.getEventName),format.raw/*87.40*/("""
						"""),_display_(/*88.8*/e/*88.9*/.getLocation),format.raw/*88.21*/("""
						"""),_display_(/*89.8*/e/*89.9*/.getDate),format.raw/*89.17*/("""
						"""),_display_(/*90.8*/e/*90.9*/.getPrice),format.raw/*90.18*/("""</p>
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
    """)))}),format.raw/*106.6*/(""" """),format.raw/*106.7*/("""<!-- End of for loop -->
		
		
                        <div class="col-xs-12 col-md-6">
                        
                        </div>
                    </div>
                </div>
            </div>
        </div>

<!--END CONTENT-->

<!--Script for displaying products in grid/list-->
<script>
$(document).ready(function() """),format.raw/*121.30*/("""{"""),format.raw/*121.31*/("""
    """),format.raw/*122.5*/("""$('#list').click(function(event)"""),format.raw/*122.37*/("""{"""),format.raw/*122.38*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*122.110*/("""}"""),format.raw/*122.111*/(""");
    $('#grid').click(function(event)"""),format.raw/*123.37*/("""{"""),format.raw/*123.38*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*123.162*/("""}"""),format.raw/*123.163*/(""");
"""),format.raw/*124.1*/("""}"""),format.raw/*124.2*/(""");</script>
""")))}),format.raw/*125.2*/("""


"""))
      }
    }
  }

  def render(events:List[models.Event]): play.twirl.api.HtmlFormat.Appendable = apply(events)

  def f:((List[models.Event]) => play.twirl.api.HtmlFormat.Appendable) = (events) => apply(events)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Thu Mar 16 14:03:45 GMT 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/events.scala.html
                  HASH: 2f01b6d0d91c8039dcda0c48507400d6bee5117d
                  MATRIX: 759->1|882->29|910->32|932->46|971->48|1002->53|3758->2783|3790->2799|3830->2801|3859->2803|3896->2813|3911->2819|3961->2848|4312->3172|4322->3173|4352->3182|4475->3278|4485->3279|4519->3292|4553->3300|4562->3301|4595->3313|4629->3321|4638->3322|4667->3330|4701->3338|4710->3339|4740->3348|5233->3810|5262->3811|5629->4149|5659->4150|5692->4155|5753->4187|5783->4188|5885->4260|5916->4261|5984->4300|6014->4301|6168->4425|6199->4426|6230->4429|6259->4430|6303->4443
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|108->77|108->77|108->77|109->78|109->78|109->78|109->78|116->85|116->85|116->85|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|137->106|137->106|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|155->124|155->124|156->125
                  -- GENERATED --
              */
          