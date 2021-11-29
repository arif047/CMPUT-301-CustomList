package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.list;
/**
*this is a class that keep track of a list of city objects
*/
public class CityList{
  private List<City> cities =new ArrayList();
  /**
  *this adds a city to the list if the city doesn't exist
  *@param city
  *this is a candidate city to add
  */
  public void add(City city){
    if(cities.contains(city)){
      throw new IllegalArgumentException();
    }
    cities.add(city);
  }
   /**
  *this returns a sorted list of cities
  *@return
  *Return the sorted list
  */ 
  public List<City> getCities(){
    List<City> list=cities;
    Collections.sort(list);
    return list;
  }

  /**
  *this removes a city to the list if the city exist
  *@remove city
  *this is a city to remove
  */
  public void Remove(City city){
    if(cities.contains(city)){
       cities.remove(city);
    }
    else{
      throw new IllegalArgumentException();
    }
  }
  /**
  *this rerturns a city the size of the citylist
  *@return size of citylist
  */
  public void getSizeOfCities(){
    int siz;
    siz=cities.size();
    return siz;
  }
}

