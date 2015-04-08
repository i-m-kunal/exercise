TargetFile=new File('tempdir/myfile.txt')
def fileclosure= {file->
   if(TargetFile.name!=file.name)
   {
  TargetFile << file.text;
  TargetFile<<"File name ${file.name} copied \n";
  }
}
new File('tempdir/').eachFile (fileclosure);
println "${TargetFile.text}" 
