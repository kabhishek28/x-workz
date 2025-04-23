package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.implementation.CinemaTheatre;
import com.xworkz.Interfaceandimplementation.internal.rules.CensorBoard;

public class PVRTheatreCensorImpl {
   private CensorBoard censorBoard;

    public PVRTheatreCensorImpl(CensorBoard censorBoard) {
        this.censorBoard = censorBoard;
    }

    public void getCensor(){
       if(censorBoard != null){
           censorBoard.screenMovies();
       }else{
           System.out.println("censorBroad is null");
       }
   }

}
