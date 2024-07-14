package com.example.kotilnRestful.Service

import com.example.kotilnRestful.DTO.MemberDTO
import org.springframework.stereotype.Service


@Service
class MemberService {


    fun createMember(memberDTO: MemberDTO):MemberDTO{
        val memeber=Member(name=name,email=email)
        memberRepository.save(member)
        return MemberDTO.toDto(member)
    }

}