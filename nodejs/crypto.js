const crypto = require('crypto');

const password ='passowrd';

// [v4.2.3]
// 91583dac4a1574f0fba6a71decb149101b9ed67402b84f1bcfbf529a742948e4381960ec0071
// 5b6b7c6aa721b811a703fc8b13ebc3d3f90641e00848ef06e080
const sha512 = crypto.createHash('sha512');
sha512.update(password);
sha512.digest('hex');
