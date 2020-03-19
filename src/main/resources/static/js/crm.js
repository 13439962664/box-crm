var authJSON = {"moduleName":"客户管理模块","funGroup":[]};
moduleJSON.push(authJSON);

var customerFunGroup = {"funGroupName":"客户管理","fun":[]};
authJSON.funGroup.push(customerFunGroup);
var customerJson = {"id":"","name":"孙轶卓","englishName":"","gender":"1","mobilePhone":"13439962664","mobile_phone2":"","fixedPhone":"","birthday":"1984-05-25","nationalityName":"中国","provinceName":"北京","cityName":"北京","countyName":"朝阳区","homeAddress":"团结湖","professionName":"程序员","companyName":"博士山","companyAddress":"百花","positionName":"经理"};
customerFunGroup.fun.push({"funId":"customer.page","funName":"查询客户","funParam":{"url":"./crm-customer-entity/page","data":{"page":"1","size":"10","name":""},"requestPattern":"RequestBody"}});
customerFunGroup.fun.push({"funId":"customer.info","funName":"获取客户","funParam":{"url":"./crm-customer-entity/info/{id}","data":{"id":"1"},"requestMethod":"get","requestPattern":"PathVariable"}});
customerFunGroup.fun.push({"funId":"customer.add","funName":"创建客户","funParam":{"url" : "./crm-customer-entity/add","data" :customerJson,"requestPattern":"RequestBody"}});
customerFunGroup.fun.push({"funId":"customer.modify","funName":"修改客户","funParam":{"url":"./crm-customer-entity/modify","data":customerJson,"requestPattern":"RequestBody"}});
customerFunGroup.fun.push({"funId":"customer.remove","funName":"删除客户(单个)","funParam":{"url":"./crm-customer-entity/remove/{id}","data":{"id":"1"},"requestMethod":"get","requestPattern":"PathVariable"}});
customerFunGroup.fun.push({"funId":"customer.removes","funName":"删除客户(多个)","funParam":{"url":"./crm-customer-entity/removes","data":[1],"requestPattern":"RequestBody"}});

var companyFunGroup = {"funGroupName":"企业管理","fun":[]};
authJSON.funGroup.push(companyFunGroup);
var companyJson = {"id":"","name":"浩程教育","address":"朝阳区团结湖","nationalityName":"中国","provinceName":"北京","cityName":"","北京":"","countyName":"朝阳区"};
companyFunGroup.fun.push({"funId":"company.page","funName":"查询企业","funParam":{"url":"./crm-company-entity/page","data":{"page":"1","size":"10"},"requestPattern":"RequestBody"}});
companyFunGroup.fun.push({"funId":"company.info","funName":"获取企业","funParam":{"url":"./crm-company-entity/info/{id}","data":{"id":"1"},"requestMethod":"get","requestPattern":"PathVariable"}});
companyFunGroup.fun.push({"funId":"company.add","funName":"创建企业","funParam":{"url" : "./crm-company-entity/add","data" :companyJson,"requestPattern":"RequestBody"}});
companyFunGroup.fun.push({"funId":"company.modify","funName":"修改企业","funParam":{"url":"./crm-company-entity/modify","data":companyJson,"requestPattern":"RequestBody"}});
companyFunGroup.fun.push({"funId":"company.remove","funName":"删除企业(单个)","funParam":{"url":"./crm-company-entity/remove/{id}","data":{"id":"1"},"requestMethod":"get","requestPattern":"PathVariable"}});
companyFunGroup.fun.push({"funId":"company.removes","funName":"删除企业(多个)","funParam":{"url":"./crm-company-entity/removes","data":[1],"requestPattern":"RequestBody"}});