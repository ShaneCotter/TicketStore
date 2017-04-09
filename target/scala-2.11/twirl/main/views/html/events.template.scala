
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

class events extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Event],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

"""),_display_(/*3.2*/main("Events",user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""


    """),format.raw/*6.5*/("""<!--..CONTENT..-->
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
                                <h3 class="greentext ">EVENT CATEGORIES</h3>
                                <div class="list-group">

                                    <a href=""""),_display_(/*26.47*/routes/*26.53*/.HomeController.events(0)),format.raw/*26.78*/("""" class="list-group-item">All categories</a>

                                """),_display_(/*28.34*/for(c <- categories) yield /*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                                   """),format.raw/*29.36*/("""<a href=""""),_display_(/*29.46*/routes/*29.52*/.HomeController.events(c.getCatID)),format.raw/*29.86*/("""" class="list-group-item" id="categories">"""),_display_(/*29.129*/c/*29.130*/.getName),format.raw/*29.138*/("""
                                        """),format.raw/*30.41*/("""<span class="badge">"""),_display_(/*30.62*/c/*30.63*/.getEvents.size()),format.raw/*30.80*/("""</span>
                                   </a>
                                """)))}),format.raw/*32.34*/("""
                                """),format.raw/*33.33*/("""</div>
                            </ul>
                            <br>
                            <br>
                        </div><!--/.nav-collapse -->
                    </div>
                </div>
            </div>




                <!--Main content--->
            <div class="col-sm-9">

                <div class="row"><br>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                    """),_display_(/*55.22*/if(flash.containsKey("success"))/*55.54*/{_display_(Seq[Any](format.raw/*55.55*/("""
                        """),format.raw/*56.25*/("""<div class="alert alert-success">
                        """),_display_(/*57.26*/flash/*57.31*/.get("success")),format.raw/*57.46*/("""
                        """),format.raw/*58.25*/("""</div>
                    """)))}),format.raw/*59.22*/("""
                """),format.raw/*60.17*/("""</div>
                <br>

                <div id="products" class="row list-group">
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*65.22*/for(e <- events) yield /*65.38*/ {_display_(Seq[Any](format.raw/*65.40*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.HomeController.eventTicket(e.getId)),format.raw/*66.77*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*73.42*/e/*73.43*/.getTitle),format.raw/*73.52*/("""</h4>
                                            """),_display_(/*74.46*/e/*74.47*/.getEventName),format.raw/*74.60*/("""
                                            """),format.raw/*75.45*/("""<br>
                                            """),_display_(/*76.46*/e/*76.47*/.getLocation),format.raw/*76.59*/("""
                                            """),format.raw/*77.45*/("""<br>
                                            """),_display_(/*78.46*/e/*78.47*/.getTime),format.raw/*78.55*/(""" """),format.raw/*78.56*/(""", """),_display_(/*78.59*/e/*78.60*/.getDate),format.raw/*78.68*/("""
                                            """),format.raw/*79.45*/("""<br>
                                            """),_display_(/*80.46*/e/*80.47*/.calcLowestPrice),format.raw/*80.63*/("""
                                        """),format.raw/*81.41*/("""</p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            </div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*93.22*/(""" """),format.raw/*93.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*108.42*/("""{"""),format.raw/*108.43*/("""
                """),format.raw/*109.17*/("""$('#list').click(function(event)"""),format.raw/*109.49*/("""{"""),format.raw/*109.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*109.122*/("""}"""),format.raw/*109.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*110.49*/("""{"""),format.raw/*110.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*110.174*/("""}"""),format.raw/*110.175*/(""");
            """),format.raw/*111.13*/("""}"""),format.raw/*111.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*115.30*/("""{"""),format.raw/*115.31*/("""
            """),format.raw/*116.13*/("""return confirm('Are you sure?');
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""
    """),format.raw/*118.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user)

  def f:((List[models.Event],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user) => apply(events,categories,user)

  def ref: this.type = this

}


}

/**/
object events extends events_Scope0.events
              /*
                  -- GENERATED --
                  DATE: Sun Apr 09 23:49:16 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/events.scala.html
                  HASH: 9c6b1032585fcbac3af0d06a8a988758f184a4c5
                  MATRIX: 799->1|982->89|1012->94|1039->113|1078->115|1114->125|2343->1327|2358->1333|2404->1358|2512->1439|2548->1459|2588->1461|2653->1498|2690->1508|2705->1514|2760->1548|2831->1591|2842->1592|2872->1600|2942->1642|2990->1663|3000->1664|3038->1681|3152->1764|3214->1798|4030->2587|4071->2619|4110->2620|4164->2646|4251->2706|4265->2711|4301->2726|4355->2752|4415->2781|4461->2799|4686->2997|4718->3013|4758->3015|4812->3041|4849->3051|4864->3057|4921->3093|5392->3537|5402->3538|5432->3547|5511->3599|5521->3600|5555->3613|5629->3659|5707->3710|5717->3711|5750->3723|5824->3769|5902->3820|5912->3821|5941->3829|5970->3830|6000->3833|6010->3834|6039->3842|6113->3888|6191->3939|6201->3940|6238->3956|6308->3998|6759->4418|6788->4419|7150->4752|7180->4753|7227->4771|7288->4803|7318->4804|7420->4876|7451->4877|7532->4929|7562->4930|7716->5054|7747->5055|7792->5071|7822->5072|7959->5180|7989->5181|8032->5195|8102->5237|8132->5238|8166->5244
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|86->55|86->55|86->55|87->56|88->57|88->57|88->57|89->58|90->59|91->60|96->65|96->65|96->65|97->66|97->66|97->66|97->66|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|124->93|124->93|139->108|139->108|140->109|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|142->111|142->111|146->115|146->115|147->116|148->117|148->117|149->118
                  -- GENERATED --
              */
          