/**
 * var 会提升变量，导致第一个输出为undefined.
 * 实际为：
 * var value;
 * console.log(value);
 * value = 'getValueByVar';
 * console.log(value);
 */
function getValueByVar() {
  console.log(value);
  var value = 'getValueByVar';
  console.log(value);
}
/**
 * let 不会变量提升，导致第一句就报错：value is not defined
 */
function getValueByLet() {
  console.log(value);
  let value = 'getValueByLet';
  console.log(value);

}
/**
 * const 描述常量的，并且不能被修改.
 * @type {string}
 */
const value = 'getValueByConst';
function getValueByConst() {
  console.log(value);
  // value=''; // 报错.

}