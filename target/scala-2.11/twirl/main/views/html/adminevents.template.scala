
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
            <br>
            <br>
            <br>
            <div class="col-sm-9">
                """),_display_(/*50.18*/if(flash.containsKey("success"))/*50.50*/{_display_(Seq[Any](format.raw/*50.51*/("""
                    """),format.raw/*51.21*/("""<div class="alert alert-success">
                    """),_display_(/*52.22*/flash/*52.27*/.get("success")),format.raw/*52.42*/("""
                    """),format.raw/*53.21*/("""</div>
                """)))}),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""<div class="row"><br>
                    <strong>Display</strong>
                    <div class="btn-group">
                        <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
                        </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                    class="glyphicon glyphicon-th"></span>Grid</a>
                    </div>
                </div>
                <br>

                <div id="products" class="row list-group">
                    <a href=""""),_display_(/*66.31*/routes/*66.37*/.HomeController.addTicket()),format.raw/*66.64*/("""" class="btn btn-success">
                        <span class="glyphicon glyphicon-plus"></span>Add tickets
                    </a>
                    <br>
                    <br>
                        <!-- Start of for loop - Fo reach e in events add a row -->
                    """),_display_(/*72.22*/for(e <- events) yield /*72.38*/ {_display_(Seq[Any](format.raw/*72.40*/("""
                        """),format.raw/*73.25*/("""<a href=""""),_display_(/*73.35*/routes/*73.41*/.HomeController.admineventTicket(e.getId)),format.raw/*73.82*/("""">
                            <div class="item  col-xs-4 col-lg-4">
                                <div class="thumbnail">
                                    """),_display_(/*76.38*/if(env.resource("public/images/eventImages/" + e.getId + ".jpg").isDefined)/*76.113*/ {_display_(Seq[Any](format.raw/*76.115*/("""
                                        """),format.raw/*77.41*/("""<img class="img-responsive" src="/assets/images/eventImages/"""),_display_(/*77.102*/(e.getId + ".jpg")),format.raw/*77.120*/(""""/>
                                    """)))}/*78.39*/else/*78.44*/{_display_(Seq[Any](format.raw/*78.45*/("""
                                        """),format.raw/*79.41*/("""<img class="img-responsive" src="/assets/images/eventImages/noImage.png" alt="" >
                                    """)))}),format.raw/*80.38*/("""
                                    """),format.raw/*81.37*/("""<div class="caption">
                                        <h4 class="group inner list-group-item-heading">
                                        """),_display_(/*83.42*/e/*83.43*/.getTitle),format.raw/*83.52*/("""</h4>
                                            <h4>"""),_display_(/*84.50*/e/*84.51*/.getEventName),format.raw/*84.64*/("""</h4>

                                            <h4>Location : """),_display_(/*86.61*/e/*86.62*/.getLocation),format.raw/*86.74*/("""</h4>

                                            <h4>"""),_display_(/*88.50*/e/*88.51*/.getTime),format.raw/*88.59*/(""" """),format.raw/*88.60*/(""", """),_display_(/*88.63*/e/*88.64*/.getDate),format.raw/*88.72*/("""</h4>

                                            <h5>"""),_display_(/*90.50*/e/*90.51*/.calcLowestPrice),format.raw/*90.67*/("""</h5>

                                        <div class="row">
                                            <div class="col-xs-12 col-md-6">
                                            """),_display_(/*94.46*/if(user.getRole.equals("admin"))/*94.78*/ {_display_(Seq[Any](format.raw/*94.80*/("""
                                                """),format.raw/*95.49*/("""<a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.updateEvent(e.getId)),format.raw/*95.101*/("""" class="btn btn-danger">
                                                    <span class="glyphicon glyphicon-wrench"></span>
                                                </a>
                                                <a href=""""),_display_(/*98.59*/routes/*98.65*/.HomeController.deleteEvent(e.getId)),format.raw/*98.101*/("""" class = "btn btn-danger"
                                                onclick="return confirmDel();">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                </a>
                                            """)))}),format.raw/*102.46*/("""
                                            """),format.raw/*103.45*/("""</div>


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>

                    """)))}),format.raw/*112.22*/(""" """),format.raw/*112.23*/("""<!-- End of for loop -->


                    <div class="col-xs-12 col-md-6">

                    </div>
                </div>
            </div>
        </div>
    </div>

        <!--END CONTENT-->

        <!--Script for displaying products in grid/list-->
    <script>
            $(document).ready(function() """),format.raw/*127.42*/("""{"""),format.raw/*127.43*/("""
                """),format.raw/*128.17*/("""$('#list').click(function(event)"""),format.raw/*128.49*/("""{"""),format.raw/*128.50*/("""event.preventDefault();$('#products .item').addClass('list-group-item');"""),format.raw/*128.122*/("""}"""),format.raw/*128.123*/(""");
                $('#grid').click(function(event)"""),format.raw/*129.49*/("""{"""),format.raw/*129.50*/("""event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');"""),format.raw/*129.174*/("""}"""),format.raw/*129.175*/(""");
            """),format.raw/*130.13*/("""}"""),format.raw/*130.14*/(""");</script>

    <!--Script for confirming delete of event-->
    <script>
        function confirmDel()"""),format.raw/*134.30*/("""{"""),format.raw/*134.31*/("""
            """),format.raw/*135.13*/("""return confirm('Are you sure?');
        """),format.raw/*136.9*/("""}"""),format.raw/*136.10*/("""
    """),format.raw/*137.5*/("""</script>
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
                  DATE: Tue Apr 11 12:42:33 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/adminevents.scala.html
                  HASH: daca1eadf1261db81214421f831d14ac38187aa9
                  MATRIX: 830->1|1041->116|1071->121|1098->140|1137->142|1173->152|2402->1354|2417->1360|2468->1390|2576->1471|2612->1491|2652->1493|2717->1530|2754->1540|2769->1546|2829->1585|2900->1628|2911->1629|2941->1637|3011->1679|3059->1700|3069->1701|3107->1718|3221->1801|3283->1835|3700->2225|3741->2257|3780->2258|3830->2280|3913->2336|3927->2341|3963->2356|4013->2378|4069->2403|4115->2421|4711->2990|4726->2996|4774->3023|5096->3318|5128->3334|5168->3336|5222->3362|5259->3372|5274->3378|5336->3419|5528->3584|5613->3659|5654->3661|5724->3703|5813->3764|5853->3782|5914->3825|5927->3830|5966->3831|6036->3873|6187->3993|6253->4031|6434->4185|6444->4186|6474->4195|6557->4251|6567->4252|6601->4265|6697->4334|6707->4335|6740->4347|6825->4405|6835->4406|6864->4414|6893->4415|6923->4418|6933->4419|6962->4427|7047->4485|7057->4486|7094->4502|7312->4693|7353->4725|7393->4727|7471->4777|7508->4787|7523->4793|7581->4829|7849->5070|7864->5076|7922->5112|8263->5421|8338->5467|8603->5700|8633->5701|8995->6034|9025->6035|9072->6053|9133->6085|9163->6086|9265->6158|9296->6159|9377->6211|9407->6212|9561->6336|9592->6337|9637->6353|9667->6354|9804->6462|9834->6463|9877->6477|9947->6519|9977->6520|10011->6526
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|63->32|64->33|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|85->54|86->55|97->66|97->66|97->66|103->72|103->72|103->72|104->73|104->73|104->73|104->73|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|112->81|114->83|114->83|114->83|115->84|115->84|115->84|117->86|117->86|117->86|119->88|119->88|119->88|119->88|119->88|119->88|119->88|121->90|121->90|121->90|125->94|125->94|125->94|126->95|126->95|126->95|126->95|129->98|129->98|129->98|133->102|134->103|143->112|143->112|158->127|158->127|159->128|159->128|159->128|159->128|159->128|160->129|160->129|160->129|160->129|161->130|161->130|165->134|165->134|166->135|167->136|167->136|168->137
                  -- GENERATED --
              */
          