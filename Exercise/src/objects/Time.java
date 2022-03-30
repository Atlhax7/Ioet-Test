/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author atlha
 */
public class Time {
    private String day;
    private Integer houri;
    private Integer mini;
    private Integer hourf;
    private Integer minf;

    
    public void setTime(String time)
    {
        try{
            String[] part = time.split("(?<=\\D)(?=\\d)");
            //this.day = time.split(time.split("?<=\\D)(?=\\d)")[0]);
            for(int i=0;i<part.length;i++)
            {
                switch(i)
                        {
                    case 0:
                        this.setDay(part[i]+"");
                        break;
                    case 1:
                        this.houri=Integer.parseInt(part[i].split(":")[0]);
                        break;
                    case 2:
                        this.mini=Integer.parseInt(part[i].split("-")[0]);
                        break;
                    case 3:
                        this.hourf=Integer.parseInt(part[i].split(":")[0]);
                        break;
                    case 4:
                        this.minf=Integer.parseInt(part[i].split("-")[0]);
                        break;
                    default:
                        break;
                }
            }
            //this.houri = Integer.parseInt(part[1].split(":")[0]);
            //this.minf = Integer.parseInt(part[2]);
//            Boolean valido = (
//                (this.houri >= 0) &&
//                (this.houri <= 23) &&
//                (this.mini >= 0) &&
//                (this.mini <= 59) 
//                );
//
//            if(valido){
//                return ;
//
//            }else{
//                this.houri = null;
//                this.mini = null;
//                this.hourf = null;
//                this.minf = null;
//                this.day = null;
//                return ;
//            }


        }catch(Exception e){
            System.out.println("Hay excepcion: "+e.getMessage());
            this.houri = null;
            this.mini = null;
            this.hourf = null;
            this.minf = null;
            this.day = null;

            return ;
        }
    }
    public boolean comapreTime(Time time)
    {
        String a,b;
        a=this.day.trim();
        b=time.day.trim();
        Boolean valido = (
       (this.houri == time.houri) &&
       (a.equals(b)) &&
       (this.hourf == time.hourf) &&
       (this.mini == time.mini) &&
       (this.minf == time.minf) 
       );
        if(valido)
            return valido;
        else
        {
            if(a.equals(b))
        {
            //mismo dia
            if(time.getHouri()<this.houri)
            {
                if(this.houri<time.hourf)
                    return true;
                else
                    return false;
            }
            else
            {
                if(time.getHouri()<this.hourf)
                    return true;
                else
                    return false;
            }
        }
            else
                return false;
        }
        
    }
    public Time() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getHouri() {
        return houri;
    }

    public void setHouri(Integer houri) {
        this.houri = houri;
    }

    public Integer getMini() {
        return mini;
    }

    public void setMini(Integer mini) {
        this.mini = mini;
    }

    public Integer getHourf() {
        return hourf;
    }

    public void setHourf(Integer hourf) {
        this.hourf = hourf;
    }

    public Integer getMinf() {
        return minf;
    }

    public void setMinf(Integer minf) {
        this.minf = minf;
    }

    @Override
    public String toString() {
        return "Horario " + "day= " + day + " " + houri + ":" + mini + "-" + hourf + ":" + minf ;
    }

    

    
    
}
