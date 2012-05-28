var ioc = {
	$aop : {
		type : 'org.nutz.ioc.aop.config.impl.ComboAopConfigration',
        fields : {
        	aopConfigrations  : [
            	{	type : 'org.nutz.ioc.aop.config.impl.JsonAopConfigration',
                    fields : {
                    	itemList : [
                        	//['cn.esup.+','.+','ioc:log'],
                            ['cn.esup.+','.+','ioc:txREAD_COMMITTED']
                        ]
                     }
                 },
                 {	type : 'org.nutz.ioc.aop.config.impl.AnnotationAopConfigration'}
			]
        }
		
	},

	txNONE : {
		type : 'org.nutz.aop.interceptor.TransactionInterceptor',
		args : [0]
	},
	txREAD_UNCOMMITTED : {
		type : 'org.nutz.aop.interceptor.TransactionInterceptor',
		args : [1]
	},
	txREAD_COMMITTED : {
		type : 'org.nutz.aop.interceptor.TransactionInterceptor',
		args : [2]
	},
	txREPEATABLE_READ : {
		type : 'org.nutz.aop.interceptor.TransactionInterceptor',
		args : [4]
	},
	txSERIALIZABLE : {
		type : 'org.nutz.aop.interceptor.TransactionInterceptor',
		args : [8]
	},
    //澹版槑涓�釜log杩涜鏃ュ織璁板綍
	log : {
		type :'org.nutz.aop.interceptor.LoggingMethodInterceptor'
	}
};