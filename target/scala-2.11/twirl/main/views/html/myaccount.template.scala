
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myaccount_Scope0 {
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

class myaccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
    """),_display_(/*2.6*/main("myAccount",user)/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""


    """),format.raw/*5.5*/("""<div class="container" id="content">
        <h1>Edit Profile</h1>
        <hr>
        <div class="row">
                <!-- left column -->
            <div class="col-md-3 pull-left">
                <div class="text-center">
                    <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                    <h6>Upload a different photo...</h6>

                    <input type="file" class="form-control">
                </div>
            </div>

                <!-- edit form column -->
            """),_display_(/*20.14*/if(flash.containsKey("success"))/*20.46*/{_display_(Seq[Any](format.raw/*20.47*/("""
                """),format.raw/*21.17*/("""<div class="alert alert-success">
                """),_display_(/*22.18*/flash/*22.23*/.get("success")),format.raw/*22.38*/("""
                """),format.raw/*23.17*/("""</div>
            """)))}),format.raw/*24.14*/("""
                """),format.raw/*25.17*/("""<h3>Personal info</h3>

                <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Email:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value=""""),_display_(/*31.81*/user/*31.85*/.getEmail()),format.raw/*31.96*/("""" readonly>
                            </div>
                        </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">Name:</label>
                        <div class="col-lg-8">
                            <input class="form-control" type="text" value=""""),_display_(/*38.77*/user/*38.81*/.getName),format.raw/*38.89*/("""">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-3 control-label">Password:</label>
                        <div class="col-md-8">
                            <input class="form-control" type="password" value=""""),_display_(/*45.81*/user/*45.85*/.getPassword()),format.raw/*45.99*/("""">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-md-3 control-label"></label>
                        <div class="col-md-8">
                            <input type="button" class="btn btn-primary" value="Save Changes">
                            <span></span>
                            <input type="reset" class="btn btn-default" value="Cancel">
                        </div>
                    </div>

                </form>
        </div>
    <hr>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object myaccount extends myaccount_Scope0.myaccount
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 12:42:34 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/myaccount.scala.html
                  HASH: cb1e97d8018b0925e6c1c30e51441b8c8a71041b
                  MATRIX: 764->1|884->26|916->33|946->55|984->56|1020->66|1599->618|1640->650|1679->651|1725->669|1804->721|1818->726|1854->741|1900->759|1952->780|1998->798|2375->1148|2388->1152|2420->1163|2777->1493|2790->1497|2819->1505|3167->1826|3180->1830|3215->1844
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|62->31|62->31|62->31|69->38|69->38|69->38|76->45|76->45|76->45
                  -- GENERATED --
              */
          