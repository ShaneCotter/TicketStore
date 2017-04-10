
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

class adminevents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Event],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Event], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

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
                                    """),_display_(/*73.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*73.113*/ {_display_(Seq[Any](format.raw/*73.115*/("""
                                        """),format.raw/*74.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*74.102*/(e.getId + ".jpg")),format.raw/*74.120*/(""""/>
                                    """)))}/*75.39*/else/*75.44*/{_display_(Seq[Any](format.raw/*75.45*/("""
                                        """),format.raw/*76.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*77.38*/("""
                                    """),format.raw/*78.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*80.42*/e/*80.43*/.getTitle),format.raw/*80.52*/("""</h4>
                                            <h4>"""),_display_(/*81.50*/e/*81.51*/.getEventName),format.raw/*81.64*/("""</h4>

                                            <h4>Location : """),_display_(/*83.61*/e/*83.62*/.getLocation),format.raw/*83.74*/("""</h4>

                                            <h4>"""),_display_(/*85.50*/e/*85.51*/.getTime),format.raw/*85.59*/(""" """),format.raw/*85.60*/(""", """),_display_(/*85.63*/e/*85.64*/.getDate),format.raw/*85.72*/("""</h4>

                                            <h5>"""),_display_(/*87.50*/e/*87.51*/.calcLowestPrice),format.raw/*87.67*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*91.46*/if(user.getRole.equals("admin"))/*91.78*/ {_display_(Seq[Any](format.raw/*91.80*/("""
                                                """),format.raw/*92.49*/("""<a href=""""),_display_(/*92.59*/routes/*92.65*/.HomeController.updateEvent(e.getId)),format.raw/*92.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.deleteEvent(e.getId)),format.raw/*95.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*99.46*/("""
                                            """),format.raw/*100.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*109.22*/(""" """),format.raw/*109.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*124.42*/("""{"""),format.raw/*124.43*/("""
                """),format.raw/*125.17*/("""$('#list').click(function(event)"""),format.raw/*125.49*/("""{"""),format.raw/*125.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*125.122*/("""}"""),format.raw/*125.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*126.49*/("""{"""),format.raw/*126.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*126.174*/("""}"""),format.raw/*126.175*/(""");
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*131.30*/("""{"""),format.raw/*131.31*/("""
            """),format.raw/*132.13*/("""return confirm('Are you sure?');
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
    """),format.raw/*134.5*/("""</script>
""")))}))
      }
    }
  }

  def render(events:List[models.Event],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(events,categories,user,env)

  def f:((List[models.Event],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (events,categories,user,env) => apply(events,categories,user,env)

  def ref: this.type = this

}


}

/**/
object adminevents extends adminevents_Scope0.adminevents
              /*
                  -- GENERATED --
                  DATE: Mon Apr 10 13:40:43 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/adminevents.scala.html
                  HASH: b773f8fb549aa94cbd76d72d47693afcf3b7d241
                  MATRIX: 830->1|1041->116|1071->121|1098->140|1137->142|1173->152|2402->1354|2417->1360|2468->1390|2576->1471|2612->1491|2652->1493|2717->1530|2754->1540|2769->1546|2829->1585|2900->1628|2911->1629|2941->1637|3011->1679|3059->1700|3069->1701|3107->1718|3221->1801|3283->1835|3646->2171|3687->2203|3726->2204|3776->2226|3859->2282|3873->2287|3909->2302|3959->2324|4015->2349|4061->2367|4657->2936|4672->2942|4720->2969|5042->3264|5074->3280|5114->3282|5168->3308|5205->3318|5220->3324|5282->3365|5474->3530|5559->3605|5600->3607|5670->3649|5759->3710|5799->3728|5860->3771|5873->3776|5912->3777|5982->3819|6133->3939|6199->3977|6380->4131|6390->4132|6420->4141|6503->4197|6513->4198|6547->4211|6643->4280|6653->4281|6686->4293|6771->4351|6781->4352|6810->4360|6839->4361|6869->4364|6879->4365|6908->4373|6993->4431|7003->4432|7040->4448|7258->4639|7299->4671|7339->4673|7417->4723|7454->4733|7469->4739|7527->4775|7795->5016|7810->5022|7868->5058|8208->5367|8283->5413|8548->5646|8578->5647|8940->5980|8970->5981|9017->5999|9078->6031|9108->6032|9210->6104|9241->6105|9322->6157|9352->6158|9506->6282|9537->6283|9582->6299|9612->6300|9749->6408|9779->6409|9822->6423|9892->6465|9922->6466|9956->6472
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|82->51|83->52|94->63|94->63|94->63|100->69|100->69|100->69|101->70|101->70|101->70|101->70|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|108->77|109->78|111->80|111->80|111->80|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|116->85|116->85|116->85|116->85|116->85|118->87|118->87|118->87|122->91|122->91|122->91|123->92|123->92|123->92|123->92|126->95|126->95|126->95|130->99|131->100|140->109|140->109|155->124|155->124|156->125|156->125|156->125|156->125|156->125|157->126|157->126|157->126|157->126|158->127|158->127|162->131|162->131|163->132|164->133|164->133|165->134
                  -- GENERATED --
              */
          