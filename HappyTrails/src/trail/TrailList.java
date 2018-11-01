package trail;

import java.util.List;

import trail.HappyTrails;



public class TrailList {

      private static final int g = 0;

      public HappyTrails first;

      public HappyTrails last;

      private Object landmarks;

      public TrailList(){

 

           first=null;

 

           last=null;

 

      }

 

      public void add(String name, int rating, double latitude, double longitude, String state, boolean havehiked, List<String> landmarks){

           name=name.toUpperCase();

           HappyTrails newone = new HappyTrails(name, rating, latitude, longitude, state, havehiked, landmarks);

           if(first==null){

                first=newone;

                last=newone;

                return;

           }

           HappyTrails current=first;

           HappyTrails previous=first;

           while(current.next!=null){

                 if(current.name.compareTo(newone.name)>0){

                      newone.next=current;

                      if(current!=first){

                           previous.next=newone;

                      }else{

                           first=newone;

                      }

                      return;

                }

                previous=current;

                current=current.next;

               

           }

            if(current.name.compareTo(newone.name)>0){

                newone.next=current;

                if(current!=first){

                      //System.out.println(previous.name+"scure");

                      previous.next=newone;

                }else{

                      first=newone;

                }

           }else{

                current.next=newone;

                last=newone;

           }

      };

 

      public void printlist(){

           HappyTrails current=first;

           while(current!=null){

                 System.out.println(current.name);

                current=current.next;

           }

      }

     

      public void remove(String name){

           name=name.toUpperCase();

           HappyTrails current=first;

           HappyTrails previous=first;

           while(current!= null){

                 if(current.name.compareTo(name)==0){

                      if(current==first){

                           first=current.next;

                           return;

                      }else{

                            previous.next=current.next;

                          

                           if(current==last){

                                 last=previous;

                           }

                           return;

                      }

                     

                }

                previous=current;

                current=current.next;

           }

           System.out.println("The trail does not exist in the system");

          

      };

     

      public void printbyrating(int rating){

           HappyTrails current=first;

           while(current!=null){

                if(current.rating>=rating){

                      System.out.println(current.name);

                }

                current=current.next;

           }

      }

     

      public void displaybystate(String state){

           HappyTrails current=first;

           while(current!=null){

                 if(current.state.compareTo(state)==0){

                      System.out.println(current.name);

                }

                current=current.next;

           }

      }

     

      public HappyTrails find(String name){

           name=name.toUpperCase();

           HappyTrails current=first;

           while(current!=null){

                 if(current.name.compareTo(name)==0){

                      return current;

                }

                current=current.next;

           }

           return null;

      }

     

      public double dist(double long1, double lat1, double long2, double lat2){

           double r= 3959;

           double delta=Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(Math.abs(long1-long2)));

           //double delta=(long1-long2)*(long1-long2)+(lat1-lat2)*(lat1-lat2);

           return r*delta;

      }

     

      public void displaynearest(String name){

           HappyTrails current=first;

           HappyTrails nearest=first;

           HappyTrails goal=find(name);

           double mindistance=dist(nearest.longitude, nearest.latitude, goal.longitude, goal.latitude);

           while(current!=null){

                if(current==goal){

                      current=current.next;

                      continue;

                }

                double distance=dist(current.longitude, current.latitude, goal.longitude, goal.latitude);

                if(distance<mindistance){

                      nearest=current;

                      mindistance=distance;

                }

                current=current.next;

           }

            System.out.println(nearest.name);

      }

     

 

      public void displaybylandmark(String place){

           HappyTrails current=first;

           while(current!=null){

                 if((current.land).contains(place)==true){

                      System.out.println(current.name);

                }

                current=current.next;

           }

          

          

      }

     

      public void displaynothiked(){

           HappyTrails current=first;

           while(current!=null){

                if(current.haveHiked==false){

                      System.out.println(current.name);

                }

                current=current.next;

           }

          

          

      }

}