var authJSON = {"moduleName":"客户管理模块","funGroup":[]};
moduleJSON.push(authJSON);

var customerFunGroup = {"funGroupName":"客户管理","fun":[]};
authJSON.funGroup.push(customerFunGroup);
var customerJson = {"id":"","name":"孙轶卓","englishName":"","gender":"1","mobilePhone":"13439962664","mobile_phone2":"","fixedPhone":"","birthday":"1984-05-25","nationalityName":"中国","provinceName":"北京","cityName":"北京","countyName":"朝阳区","homeAddress":"团结湖","professionName":"程序员","companyName":"博士山","companyAddress":"百花","positionName":"经理"};
customerFunGroup.fun.push({"funId":"customer.query","funName":"查询客户","funParam":{"url":"./crm/customer/query","data":{"pageIndex":"1","pageSize":"10","name":""}}});
customerFunGroup.fun.push({"funId":"customer.query.del","funName":"查询客户(无效)","funParam":{"url":"./crm/customer/query","data":{"pageIndex":"1","pageSize":"10","del_":"1"}}});
customerFunGroup.fun.push({"funId":"customer.get","funName":"获取客户","funParam":{"url":"./crm/customer/get","data":{"id":"1"}}});
customerFunGroup.fun.push({"funId":"customer.create","funName":"创建客户","funParam":{"url" : "./crm/customer/create","data" :customerJson}});
customerFunGroup.fun.push({"funId":"customer.update","funName":"修改客户","funParam":{"url":"./crm/customer/update","data":customerJson}});
customerFunGroup.fun.push({"funId":"customer.removeBatch","funName":"删除客户","funParam":{"url":"./crm/customer/removeBatch","data":{"ids":"1"}}});
customerFunGroup.fun.push({"funId":"customer.recoveryBatch","funName":"恢复客户","funParam":{"url":"./crm/customer/recoveryBatch","data":{"ids":"1"}}});