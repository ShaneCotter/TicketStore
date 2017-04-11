
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*7.1*/("""
	"""),format.raw/*8.2*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Cart", user)/*9.20*/ {_display_(Seq[Any](format.raw/*9.22*/("""

	"""),format.raw/*11.2*/("""<!--..CONTENT..-->
	<div class="container-fluid" id="cartContent">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title">
							<div class="row">
								<div class="col-xs-6">
									<h5 id = iconCart><span class="glyphicon glyphicon-shopping-cart" id="iconCart"></span> Shopping Cart</h5>
								</div>
								<div class="col-xs-6">
									<a href=""""),_display_(/*23.20*/routes/*23.26*/.HomeController.events(0)),format.raw/*23.51*/("""">
										<button type="button" class="btn btn-success btn-sm btn-block">
											<span class="glyphicon glyphicon-share-alt"></span> Continue shopping
										</button></a>
								</div>
							</div>
						</div>
					</div>
					"""),_display_(/*31.7*/if(user.getBasket() == null)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
						"""),format.raw/*32.7*/("""<br>
						<h3>Cart is empty !</h3>
					""")))}),format.raw/*34.7*/("""

					"""),_display_(/*36.7*/if(user.getBasket() != null)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""
							"""),format.raw/*37.8*/("""<!-- Start of For loop - For each p in products add a row -->
						"""),_display_(/*38.8*/for(i <- user.getBasket().getBasketItems()) yield /*38.51*/ {_display_(Seq[Any](format.raw/*38.53*/("""


							"""),format.raw/*41.8*/("""<div class="panel-body">
								<div class="row">
									<div class="col-xs-2"><img class="img-responsive" src="http://placehold.it/100x70">
									</div>
									<div class="col-xs-4">
										<h4 class="product-name"><strong>"""),_display_(/*46.45*/i/*46.46*/.getTicket.getEvent.getEventName),format.raw/*46.78*/("""</strong></h4><h4><small>"""),_display_(/*46.104*/i/*46.105*/.getTicket.getTicketType),format.raw/*46.129*/("""</small></h4>
									</div>
									<div class="col-xs-6">
										<div class="col-xs-6 text-right">
											<h6><strong>&euro; """),_display_(/*50.32*/("%.2f".format(i.getPrice))),format.raw/*50.59*/(""" """),format.raw/*50.60*/("""<span class="text-muted">x</span></strong></h6>
										</div>
										<div class="col-xs-4">
											"""),_display_(/*53.13*/i/*53.14*/.getQuantity()),format.raw/*53.28*/("""
										"""),format.raw/*54.11*/("""<a href=""""),_display_(/*54.21*/routes/*54.27*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*54.59*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
										<a href=""""),_display_(/*55.21*/routes/*55.27*/.ShoppingCtrl.addOne(i.getId)),format.raw/*55.56*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
										</div>
										<div class="col-xs-2">
											<button type="button" class="btn btn-link btn-xs">
												<span class="glyphicon glyphicon-trash"> </span>
											</button>
										</div>
									</div>
								</div>
								<hr>

								<hr>
								""")))}),format.raw/*67.10*/("""

						"""),format.raw/*69.7*/("""<div class="row">
							<div class="text-center">
								<div class="col-xs-9">
									<h6 class="text-right">Empty cart</h6>
								</div>
								<div class="col-xs-3">
									<a href=""""),_display_(/*75.20*/routes/*75.26*/.ShoppingCtrl.emptyBasket()),format.raw/*75.53*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">Empty Cart</a>
								</div>
							</div>
						</div>
					</div>
					""")))}),format.raw/*80.7*/("""


					"""),format.raw/*83.6*/("""<div class="panel-footer">
						<div class="row text-center">
							<div class="col-xs-9">
								<h4 class="text-right"><strong>Total: &euro; """),_display_(/*86.55*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*86.101*/("""</strong></h4>
							</div>
							"""),_display_(/*88.9*/if(user.getBasket.getBasketTotal > 0)/*88.46*/{_display_(Seq[Any](format.raw/*88.47*/("""<div class="col-xs-3">
								<form action="/placeOrder" method="POST">
									<script
									src="https://checkout.stripe.com/checkout.js" class="stripe-button btn-success"
									data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
									data-amount=""""),_display_(/*93.24*/user/*93.28*/.getBasket.getStripeTotal),format.raw/*93.53*/(""""
									data-name="TC Events"
									data-description="Payment"
									data-email=""""),_display_(/*96.23*/user/*96.27*/.getEmail()),format.raw/*96.38*/(""""
									data-currency="EUR"
									data-image="http://cdn.wallpapersafari.com/62/83/v3qT9H.jpg"
									data-locale="auto"
									data-zip-code="false">
									</script>
								</form>
							</div>""")))}),format.raw/*103.15*/("""
"""),format.raw/*104.1*/("""</div>
</div>
</div>
</div>
</div>
</div>""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Tue Apr 11 14:24:04 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/cart.scala.html
                  HASH: 39af38d6dbde3605c28c640dded9f4a1e53b45fc
                  MATRIX: 754->1|973->26|1003->138|1032->141|1104->188|1130->206|1169->208|1201->213|1706->691|1721->697|1767->722|2043->972|2080->1000|2120->1002|2155->1010|2229->1054|2265->1064|2302->1092|2342->1094|2378->1103|2474->1173|2533->1216|2573->1218|2613->1231|2881->1472|2891->1473|2944->1505|2998->1531|3009->1532|3055->1556|3223->1697|3271->1724|3300->1725|3440->1838|3450->1839|3485->1853|3525->1865|3562->1875|3577->1881|3630->1913|3737->1993|3752->1999|3802->2028|4181->2376|4218->2386|4446->2587|4461->2593|4509->2620|4682->2763|4720->2774|4897->2924|4965->2970|5030->3009|5076->3046|5115->3047|5402->3307|5415->3311|5461->3336|5582->3430|5595->3434|5627->3445|5876->3662|5906->3664
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|41->11|53->23|53->23|53->23|61->31|61->31|61->31|62->32|64->34|66->36|66->36|66->36|67->37|68->38|68->38|68->38|71->41|76->46|76->46|76->46|76->46|76->46|76->46|80->50|80->50|80->50|83->53|83->53|83->53|84->54|84->54|84->54|84->54|85->55|85->55|85->55|97->67|99->69|105->75|105->75|105->75|110->80|113->83|116->86|116->86|118->88|118->88|118->88|123->93|123->93|123->93|126->96|126->96|126->96|133->103|134->104
                  -- GENERATED --
              */
          