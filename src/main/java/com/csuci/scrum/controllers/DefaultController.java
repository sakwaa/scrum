package com.csuci.scrum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.csuci.scrum.models.*;

// Configure routes

/**
 *
 * @author sakwaa
 */
@Controller
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.put("msg", "Hello Spring 4 Web MVC!");
        return "index";
    }
    
    // Distance
    @RequestMapping(value = "/distance", method = RequestMethod.GET)
    public String distanceForm(Model model, Distance d) {
        d = new Distance();
        model.addAttribute("distance", d);
        return "distance";
    }

    @RequestMapping(value = "/distance", method = RequestMethod.POST)
    public String distanceSubmit(Distance d, Model model, ModelMap map) {
        d.distance();
        model.addAttribute("distance", d);
        return "distance";
    }
    
    // DCT
    @RequestMapping(value = "/distanceCannonT", method = RequestMethod.GET)
    public String dctForm(Model model, DistanceCannonT dct) {
        dct = new DistanceCannonT();
        model.addAttribute("distanceCannonT", dct);
        return "distanceCannonT";
    }

    @RequestMapping(value = "/distanceCannonT", method = RequestMethod.POST)
    public String dctSubmit(DistanceCannonT dct, Model model, ModelMap map) {
        dct.distanceCannonT();
        model.addAttribute("distanceCannonT", dct);
        return "distanceCannonT";
    }
    
    // DCX
    @RequestMapping(value = "/distanceCannonX", method = RequestMethod.GET)
    public String dcxForm(Model model, DistanceCannonX dcx) {
        dcx = new DistanceCannonX();
        model.addAttribute("distanceCannonX", dcx);
        return "distanceCannonX";
    }

    @RequestMapping(value = "/distanceCannonX", method = RequestMethod.POST)
    public String dcxSubmit(DistanceCannonX dcx, Model model, ModelMap map) {
        dcx.distanceCannonX();
        model.addAttribute("distanceCannonX", dcx);
        return "distanceCannonX";
    }
    
    // DCY
    @RequestMapping(value = "/distanceCannonY", method = RequestMethod.GET)
    public String dcyForm(Model model, DistanceCannonY dcy) {
        dcy = new DistanceCannonY();
        model.addAttribute("distanceCannonY", dcy);
        return "distanceCannonY";
    }

    @RequestMapping(value = "/distanceCannonY", method = RequestMethod.POST)
    public String dcySubmit(DistanceCannonY dcy, Model model, ModelMap map) {
        dcy.distanceCannonY();
        model.addAttribute("distanceCannonY", dcy);
        return "distanceCannonY";
    }
    
    // Force
    @RequestMapping(value = "/force", method = RequestMethod.GET)
    public String forceForm(Model model, Force force) {
        force = new Force();
        model.addAttribute("force", force);
        return "force";
    }

    @RequestMapping(value = "/force", method = RequestMethod.POST)
    public String forceSubmit(Force force, Model model, ModelMap map) {
        force.force();
        model.addAttribute("force", force);
        return "force";
    }
    
    // GravForce
    @RequestMapping(value = "/gravForce", method = RequestMethod.GET)
    public String gforceForm(Model model, GravForce gravforce) {
        gravforce = new GravForce();
        model.addAttribute("gravForce", gravforce);
        return "gravForce";
    }

    @RequestMapping(value = "/gravForce", method = RequestMethod.POST)
    public String gforceSubmit(GravForce gforce, Model model, ModelMap map) {
        gforce.gravForce();
        model.addAttribute("gravForce", gforce);
        return "gravForce";
    }
    
    // KineticEnergy
    @RequestMapping(value = "/kineticEnergy", method = RequestMethod.GET)
    public String keForm(Model model, KineticEnergy ke) {
        ke = new KineticEnergy();
        model.addAttribute("kineticEnergy", ke);
        return "kineticEnergy";
    }

    @RequestMapping(value = "/kineticEnergy", method = RequestMethod.POST)
    public String keSubmit(KineticEnergy ke, Model model, ModelMap map) {
        ke.kineticEnergy();
        model.addAttribute("kineticEnergy", ke);
        return "kineticEnergy";
    }
    
    // PotentialEnergy
    @RequestMapping(value = "/potentialEnergy", method = RequestMethod.GET)
    public String peForm(Model model, PotentialEnergy pe) {
        pe = new PotentialEnergy();
        model.addAttribute("potentialEnergy", pe);
        return "potentialEnergy";
    }

    @RequestMapping(value = "/potentialEnergy", method = RequestMethod.POST)
    public String peSubmit(PotentialEnergy pe, Model model, ModelMap map) {
        pe.potentialEnergy();
        model.addAttribute("potentialEnergy", pe);
        return "potentialEnergy";
    }
    
    // PotentialEnergyGrav
    @RequestMapping(value = "/potentialEnergyGrav", method = RequestMethod.GET)
    public String pegForm(Model model, PotentialEnergyGrav peg) {
        peg = new PotentialEnergyGrav();
        model.addAttribute("potentialEnergyGrav", peg);
        return "potentialEnergyGrav";
    }

    @RequestMapping(value = "/potentialEnergyGrav", method = RequestMethod.POST)
    public String pegSubmit(PotentialEnergyGrav peg, Model model, ModelMap map) {
        peg.potentialEnergyGrav();
        model.addAttribute("potentialEnergyGrav", peg);
        return "potentialEnergyGrav";
    }
    
    // Power
    @RequestMapping(value = "/power", method = RequestMethod.GET)
    public String powerForm(Model model, Power power) {
        power = new Power();
        model.addAttribute("power", power);
        return "power";
    }

    @RequestMapping(value = "/power", method = RequestMethod.POST)
    public String powerSubmit(Power power, Model model, ModelMap map) {
        power.power();
        model.addAttribute("power", power);
        return "power";
    }
    
    // PowerNoWork
    @RequestMapping(value = "/powerNoWork", method = RequestMethod.GET)
    public String pnwForm(Model model, PowerNoWork pnw) {
        pnw = new PowerNoWork();
        model.addAttribute("powerNoWork", pnw);
        return "powerNoWork";
    }

    @RequestMapping(value = "/powerNoWork", method = RequestMethod.POST)
    public String pnwSubmit(PowerNoWork pnw, Model model, ModelMap map) {
        pnw.powerNoWork();
        model.addAttribute("powerNoWork", pnw);
        return "powerNoWork";
    }
    
    // StraightEarthFallDistance
    @RequestMapping(value = "/straightEarthFallDistance", method = RequestMethod.GET)
    public String sefdForm(Model model, StraightEarthFallDistance sefd) {
        sefd = new StraightEarthFallDistance();
        model.addAttribute("straightEarthFallDistance", sefd);
        return "straightEarthFallDistance";
    }

    @RequestMapping(value = "/straightEarthFallDistance", method = RequestMethod.POST)
    public String sefdSubmit(StraightEarthFallDistance sefd, Model model, ModelMap map) {
        sefd.straightEarthFallDistance();
        model.addAttribute("straightEarthFallDistance", sefd);
        return "straightEarthFallDistance";
    }
    
    // StraightEarthFallTime
    @RequestMapping(value = "/straightEarthFallTime", method = RequestMethod.GET)
    public String seftForm(Model model, StraightEarthFallTime seft) {
        seft = new StraightEarthFallTime();
        model.addAttribute("straightEarthFallTime", seft);
        return "straightEarthFallTime";
    }

    @RequestMapping(value = "/straightEarthFallTime", method = RequestMethod.POST)
    public String sefdSubmit(StraightEarthFallTime seft, Model model, ModelMap map) {
        seft.straightEarthFallTime();
        model.addAttribute("straightEarthFallTime", seft);
        return "straightEarthFallTime";
    }

    // UniversalGravity
    @RequestMapping(value = "/universalGravity", method = RequestMethod.GET)
    public String ugForm(Model model, UniversalGravity ug) {
        ug = new UniversalGravity();
        model.addAttribute("universalGravity", ug);
        return "universalGravity";
    }

    @RequestMapping(value = "/universalGravity", method = RequestMethod.POST)
    public String ugSubmit(UniversalGravity universalGravity, Model model) {
        universalGravity.universalGrav();
        model.addAttribute("universalGravity", universalGravity);
        return "universalGravity";
    }

    // Work
    @RequestMapping(value = "/work", method = RequestMethod.GET)
    public String ugForm(Model model, Work work) {
        work = new Work();
        model.addAttribute("work", work);
        return "work";
    }

    @RequestMapping(value = "/work", method = RequestMethod.POST)
    public String ugSubmit(Work work, Model model, ModelMap map) {
        work.work();
        model.addAttribute("work", work);
        return "work";
    }

}
