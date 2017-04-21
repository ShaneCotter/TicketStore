
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""

    """),format.raw/*4.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="indexContent">
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>

                <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("images/crowd1.jpg")),format.raw/*18.76*/("""" alt="Ed " class="img img-responsive">
                    <div class="carousel-caption">
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.events(1)),format.raw/*20.66*/(""""><h1>Concerts</h1></a>
                        <h2>TC Events - The Biggest Events at the Best Prices</h2>
                    </div>
                </div>

                <div class="item" >
                    <img src=""""),_display_(/*26.32*/routes/*26.38*/.Assets.versioned("images/crowd2.jpg")),format.raw/*26.76*/("""" alt="" class="img img-responsive">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*28.37*/routes/*28.43*/.HomeController.events(2)),format.raw/*28.68*/(""""><h1>Sports</h1></a>
                    </div>
                </div>

                <div class="item" >
                    <img src=""""),_display_(/*33.32*/routes/*33.38*/.Assets.versioned("images/crowd3.jpg")),format.raw/*33.76*/("""" alt="" class="img img-responsive">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*35.37*/routes/*35.43*/.HomeController.events(5)),format.raw/*35.68*/(""""><h1>Race Days</h1></a>
                    </div>
                </div>

                <div class="item">
                    <img src=""""),_display_(/*40.32*/routes/*40.38*/.Assets.versioned("images/crowd4.jpg")),format.raw/*40.76*/("""" alt="" class="img img-responsive">
                    <div class="carousel-caption">
                        <a href = """"),_display_(/*42.37*/routes/*42.43*/.HomeController.events(4)),format.raw/*42.68*/(""""><h1>Theatre</h1></a>
                    </div>
                </div>
            </div>

                <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

    </div>
        <!--END CONTENT-->

""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Apr 21 12:29:58 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/index.scala.html
                  HASH: ba32be134ed5e2e83db7c2344dbd62749b202abd
                  MATRIX: 756->1|876->26|903->28|929->46|968->48|1000->54|1740->767|1755->773|1814->811|1966->936|1981->942|2027->967|2279->1192|2294->1198|2353->1236|2504->1360|2519->1366|2565->1391|2732->1531|2747->1537|2806->1575|2957->1699|2972->1705|3018->1730|3187->1872|3202->1878|3261->1916|3412->2040|3427->2046|3473->2071|4215->2783
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|49->18|49->18|49->18|51->20|51->20|51->20|57->26|57->26|57->26|59->28|59->28|59->28|64->33|64->33|64->33|66->35|66->35|66->35|71->40|71->40|71->40|73->42|73->42|73->42|92->61
                  -- GENERATED --
              */
          