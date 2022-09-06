const fs = require('fs');
const path = require('path');
fs.writeFile(path.join(__dirname,'/trainingdetails','/students.txt')
,'shiva kumar'
,(err)=>{
    if(err) throw err;
    console.log('student name');
}
);

fs.readFile(path.join(__dirname,'/trainingdetails','/students.txt'),'utf8',(err,data)=>{


    if(err) throw err;
    console.log(data);
}
);