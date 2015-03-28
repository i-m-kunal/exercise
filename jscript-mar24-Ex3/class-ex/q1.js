/**
 * Created by ubuntu on 21/3/15.
 */

function getcdate()
{ var a= new Date();
return a;
}
function getformatdate()
{
    var d=new Date();
    var dt=d.getDate();
    var month=d.getMonth();
    var year=d.getFullYear();
    var hh= d.getHours();
    var mm= d.getMinutes();
    var ss= d.getSeconds();
    var monthh=new
    Array("January","February","March","April","May","June","July","August","September","October","November","December");
 var res=""+dt+" "+monthh[month]+", "+year+","+hh+":"+mm+":"+ss;
    return res;


}


