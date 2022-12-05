package controllers;

import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  
  public MainController() {
    this.mainFrame = new MainFrame();
  }

  public Double calcVolume(double radius, double height) {

    double volume = (
      (1.0 / 3.0) 
      * Math.pow(radius, 2) 
      * Math.PI 
      * height
    );
    return volume;
  }

  
}