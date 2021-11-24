const fs = require('fs');

if (!Date.now) {
    Date.now = function() { return new Date().getTime(); }
}

var result = [];
for(let i = 0; i < 60; i ++) {
    result[i] = 0;
    const start = Date.now();
    for(let j = 0; j < 5000; j ++) {
        fs.readFileSync('./test' + i, 'utf8')
    }
    result[i] = Date.now() - start;
}

console.log(JSON.stringify(result, undefined, 2));
