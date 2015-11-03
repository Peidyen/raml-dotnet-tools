package com.onpositive.parse.client.security;

import com.onpositive.parse.client.executor.JavaExecutor;
import com.onpositive.parse.client.security.core.JavaApiSecurity;

public class SessionTokenSchema extends JavaApiSecurity{

    public SessionTokenSchema(JavaExecutor executor){
        super(executor);
    }


    private String schemaName = "sessionTokenSchema";


    public void setX_Parse_Application_Id(String paramValue){
        super.setValue("X-Parse-Application-Id", paramValue, this.schemaName);
    }

    public void setX_Parse_REST_API_Key(String paramValue){
        super.setValue("X-Parse-REST-API-Key", paramValue, this.schemaName);
    }

    public void setX_Parse_Session_Token(String paramValue){
        super.setValue("X-Parse-Session-Token", paramValue, this.schemaName);
    }

}