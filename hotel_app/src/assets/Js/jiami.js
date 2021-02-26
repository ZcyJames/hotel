'use strict'

import cryptoJs from 'crypto-js'
/*工具类 js文件
* 在其中 设计密钥值
* 与加密解密方法过程规则
* 暴露导出 加密函数与解密函数 */
let keyOne='313233343536373a'

export default {
// 加密函數
    jiami (word) {
        /*密钥字符串长度 一定为8的倍数 不然无法加解密 返回空值*/
        let key = cryptoJs.enc.Hex.parse(keyOne)
        let enc = ''
        /*加密的原文信息 只能为String或Object数据类型*/
        if (typeof word === 'string') {
            enc = cryptoJs.AES.encrypt(word, key, {
                // iv: iv
                mode: cryptoJs.mode.ECB,
                padding: cryptoJs.pad.Pkcs7
            })
        } else if (typeof word === 'object') {
            let data = JSON.stringify(word)
            enc = cryptoJs.AES.encrypt(data, key, {
                // iv: iv
                mode: cryptoJs.mode.ECB,
                padding: cryptoJs.pad.Pkcs7
            })
        }
        let encResult = enc.ciphertext.toString()
        return encResult
    },
    // 解密函數
    jiemi (word) {
        /*在未登录的情况下 不需要前端信息解密*/
        if(word===null || word===''){
            return null;
        }else{
            let key = cryptoJs.enc.Hex.parse(keyOne)
            let dec = cryptoJs.AES.decrypt(cryptoJs.format.Hex.parse(word), key, {
                // vi: vi
                mode: cryptoJs.mode.ECB,
                padding: cryptoJs.pad.Pkcs7
            })
            let decData = cryptoJs.enc.Utf8.stringify(dec)
            return decData
        }
    }
}