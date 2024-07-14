package com.example.kotilnRestful.DTO

import java.lang.reflect.Member

class MemberDTO (val id:Long?=0,val name:String,val email:String,val type:String="NORMAL") {
    companion object{
        fun toDto(entity:BaseMember):MemberDTO{
            val type=when(entity){
                is Member ->"NORMAL"
                is Author->"AUTHOR"
                else->"UNKNOWN"
            }
            return MemberDTO(entity.id,entity.name,entity.email,type)
        }
    }
}