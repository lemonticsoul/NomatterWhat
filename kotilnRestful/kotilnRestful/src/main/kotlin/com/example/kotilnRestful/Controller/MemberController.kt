package com.example.kotilnRestful.Controller

import com.example.kotilnRestful.DTO.MemberDTO
import org.springframework.validation.BindException
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data calss CreateMemberRequests(
    @get:Size(min=1,max=20)
    @get:Email(message)
    val name:String,

    val email:String
){
    fun toMemberDTO(): MemberDTO
}

interface OnCreateError

@RequestMapping("/members")
@RestController
class MemberController(private val memberService:MemberService) {

    @PostMapping
    fun createMember(@Valid @RequestBody createMemberRequests:createMemberRequests) :MemberDTO{

        if (bindingResult.hasErros()){
            val errorMessage=bindingResult.allErros.joinToString
            throw IllegalArgumentException()
        }
        return memberService.createMember(createMemberRequests.toMemberDTO())
    }
}