
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
	 <a href=""""),_display_(/*62.13*/routes/*62.19*/.HomeController.addEvent()),format.raw/*62.45*/("""" class="btn btn-success btn-lg round">Add event</a>
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
                    """),format.raw/*90.21*/("""</p>
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
                  DATE: Tue Mar 21 20:47:33 GMT 2017
                  SOURCE: /home/matthewcleary/Desktop/TicketStore/app/views/events.scala.html
                  HASH: 8aa521d86770af89220abac5095551203391f4f7
                  MATRIX: 759->1|882->29|910->32|932->46|971->48|1002->53|3192->2216|3207->2222|3254->2248|3829->2797|3861->2813|3901->2815|3930->2817|3967->2827|3982->2833|4032->2862|4383->3186|4393->3187|4423->3196|4546->3292|4556->3293|4590->3306|4624->3314|4633->3315|4666->3327|4700->3335|4709->3336|4738->3344|4787->3365|5280->3827|5309->3828|5676->4166|5706->4167|5739->4172|5800->4204|5830->4205|5932->4277|5963->4278|6031->4317|6061->4318|6215->4442|6246->4443|6277->4446|6306->4447|6350->4460
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|93->62|93->62|93->62|108->77|108->77|108->77|109->78|109->78|109->78|109->78|116->85|116->85|116->85|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|137->106|137->106|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|155->124|155->124|156->125
                  -- GENERATED --
              */
          