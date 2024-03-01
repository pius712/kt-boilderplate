package com.pius.boilerplate.controller

import com.pius.boilerplate.controller.response.MemberResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.pius.boilerplate.core.application.MemberService
import com.pius.boilerplate.member.MemberEntity
import com.pius.boilerplate.support.response.ApiResponse

@RestController
@RequestMapping("/api/v1/member")
class MemberController(
    private val memberService: MemberService
) {


    @PostMapping("/create")
    fun create():Long {
        return memberService.save()
    }

    @GetMapping("/{memberId}")
    fun getMember(
        @PathVariable memberId: Long
    ):ApiResponse<MemberResponseDto>{
        val member =  memberService.find(memberId)
        return ApiResponse.ok(MemberResponseDto(member.name))
    }
}