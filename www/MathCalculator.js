var exec = require('cordova/exec');

module.exports.substract = function (arg0, success, error) {
    exec(success, error, 'MathCalculator', 'substract', [arg0]);
};

module.exports.add = function (arg0, success, error) {
    exec(success, error, 'MathCalculator', 'add', [arg0]);
}

module.exports.multiply = function (arg0, success, error) {
    exec(success, error, 'MathCalculator', 'multiply', [arg0]);
}

module.exports.divide = function (arg0, success, error) {
    exec(success, error, 'MathCalculator', 'divide', [arg0]);
}