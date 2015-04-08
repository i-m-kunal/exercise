def d=new File('tempdir/4.txt');
 new File('tempdir/myfile.txt').eachLine{line,lineno->
                                         if(lineno%2==1)
                                        d<<lineno<<" "<<line <<'\n';
                                        }
 println "$d.text"
 
