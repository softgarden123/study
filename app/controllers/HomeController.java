package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render(""));
    }

    public Result hello(final Http.Request request) {
        Map<String, String[]> form = request.body().asFormUrlEncoded();
        return ok(form.get("name")[0]);
    }

}
