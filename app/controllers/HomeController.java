package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeController extends Controller {

    public List<String> list = new ArrayList<>();

    public Result index() {
        return ok(views.html.index.render(""));
    }

//    public Result test() { return ok(views.html.index.render("test")); }

    public Result test(final Http.Request request) {
        Map<String, String[]> form = request.body().asFormUrlEncoded();
        list.add(form.get("name")[0]);
        return ok(list.toString());
    }

}
