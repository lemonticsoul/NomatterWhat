package com.example.kotilnRestful.Validator

import org.springframework.validation.Errors
import org.springframework.validation.Validator

class MemberValidator: Validator {
    override fun supports(clazz: Class<*>): Boolean {
        return CreateMemberRequest::class.java==clazz
    }

    override fun validate(target: Any, errors: Errors) {
        val createMemberRequest=target as CreateMemberRequest
        if (createMemberRequest.name.length >20){
            errors.rejectValue("MEMBER_NAME")
        }

        val emailRegex=Regex("^[a-ZA-Z0-9._%+-]")
        if (createMemberRequest.email ==""){
            errors.rejectValue()
        }
    }
}