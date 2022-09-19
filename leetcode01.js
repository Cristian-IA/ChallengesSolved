var updateMatrix = function(mat) {

  var knownZeros = [];
  
  for (var i = 0; i < mat.length; i++) {
    for (var j = 0; j < mat[i].length; j++) {
      if (mat[i][j] === 0) {
        knownZeros.push([i, j]);
      }
    }
  }

  for (var i = 0; i < mat.length; i++) {
    for (var j = 0; j < mat[i].length; j++) {
      if (mat[i][j] === 1) {
        
        var smallestDelta = null;
        
        for (var k = 0; k < knownZeros.length; k++) {
          var delta = Math.abs(i - knownZeros[k][0]) + Math.abs(j - knownZeros[k][1]);
          if (smallestDelta === null || delta < smallestDelta) {
            smallestDelta = delta;
          }
        }
        mat[i][j] = smallestDelta;
      }
    }
  }
  return mat;
};
