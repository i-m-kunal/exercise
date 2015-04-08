def d=new File('tempdir/4.txt');
new File('tempdir/myfile.txt').text.tokenize(" \t\n").each{ d<<it;};
println "$d.text";
