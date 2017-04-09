
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminevents_Scope0 {
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

class adminevents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Event],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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

                                    <a href=""""),_display_(/*26.47*/routes/*26.53*/.HomeController.adminevents(0)),format.raw/*26.83*/("""" class="list-group-item">All categories</a>

                                """),_display_(/*28.34*/for(c <- categories) yield /*28.54*/ {_display_(Seq[Any](format.raw/*28.56*/("""
                                   """),format.raw/*29.36*/("""<a href=""""),_display_(/*29.46*/routes/*29.52*/.HomeController.adminevents(c.getCatID)),format.raw/*29.91*/("""" class="list-group-item" id="categories">"""),_display_(/*29.134*/c/*29.135*/.getName),format.raw/*29.143*/("""
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
                """),_display_(/*47.18*/if(flash.containsKey("success"))/*47.50*/{_display_(Seq[Any](format.raw/*47.51*/("""
                    """),format.raw/*48.21*/("""<div class="alert alert-success">
                    """),_display_(/*49.22*/flash/*49.27*/.get("success")),format.raw/*49.42*/("""
                    """),format.raw/*50.21*/("""</div>
                """)))}),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""<div class="row"><br>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>

                <div id="products" class="row list-group">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.HomeController.addTicket()),format.raw/*63.64*/("""" class="btn btn-success">
                        <span class="glyphicon glyphicon-plus"></span>Add tickets
                    </a>
                    <br>
                    <br>
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*69.22*/for(e <- events) yield /*69.38*/ {_display_(Seq[Any](format.raw/*69.40*/("""
                        """),format.raw/*70.25*/("""<a href=""""),_display_(/*70.35*/routes/*70.41*/.HomeController.admineventTicket(e.getId)),format.raw/*70.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">

                                    <img class="group list-group-image" src="http://placehold.it/400x250/000/fff" alt="" >
                                    <div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*77.42*/e/*77.43*/.getTitle),format.raw/*77.52*/("""</h4>
                                            """),_display_(/*78.46*/e/*78.47*/.getEventName),format.raw/*78.60*/("""
                                            """),format.raw/*79.45*/("""<br>
                                            """),_display_(/*80.46*/e/*80.47*/.getLocation),format.raw/*80.59*/("""
                                            """),format.raw/*81.45*/("""<br>
                                            """),_display_(/*82.46*/e/*82.47*/.getTime),format.raw/*82.55*/(""" """),format.raw/*82.56*/(""", """),_display_(/*82.59*/e/*82.60*/.getDate),format.raw/*82.68*/("""
                                            """),format.raw/*83.45*/("""<br>
                                            Starting from €
                                        </p>
                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*88.46*/if(user.getRole.equals("admin"))/*88.78*/ {_display_(Seq[Any](format.raw/*88.80*/("""
                                                """),format.raw/*89.49*/("""<a href=""""),_display_(/*89.59*/routes/*89.65*/.HomeController.updateEvent(e.getId)),format.raw/*89.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*92.59*/routes/*92.65*/.HomeController.deleteEvent(e.getId)),format.raw/*92.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*96.46*/("""
                                            """),format.raw/*97.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*106.22*/(""" """),format.raw/*106.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*121.42*/("""{"""),format.raw/*121.43*/("""
                """),format.raw/*122.17*/("""$('#list').click(function(event)"""),format.raw/*122.49*/("""{"""),format.raw/*122.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*122.122*/("""}"""),format.raw/*122.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*123.49*/("""{"""),format.raw/*123.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*123.174*/("""}"""),format.raw/*123.175*/(""");
            """),format.raw/*124.13*/("""}"""),format.raw/*124.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*128.30*/("""{"""),format.raw/*128.31*/("""
            """),format.raw/*129.13*/("""return confirm('Are you sure?');
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""
    """),format.raw/*131.5*/("""</script>
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
object adminevents extends adminevents_Scope0.adminevents
              /*
                  -- GENERATED --
                  DATE: Sun Apr 09 23:58:26 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/adminevents.scala.html
                  HASH: d1b1fcee0a78d0ab5e3209d6c389603f1526e9fd
                  MATRIX: 809->1|992->89|1022->94|1049->113|1088->115|1124->125|2353->1327|2368->1333|2419->1363|2527->1444|2563->1464|2603->1466|2668->1503|2705->1513|2720->1519|2780->1558|2851->1601|2862->1602|2892->1610|2962->1652|3010->1673|3020->1674|3058->1691|3172->1774|3234->1808|3597->2144|3638->2176|3677->2177|3727->2199|3810->2255|3824->2260|3860->2275|3910->2297|3966->2322|4012->2340|4608->2909|4623->2915|4671->2942|4993->3237|5025->3253|5065->3255|5119->3281|5156->3291|5171->3297|5233->3338|5704->3782|5714->3783|5744->3792|5823->3844|5833->3845|5867->3858|5941->3904|6019->3955|6029->3956|6062->3968|6136->4014|6214->4065|6224->4066|6253->4074|6282->4075|6312->4078|6322->4079|6351->4087|6425->4133|6747->4428|6788->4460|6828->4462|6906->4512|6943->4522|6958->4528|7016->4564|7284->4805|7299->4811|7357->4847|7697->5156|7771->5202|8036->5435|8066->5436|8428->5769|8458->5770|8505->5788|8566->5820|8596->5821|8698->5893|8729->5894|8810->5946|8840->5947|8994->6071|9025->6072|9070->6088|9100->6089|9237->6197|9267->6198|9310->6212|9380->6254|9410->6255|9444->6261
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|82->51|83->52|94->63|94->63|94->63|100->69|100->69|100->69|101->70|101->70|101->70|101->70|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|113->82|113->82|113->82|113->82|114->83|119->88|119->88|119->88|120->89|120->89|120->89|120->89|123->92|123->92|123->92|127->96|128->97|137->106|137->106|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|155->124|155->124|159->128|159->128|160->129|161->130|161->130|162->131
                  -- GENERATED --
              */
          